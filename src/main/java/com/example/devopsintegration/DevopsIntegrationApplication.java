package com.example.devopsintegration;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@SpringBootApplication
@RestController
@Slf4j
public class DevopsIntegrationApplication {

    @GetMapping
    public String message() {
        log.info("Welcome to javatechie............");
        return "Welcome to javatechie";
    }

    @PostConstruct
    public  test() {
        log.info("Welcome to javatechie...............");
        return null;
    }

    public static void main(String[] args) {
        SpringApplication.run(DevopsIntegrationApplication.class, args);
    }

}
