package io.datus.odapt.services;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

@Service
@EnableConfigurationProperties(ServiceProperties.class)
public class ConfigConsumer {

    private final ServiceProperties properties;

    public ConfigConsumer(ServiceProperties serviceProperties) {
        this.properties = serviceProperties;
    }

    public String connection() {
        return this.properties.getConnection();
    }
}