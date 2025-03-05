package se.house.blue.grpc.serverSpringBoot;


import io.grpc.Server;
import io.grpc.ServerBuilder;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class SchedulerBootstrap  {

    @PostConstruct
    public void init() {
        Server server = ServerBuilder.forPort(64001).addService(new se.house.blue.grpc.serverSpringBoot.v1.GrpcServerService()).
                addService(new se.house.blue.grpc.serverSpringBoot.v2.GrpcServerService()).build();
        try {
            System.out.println("Starting gRPC server on Spring boot");
            server.start();
            server.awaitTermination();
        } catch (InterruptedException | IOException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }


}
