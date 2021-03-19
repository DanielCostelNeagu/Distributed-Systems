/*
package GRPCClient;
import com.smartenv.grpc.User.APIResponse;
import com.smartenv.grpc.User.LoginRequest;
import com.smartenv.grpc.userGrpc;
import com.smartenv.grpc.userGrpc.userBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;


public class gRPCClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();
		
		//stubs- generate from protofile
		userBlockingStub userStub = userGrpc.newBlockingStub(channel);
		
		LoginRequest loginrequest = LoginRequest.newBuilder().setUsername("DAN").setPassword("DAN").build();
		APIResponse response = userStub.login(loginrequest);
		System.out.println(response.getResponsemessage());
		
		// userStub.logout(request);
		//System.out.println(response.getResponsemessage());
		
	}

}
*/