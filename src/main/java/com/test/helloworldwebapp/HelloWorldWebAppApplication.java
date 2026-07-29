package com.test.helloworldwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.test.helloworldwebapp")
public class HelloWorldWebAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldWebAppApplication.class, args);
    }
}