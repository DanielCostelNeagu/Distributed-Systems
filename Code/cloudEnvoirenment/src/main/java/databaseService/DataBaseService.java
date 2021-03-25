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
