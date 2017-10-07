package com.domeastudio.mappingo.servers.microservice.spatialpdm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = {"com.domeastudio.mappingo.servers.microservice.spatialpdm.repository"})
@EntityScan(basePackages = {"com.domeastudio.mappingo.servers.microservice.spatialpdm.pojo"})
@SpringBootApplication
public class SpatialPDMApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpatialPDMApplication.class, args);
    }
}
