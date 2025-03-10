package se.house.red.grpc;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.quarkus.runtime.Startup;
import jakarta.enterprise.context.ApplicationScoped;

import java.io.IOException;

@ApplicationScoped
public class StartupBean {

    @Startup
    void init() {
        Server server = ServerBuilder.forPort(64001).addService(new se.house.red.grpc.v1.HelloServiceImpl()).addService(new se.house.red.grpc.v2.HelloServiceImpl()).build();
        try {
            System.out.println("Starting gRPC server on Quarkus");
            server.start();
            server.awaitTermination();
        } catch (InterruptedException | IOException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }

}
