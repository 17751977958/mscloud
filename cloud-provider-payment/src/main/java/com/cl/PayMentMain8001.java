package com.cl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class PayMentMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(PayMentMain8001.class,args);
    }
}
