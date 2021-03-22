package userService;

import java.io.IOException;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.ServerServiceDefinition;
import io.grpc.stub.StreamObserver;
import userService.UserServiceGrpc.UserServiceImplBase;

public class UserService extends UserServiceImplBase {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Starting gRPC Server");
		UserService userserver = new UserService();

		int port = 50051;

		try {
			Server server = ServerBuilder.forPort(port)
					.addService(userserver)
					.build()
					.start();

			System.out.println("Server started with Port:" + server.getPort());
		    server.awaitTermination();

		}//try
		catch(IOException e){
			e.printStackTrace();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}

	}//main

	@Override
	public void login(LoginRequest request, StreamObserver<LoginResponse> responseObserver) {
		System.out.println("Inside UserService::Login()");
		String userName = request.getUserName();
		String password = request.getPassword();

		LoginResponse.Builder response = LoginResponse.newBuilder();
		System.out.println("userName = " + userName + ", password = " + password);

		if(userName.equals("Daniel") && password.equals("Dublin")) {
			// return Success response
			response.setResponseCode(1).setResponseMessage(userName + ".....Successfully logged in");
		}
		else {
			// return Success response
			response.setResponseCode(99).setResponseMessage(userName + "... Sorry Login Failed");
		}

		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}




	@Override
	public void logout(LogoutRequest request, StreamObserver<LogoutResponse> responseObserver) {
		System.out.println("Inside UserService::Logout()");
		String userName = request.getUserName();

		LogoutResponse.Builder response = LogoutResponse.newBuilder();
		System.out.println("Logging out userName = " + userName);

		if(userName.equals("Daniel")) {
			// return Success response
			response.setResponseCode(1).setResponseMessage(userName + ".....Successfully logged out");
		}
		else {
			// return Success response
			response.setResponseCode(99).setResponseMessage(userName +
					"... Sorry Logout Failed, user not logged in: " + userName);
		}

		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}

}//class