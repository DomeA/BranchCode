package com.domeastudio.mappingo.server.cloudtool.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by domea on 17-5-21.
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
