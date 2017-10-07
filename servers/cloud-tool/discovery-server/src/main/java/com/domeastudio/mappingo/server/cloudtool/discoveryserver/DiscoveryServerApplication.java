package com.domeastudio.mappingo.server.cloudtool.discoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by domea on 17-5-21.
 */
@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServerApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(DiscoveryServerApplication.class, args);
    }
}
