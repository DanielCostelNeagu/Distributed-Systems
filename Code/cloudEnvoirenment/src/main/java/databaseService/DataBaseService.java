package databaseService;

import java.io.IOException;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.ServerServiceDefinition;
import io.grpc.stub.StreamObserver;
import databaseService.DataBaseServiceGrpc.DataBaseServiceImplBase;

/**
 * @author Daniel x17128463
 *
 */

public class DataBaseService extends DataBaseServiceImplBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataBaseService dbServer = new DataBaseService();

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
		}
	}


/*	@Override
	public void DataBaseService(RequestMessage request, StreamObserver<ResponseMessage> responseObserver) {
		System.out.println("Inside DBService:");
		//prepare the value to be set back
		int length = request.getText().length();
		
		//preparing the response message
		ResponseMessage reply = ResponseMessage.newBuilder().setLength(length).build();

		responseObserver.onNext( reply ); 

		responseObserver.onCompleted();
	}*/

}
