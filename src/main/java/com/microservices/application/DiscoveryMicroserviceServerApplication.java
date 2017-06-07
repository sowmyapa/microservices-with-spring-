package com.microservices.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * https://spring.io/blog/2015/01/20/microservice-registration-and-discovery-with-spring-cloud-and-netflix-s-eureka
 * http://www.dineshonjava.com/2017/01/microservices-with-spring-boot.html
 * Created by sowmyaparameshwara on 6/1/17.
 */
@SpringBootApplication
@EnableEurekaServer
public class DiscoveryMicroserviceServerApplication {

    public static void main(String[] args){
        //System.setProperty("spring.config.name","registration-server");
        SpringApplication.run(DiscoveryMicroserviceServerApplication.class,args);
    }

}
