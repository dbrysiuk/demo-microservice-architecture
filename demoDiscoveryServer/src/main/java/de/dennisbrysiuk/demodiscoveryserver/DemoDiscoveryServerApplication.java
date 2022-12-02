package de.dennisbrysiuk.demodiscoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DemoDiscoveryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoDiscoveryServerApplication.class, args);
    }

}
