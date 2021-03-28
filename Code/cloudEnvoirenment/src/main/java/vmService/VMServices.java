/**
 *
 */
package vmService;


import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import vmService.generated.*;

import java.net.InetAddress;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;


/**
 * @author Daniel x17128463
 *
 */


public class VMServices extends VMServicesGrpc.VMServicesImplBase implements ServiceListener {

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

        int port = 9091;
        try {


            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

            // Register a service
            ServiceInfo serviceInfo = ServiceInfo.create("_http._tcp.local.", "vmService", port, "VMServices Server will give you Compute, Storage or General Purpose services.");
            jmdns.registerService(serviceInfo);

            Server server = ServerBuilder.forPort(port)
                    .addService(new VMServices())
                    .build()
                    .start();

            jmdns.addServiceListener("_http._tcp.local.", new VMServices());


            System.out.println("Starting the VM Server with Port:" + server.getPort());
            server.awaitTermination();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }


    }

    @Override
    public void vmServicesDo(RequestMessage request, StreamObserver<ResponseMessage> responseObserver) {

        String req = request.getText();


        int length = req.length();

        ResponseMessage res = ResponseMessage.newBuilder()
                .setLength(length)
                .build();

        responseObserver.onNext(res);

        responseObserver.onCompleted();

    }

    @Override
    public void vmServicesBroadcastStatus(RequestStatus request, StreamObserver<ResponseStatus> responseObserver) {

        System.out.println("Sending status");
        int status = 0;
        while (status < 100) {

            boolean internetConnection = true;
            if (status > 70) internetConnection = false;

            Status VMstatus = Status.newBuilder()
                    .setHealthy(1)
                    .setOnOrOff(true)
                    .setInternetConnection(internetConnection)
                    .build();

            responseObserver.onNext(
                    ResponseStatus.newBuilder()
                            .setResult(VMstatus).build()
            );
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            status++;
        }
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<RequestDeployCode> vmServicesDeployCode(StreamObserver<ResponseDeployCode> responseObserver) {

        StreamObserver<RequestDeployCode> requestObs = new StreamObserver<RequestDeployCode>() {

            int percentage = 0;
            @Override
            public void onNext(RequestDeployCode requestDeployCode) {

                String codeLine = requestDeployCode.getCodeText();

                percentage++;



                ResponseDeployCode res = ResponseDeployCode.newBuilder()
                        .setDeploymentPercentage(percentage)
                        .build();

                System.out.println(percentage);
                responseObserver.onNext(res);
            }

            @Override
            public void onError(Throwable throwable) {
                throwable.getStackTrace();
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };

        return requestObs;
    }

    @Override
    public StreamObserver<RequestDeployDatabase> vmServicesDeployDatabase(StreamObserver<ResponseDeployDatabase> responseObserver) {

        StreamObserver<RequestDeployDatabase> requestObs = new StreamObserver<RequestDeployDatabase>() {

            @Override
            public void onNext(RequestDeployDatabase requestDeployCode) {

                System.out.println(requestDeployCode.getDatabaseTables());

            }

            @Override
            public void onError(Throwable throwable) {
                throwable.getStackTrace();
            }

            @Override
            public void onCompleted() {
                responseObserver.onNext(
                        ResponseDeployDatabase.newBuilder()
                                .setResult("Database deployed succesfully").build()
                );

                responseObserver.onCompleted();
            }
        };

        return requestObs;

    }
}
