package com.stage2.stage2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com.stage2.entities"})
@EnableJpaRepositories("com.stage2.dao")
@ComponentScan("com.stage2.controller")


public class Stage2Application {

    public static void main(String[] args) {
        SpringApplication.run(Stage2Application.class, args);
    }

}
