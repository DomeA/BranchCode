package com.domeastudio.mappingo.servers.microservice.mongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@EnableJpaRepositories(basePackages = {"com.domeastudio.mappingo.servers.microservice.postgresql.repository"})
//@EntityScan(basePackages = {"com.domeastudio.mappingo.servers.microservice.postgresql.pojo"})
@SpringBootApplication
public class MongodbApplication {
    public static void main(String[] args) throws Exception {
        startMongosServer();
        SpringApplication.run(MongodbApplication.class, args);
    }

    private static void startMongosServer() {

    }
}
