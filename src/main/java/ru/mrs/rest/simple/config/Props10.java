package ru.mrs.rest.simple.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(
        ignoreResourceNotFound = false,
        value="classpath:credentials/10-config.properties")
public class Props10 {
    String host;
//    Integer port;
    String port;
    String method;
}
