package ru.mrs.ws.client.rest.simple.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(
//        ignoreResourceNotFound = false, value=
                "classpath:credentials/20-config.properties")
public class Props20 {
}
