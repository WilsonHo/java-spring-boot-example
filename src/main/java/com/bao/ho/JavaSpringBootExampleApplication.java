package com.bao.ho;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class JavaSpringBootExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaSpringBootExampleApplication.class, args);
    }
}
