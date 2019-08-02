package com.ebartmedia.ejobs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration
////@EnableAutoConfiguration
//@ComponentScan(value = {"com.ebartmedia.ejobs.service"})
@SpringBootApplication
public class EjobsApplication {

    public static void main(String[] args) {
        SpringApplication.run(EjobsApplication.class, args);
    }

}
