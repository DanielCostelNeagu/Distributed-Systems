/**
 * 
 */
package vmService;


import java.io.IOException;
import io.grpc.stub.StreamObserver;
import vmService.VMServicesGrpc.VMServicesImplBase;
import java.net.InetAddress;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import databaseService.RequestMessage;
import databaseService.ResponseMessage;


/**
 * @author Daniel x17128463
 *
 */


public class VMServices extends VMServicesImplBase {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int port = 9092;
		 try {
	        JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

	        // Register a service
	        ServiceInfo serviceInfo = ServiceInfo.create("_http._tcp.local.", "vmService", port, "VMServices Server will give you Compute, Storage or General Purpose services.");
	        jmdns.registerService(serviceInfo);
	        System.out.println("Starting the VM Server ");

	        // Wait a bit
           Thread.sleep(25000);

           // Unregister all services
           jmdns.unregisterAllServices();

	        } 
		 	catch (IOException e) {
	            System.out.println(e.getMessage());
	        }
	}//main
	
	public void vmServicesDo(RequestMessage request, StreamObserver<ResponseMessage> responseObserver) {
		System.out.println("Inside vmServices:");
		//prepare the value to be set back
		int length = request.getText().length();
		
		//preparing the response message
		ResponseMessage reply = ResponseMessage.newBuilder().setLength(length).build(); 

		responseObserver.onNext( reply ); 

		responseObserver.onCompleted();
	}

}//class
