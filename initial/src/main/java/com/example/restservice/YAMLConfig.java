package com.example.restservice;

import java.lang.String;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ConfigurationProperties
@ConstructorBinding
@EnableConfigurationProperties
public class YAMLConfig {

    private String name;
    private String environment;
    private boolean enabled;
    private List<String> servers = new ArrayList<>();

    public YAMLConfig(String name, String environment, boolean enabled, List<String> servers) {
        this.name = name;
        this.environment = environment;
        this.enabled = enabled;
        this.servers = servers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public void setServers(List<String> servers) {
        this.servers = servers;
    }

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
}

