package GRPCLoginServer;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import user.UserService;

public class gRPCServerLogin {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.out.println("Starting gRPC Login Server");
		
		try {
		Server server = ServerBuilder.forPort(9091).addService(new UserService()).build();
		server.start();
		
		System.out.println("Server started on Port: "+server.getPort());
		server.awaitTermination();
		}//try
		catch(IOException e){
			e.printStackTrace();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}