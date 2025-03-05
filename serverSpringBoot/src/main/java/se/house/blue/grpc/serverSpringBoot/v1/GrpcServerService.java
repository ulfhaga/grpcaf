package se.house.blue.grpc.serverSpringBoot.v1;

import com.baeldung.grpc.v1.HelloRequest;
import com.baeldung.grpc.v1.HelloResponse;
import com.baeldung.grpc.v1.HelloServiceGrpc;
import io.grpc.stub.StreamObserver;
import org.springframework.stereotype.Service;


@Service
public class GrpcServerService extends HelloServiceGrpc.HelloServiceImplBase {

    @Override
    public void hello(
            HelloRequest request, StreamObserver<HelloResponse> responseObserver) {

        String greeting = new StringBuilder()
                .append("Hello, ")
                .append(request.getFirstName())
                .append(" ")
                .append(request.getLastName())
                .toString();

        HelloResponse response = HelloResponse.newBuilder()
                .setGreeting(greeting)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

}