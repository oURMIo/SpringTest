package com.example.restservice;

import java.lang.String;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestServiceApplication implements CommandLineRunner {

    @Autowired
    private static YAMLConfig myConfig;

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(RestServiceApplication.class);
        app.run();
//        SpringApplication.run(RestServiceApplication.class, args);
    }

    public void run(String... args) throws Exception {
        System.out.println("using environment: " + myConfig.getEnvironment());
        System.out.println("name: " + myConfig.getName());
        System.out.println("enabled:" + myConfig.isEnabled());
        System.out.println("servers: " + myConfig.getServers());
    }
}
