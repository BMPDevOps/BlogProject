package org.example.blogproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.SpringServletContainerInitializer;

@SpringBootApplication
@ComponentScan({"org.example.blogproject.*"})
public class BlogProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogProjectApplication.class, args);
    }
}

