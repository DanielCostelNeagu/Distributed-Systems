package databaseService;

import java.io.IOException;

import databaseService.generated.DataBaseServiceGrpc;
import databaseService.generated.RequestMessage;
import databaseService.generated.ResponseMessage;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import userService.UserService;
import vmService.generated.ResponseStatus;
import vmService.generated.Status;

import java.net.InetAddress;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;

//import org.junit.Before;
//import org.junit.Test;

/**
 * @author Daniel x17128463
 *
 */

public class DataBaseService extends DataBaseServiceGrpc.DataBaseServiceImplBase implements ServiceListener {

    HashMap<String, String> tables = new HashMap<>();

    @Override
    public void serviceAdded(ServiceEvent serviceEvent) {
        System.out.println("Service added: " + serviceEvent.getInfo());
    }

    @Override
    public void serviceRemoved(ServiceEvent serviceEvent) {
        System.out.println("Service removed: " + serviceEvent.getInfo());
    }

    @Override
    public void serviceResolved(ServiceEvent serviceEvent) {
        System.out.println("Service resolved: " + serviceEvent.getInfo());
    }


    /**
     * @param args
     */
    public static void main(String[] args) {

        int port = 9093;
        try {


            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

            // Register a service
            ServiceInfo serviceInfo = ServiceInfo.create("_http._tcp.local.", "database", port, "DataBaseService Server will give you the file");
            jmdns.registerService(serviceInfo);

            Server server = ServerBuilder.forPort(port)
                    .addService(new DataBaseService())
                    .build()
                    .start();

            jmdns.addServiceListener("_http._tcp.local.", new DataBaseService());

            System.out.println("Starting the Database Server with Port:" + server.getPort());
            server.awaitTermination();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void dataBaseDo(
            RequestMessage request,
            StreamObserver<ResponseMessage> responseObserver) {


        tables.put("Customers", "Profile");
        tables.put("Virtual Machines", "Name");
        tables.put("Business Unit", "Accountancy");


		System.out.println("Inside DBService: Adding new columns and rows");


		//prepare the value to be set back
		String newColumn= request.getColumn();
		String newRow= request.getRow();


        tables.put(newColumn, newRow);


        Iterator iterator = tables.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry me2 = (Map.Entry) iterator.next();

            responseObserver.onNext(
                    ResponseMessage.newBuilder()
                            .setColumn("Key: "+me2.getKey())
                            .setRow("Value: " + me2.getValue())
                            .build()
            );


            System.out.println("Key: "+me2.getKey() + " & Value: " + me2.getValue());
        }

		responseObserver.onCompleted();
    }





    /*public static class File {

        public int getFile(final File file) throws FileNotFoundException {
            return getFile(new BufferedReader(new FileReader(file)));
        }

        public int getFile(final BufferedReader reader) {
            int file = 0;
            try {
                String line;
                while ((line = reader.readLine()) != null) {
                    file += line.trim().split(" ").length;
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (reader != null) {
                        reader.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return file;
        }
    }
	 private static String TEST_CONTENT = "Far far away, behind the word mountains, far from the countries Vokalia and Consonantia,\n"
             +" there live the blind texts. Separated they live in Bookmarksgrove right at the coast of\n"
				+"the Semantics, a large language ocean.";

	private FileCounter fileCounter;

	@Before
	public void setUp() {
	fileCounter = new FileCounter();
	}

	@Test
	public void ensureExpectedFileIsReturned() {
	assertEquals(14, fileCounter.getFile(new BufferedReader(new StringReader(TEST_CONTENT))));
	}
	*/


//
//	@Override
//	public void dataBaseDo(RequestMessage request, StreamObserver<ResponseMessage> responseObserver) {
//		System.out.println("Inside DBService:");
//		//prepare the value to be set back
//		int length = request.getText().length();
//
//		//preparing the response message
//		ResponseMessage reply = ResponseMessage.newBuilder().setLength(length).build();
//
//		responseObserver.onNext( reply );
//
//		responseObserver.onCompleted();
//	}

}//class
