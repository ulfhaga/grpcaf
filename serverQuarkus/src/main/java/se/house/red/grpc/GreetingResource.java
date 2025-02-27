package se.house.red.grpc;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.io.IOException;

@Path("/hello")
public class GreetingResource {
    static boolean kor  = true;
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() throws InterruptedException, IOException {
        System.out.println("GrpcServer!");
        return "Hello from Quarkus GrpcServer";
    }
}
