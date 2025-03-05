package se.house.blue.grpc.clientSpringBoot.rest;

import com.baeldung.grpc.v1.HelloRequest;
import com.baeldung.grpc.v1.HelloResponse;
import com.baeldung.grpc.v1.HelloServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "")
public class WebRestfulKontroller {

    @GetMapping("/start")
    public ResponseEntity<String> anropaGrpcServer() {

        System.out.println("SpringBoot GrpcClient!");

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 64001)
                .usePlaintext()
                .build();

        HelloServiceGrpc.HelloServiceBlockingStub stub
                = HelloServiceGrpc.newBlockingStub(channel);

        HelloResponse helloResponse = stub.hello(HelloRequest.newBuilder()
                .setFirstName("John")
                .setLastName("Wick")
                .build());
        String message = helloResponse.getGreeting();
        System.out.println(message);
        channel.shutdown();
        return ResponseEntity.ok(message);
    }
}
