package com.example.springtickets;

import com.example.springtickets.models.UserModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

@SpringBootApplication
public class SpringTicketsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringTicketsApplication.class, args);
    }

}
