package user;

import com.smartenv.grpc.User.APIResponse;
import com.smartenv.grpc.User.Empty;
import com.smartenv.grpc.User.LoginRequest;
import com.smartenv.grpc.userGrpc.userImplBase;

import io.grpc.ServerServiceDefinition;
import io.grpc.stub.StreamObserver;

public class UserService extends userImplBase {

	@Override
	public void login(LoginRequest request, StreamObserver<APIResponse> responseObserver) {
		System.out.println("Inside Login");
		String username = request.getUsername();
		String password = request.getPassword();
		
		APIResponse.Builder response = APIResponse.newBuilder();
		if(username.equals(password)) {
			//return success mes.
			response.setResponseCode(0).setResponsemessage("Success");
		}
		else {
			//return failure mes.
			response.setResponseCode(100).setResponsemessage("Invalid credentials");
		
		}
		
		responseObserver.onNext(response.build());
		responseObserver.onCompleted();
	}

	@Override
	public void logout(Empty request, StreamObserver<APIResponse> responseObserver) {
		
	}

/*	public ServerServiceDefinition build() {
		// TODO Auto-generated method stub
		return null;
	}
	*/
}