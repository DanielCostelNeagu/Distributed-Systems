package databaseService;

import java.io.IOException;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.ServerServiceDefinition;
import io.grpc.stub.StreamObserver;
import databaseService.DataBaseServiceGrpc.DataBaseServiceImplBase;

import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

//import org.junit.Before;
//import org.junit.Test;

/**
 * @author Daniel x17128463
 *
 */

public class DataBaseService extends DataBaseServiceImplBase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	/*	DataBaseService dbServer = new DataBaseService();

		int port = 50052;

		try {
			Server server = ServerBuilder.forPort(port)
					.addService(dbServer)
					.build()
					.start();

			System.out.println("Database Server started on Port:" + server.getPort());
		    server.awaitTermination();

		}//try
		catch(IOException e){
			e.printStackTrace();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}	*/
		
		 int port = 9091;
		 try {
	        JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

	        // Register a service
	        ServiceInfo serviceInfo = ServiceInfo.create("_http._tcp.local.", "database", port, "DataBaseService Server will give you the file");
	        jmdns.registerService(serviceInfo);
	        System.out.println("Starting the Database Server ");

	        // Wait a bit
            Thread.sleep(25000);

            // Unregister all services
            jmdns.unregisterAllServices();

	        } 
		 	catch (IOException e) {
	            System.out.println(e.getMessage());
	        }
	      
		
	}//main
	
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



	@Override
	public void dataBaseDo(RequestMessage request, StreamObserver<ResponseMessage> responseObserver) {
		System.out.println("Inside DBService:");
		//prepare the value to be set back
		int length = request.getText().length();
		
		//preparing the response message
		ResponseMessage reply = ResponseMessage.newBuilder().setLength(length).build(); 

		responseObserver.onNext( reply ); 

		responseObserver.onCompleted();
	}

}//class
