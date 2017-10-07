package com.domeastudio.mappingo.servers.monitorserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * Created by domea on 17-5-21.
 */
@SpringBootApplication
@EnableHystrixDashboard
@EnableDiscoveryClient
@EnableTurbine
public class MonitorServerApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(MonitorServerApplication.class, args);
    }
}
