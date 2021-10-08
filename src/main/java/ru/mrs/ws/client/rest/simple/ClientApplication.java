package ru.mrs.ws.client.rest.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
//import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.ApplicationContext;
import ru.mrs.ws.client.rest.simple.service.Rest;
//import org.springframework.retry.annotation.EnableRetry;

// https://github.com/ydvorzhetskiy/sb-client

//@EnableRetry
@EnableCaching
//@EnableHystrix
@SpringBootApplication
public class ClientApplication {

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext ctx = SpringApplication.run(ClientApplication.class, args);
        Rest restClient = ctx.getBean(Rest.class);
        String s = restClient.uniRequest();
        System.out.println(s);

//        for (int i = 0; i < 3; ++i) {
//            System.out.println("Blocked urls:");
//            restClient.findAllBlockedSites().forEach(site -> System.out.println(site.getUrl()));
//
//            Thread.sleep(5000);
//        }
    }
}
