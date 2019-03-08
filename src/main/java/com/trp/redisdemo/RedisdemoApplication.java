package com.trp.redisdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedisdemoApplication
{

    // From example: https://github.com/sixthpoint/spring-boot-elasticache-redis-tutorial/tree/master/src/main

    public static void main(String[] args)
    {
        SpringApplication.run(RedisdemoApplication.class, args);
    }

}

