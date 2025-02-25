package se.arbetsformedlingen.historia;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class GrpcServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("GrpcServer!");

        Server server = ServerBuilder
                .forPort(8080)
                .addService(new HelloServiceImpl()).build();

        server.start();
        server.awaitTermination();
        }
}