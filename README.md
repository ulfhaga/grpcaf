# GRPC

A high performance, open source universal RPC framework.

JDK version is 17

## Build Windows

    mvnw.cmd install -f kontrakt/pom.xml
    mvnw.cmd package -f klient/pom.xml
    mvnw.cmd package -f server/pom.xml
    mvnw.cmd package -Dquarkus.package.jar.type=uber-jar -DskipTests  -f serverQuarkus/pom.xml
    mvnw.cmd clean package -f clientSpringBoot/pom.xml 
    mvnw.cmd clean package -f serverSpringBoot/pom.xml 


## Build Linux

   ./mvnw clean install -f kontrakt/pom.xml ;
   ./mvnw clean package -f klient/pom.xml ;
   ./mvnw clean package -f server/pom.xml ;
   ./mvnw clean package -Dquarkus.package.jar.type=uber-jar -DskipTests  -f se
   ./mvnw clean package -f clientSpringBoot/pom.xml 
   ./mvnw clean package -f serverSpringBoot/pom.xml 

    

## Run gRPC server with a simple server

    java -jar server/target/server-1.0-SNAPSHOT.jar
    # Open a new terminal
    java -jar klient/target/klient-1.0-SNAPSHOT.jar 

## Run a gRPC server using Quarkus
    
    java -jar serverQuarkus/target/serverQuarkus-1.0.0-SNAPSHOT-runner.jar
    java -jar klient/target/klient-1.0-SNAPSHOT.jar
    
## Run a Spring Boot server that make a gRPC call to a Spring Boot server gRPC server


   java -jar serverSpringBoot/target/serverSpringBoot-0.0.1-SNAPSHOT.jar
   java -jar clientSpringBoot/target/clientSpringBoot-0.0.1-SNAPSHOT.jar
    

## Tips

Kill server process i Linux

    lsof -t -i:64001 | xargs kill -9

## Relevant Articles
- [Spring Boot gRPC](https://docs.spring.io/spring-grpc/reference/server.html)
- [grpc](https://grpc.io/)
- [protobuf](https://protobuf.dev/)
- [Introduction to gRPC](https://www.baeldung.com/grpc-introduction)
- [Streaming with gRPC in Java](https://www.baeldung.com/java-grpc-streaming)
- [Error Handling in gRPC](https://www.baeldung.com/grpcs-error-handling)
- [Configuring Retry Policy for gRPC Request](https://www.baeldung.com/java-gprc-retry-policy)
- [Add Global Exception Interceptor in gRPC Server](https://www.baeldung.com/grpc-server-global-exception-interceptor)
- [gRPC Authentication in Java Using Application Layer Transport Security (ALTS)](https://www.baeldung.com/java-grpc-authentication-application-layer-transport-security-alts)
- [Packed Repeated Fields in Protobuf in Java](https://www.baeldung.com/java-protobuf-packed-repeated-fields)
