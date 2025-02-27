package se.arbetsformedlingen.historia;

import com.baeldung.grpc.v2.HelloRequest;
import com.baeldung.grpc.v2.HelloResponse;
import com.baeldung.grpc.v2.HelloServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClient {
    public static void main(String[] args) {

        System.out.println("GrpcClient!");

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 64001)
                .usePlaintext()
                .build();

        HelloServiceGrpc.HelloServiceBlockingStub stub
                = HelloServiceGrpc.newBlockingStub(channel);

        HelloResponse helloResponse = stub.hello(HelloRequest.newBuilder()
                .setFirstName("John")
                .setLastName("Wick").setSex("Man")
                .build());

        String message = helloResponse.getGreeting();
        System.out.println(message);
        channel.shutdown();
    }
}