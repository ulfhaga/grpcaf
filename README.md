# GRPC

A high performance, open source universal RPC framework.

## Build

    mvn install -f kontrakt/pom.xml
    mvn package -f klient/pom.xml
    mvn package -f server/pom.xml

## RUN

    java -jar server/target/server-1.0-SNAPSHOT.jar
    java -jar klient/target/klient-1.0-SNAPSHOT.jar 

## Relevant Articles

- [grpc](https://grpc.io/)
- [Introduction to gRPC](https://www.baeldung.com/grpc-introduction)
- [Streaming with gRPC in Java](https://www.baeldung.com/java-grpc-streaming)
- [Error Handling in gRPC](https://www.baeldung.com/grpcs-error-handling)
- [Configuring Retry Policy for gRPC Request](https://www.baeldung.com/java-gprc-retry-policy)
- [Add Global Exception Interceptor in gRPC Server](https://www.baeldung.com/grpc-server-global-exception-interceptor)
- [gRPC Authentication in Java Using Application Layer Transport Security (ALTS)](https://www.baeldung.com/java-grpc-authentication-application-layer-transport-security-alts)
- [Packed Repeated Fields in Protobuf in Java](https://www.baeldung.com/java-protobuf-packed-repeated-fields)
