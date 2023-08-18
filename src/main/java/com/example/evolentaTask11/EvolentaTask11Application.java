package com.example.evolentaTask11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EvolentaTask11Application {

    @Autowired
    Calculator calculator;

    public static void main(String[] args) {
        SpringApplication.run(EvolentaTask11Application.class, args);
    }

    @Bean
    public void outToConsole() {
        calculator.calc(2, 3);
    }

}
