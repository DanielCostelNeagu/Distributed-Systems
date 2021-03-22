package user;

import com.smartenv.grpc.User.APIResponse;
import com.smartenv.grpc.User.Empty;
import com.smartenv.grpc.User.LoginRequest;
import com.smartenv.grpc.userGrpc.userImplBase;
import com.smartenv.grpc.User.LogoutRequest;
import io.grpc.ServerServiceDefinition;
import io.grpc.stub.StreamObserver;

public class UserService extends userImplBase {

	@Override
	public void login(LoginRequest request, StreamObserver<APIResponse> responseObserver) {
		System.out.println("Inside Login via gRPCService");
		String username = request.getUsername();
		String password = request.getPassword();
		
		APIResponse.Builder response = APIResponse.newBuilder();
		System.out.println("Logging In username = " + username);
		
		if(username.equals(password)) {
			//return success mes.
			response.setResponseCode(0).setResponsemessage("Success you are logged in: "+username);
		}
		else {
			//return failure mes.
			response.setResponseCode(100).setResponsemessage("Invalid credentials");
		
		}
		
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}

	@Override
	public void logout(LogoutRequest request, StreamObserver<APIResponse> responseObserver) {
		System.out.println("Inside Logout via gRPCService");
		String username = request.getUsername();

		APIResponse.Builder response = APIResponse.newBuilder();
		System.out.println("Logging Out username = " + username);

		if(username.equals(username)) {
			// return Success response
			response.setResponseCode(0).setResponsemessage(username + ".....Successfully logged out");
		}
		else {
			// return Faield response
			response.setResponseCode(100).setResponsemessage(username +
					"... Sorry Logout Failed, user not logged in: " + username);
		}

		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	
	}

/*	public ServerServiceDefinition build() {
		// TODO Auto-generated method stub
		return null;
	}
	*/
}