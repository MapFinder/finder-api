package com.finder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.finder.configuration.JpaConfiguration;


@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages={"com.finder"})
public class SpringBootFinderApp {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootFinderApp.class, args);
    }
}
