package com.example.restservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableConfigurationProperties
@ConfigurationProperties
public class YAMLConfig {

    private String name;
    private String environment;
    private boolean enabled;
    private List<String> servers = new ArrayList<>();

    public String getName() {
        return name;
    }

    public String getEnvironment() {
        return environment;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public List<String> getServers() {
        return servers;
    }

    // standard getters and setters

}
