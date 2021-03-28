package userService;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import userService.generated.*;
import vmService.VMServices;
import vmService.generated.ResponseMessage;

import java.net.InetAddress;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;

/**
 * @author Daniel x17128463
 */

public class UserService extends UserServiceGrpc.UserServiceImplBase implements ServiceListener {


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

        int port = 9092;
        try {


            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

            // Register a service
            ServiceInfo serviceInfo = ServiceInfo.create("_http._tcp.local.", "userServer", port, "UserService Server will sign you in");
            jmdns.registerService(serviceInfo);

            Server server = ServerBuilder.forPort(port)
                    .addService(new UserService())
                    .build()
                    .start();

            jmdns.addServiceListener("_http._tcp.local.", new UserService());

            System.out.println("Starting the UserService Server with Port:" + server.getPort());
            server.awaitTermination();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void login(LoginRequest request, StreamObserver<LoginResponse> responseObserver) {

        System.out.println("Inside UserService::Login()");
        String userName = request.getUserName();
        String password = request.getPassword();

        LoginResponse res;
        if (userName.equals("Daniel") && password.equals("Dublin")) {
            res = LoginResponse.newBuilder()
                    .setResponseCode(200)
                    .setResponseMessage(userName + ".....Successfully logged in")
                    .build();
        } else {
            res = LoginResponse.newBuilder()
                    .setResponseCode(401)
                    .setResponseMessage(userName + "... Sorry Login Failed")
                    .build();
            // return Success response
        }

        responseObserver.onNext(res);
        responseObserver.onCompleted();
    }

    @Override
    public void logout(Empty request, StreamObserver<LogoutResponse> responseObserver) {

        System.out.println("Inside UserService::Logout()");

        LogoutResponse res = LogoutResponse.newBuilder()
                .setResponseCode(200)
                .setResponseMessage(".....Successfully logged out")
                .build();

        responseObserver.onNext(res);
        responseObserver.onCompleted();
    }
}
