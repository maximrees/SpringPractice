package edu.max.springpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// == config + enableauto + cmpntscan
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        System.out.println("app");
        SpringApplication.run(App.class, args);
    }
}
