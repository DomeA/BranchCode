package com.domeastudio.mappingo.servers.microservice.spatialdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = {"com.domeastudio.mappingo.servers.microservice.spatialdata.repository"})
@EntityScan(basePackages = {"com.domeastudio.mappingo.servers.microservice.spatialdata.pojo"})
@SpringBootApplication
public class SpatialDataApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpatialDataApplication.class, args);
    }
}
