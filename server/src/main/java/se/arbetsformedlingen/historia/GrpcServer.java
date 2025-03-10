package se.arbetsformedlingen.historia;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GrpcServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Starting simple gRPC server");
        Server server = ServerBuilder
                .forPort(64001)
                .addService(new se.arbetsformedlingen.historia.v1.HelloServiceImpl())
                .addService(new se.arbetsformedlingen.historia.v2.HelloServiceImpl())
                .build();
        server.start();
        server.awaitTermination();
    }
}