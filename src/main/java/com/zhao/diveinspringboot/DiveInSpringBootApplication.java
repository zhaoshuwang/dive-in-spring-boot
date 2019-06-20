package com.zhao.diveinspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan(basePackages = "com.zhao.diveinspringboot.web.servlet")
public class DiveInSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiveInSpringBootApplication.class, args);
    }

}
