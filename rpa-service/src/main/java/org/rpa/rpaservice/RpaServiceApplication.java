package org.rpa.rpaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class RpaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RpaServiceApplication.class, args);
    }

}
