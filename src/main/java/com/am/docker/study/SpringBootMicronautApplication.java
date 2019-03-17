package com.am.docker.study;

import io.micronaut.runtime.Micronaut;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMicronautApplication {

    public static void main(String[] args) {
        Micronaut.run(SpringBootMicronautApplication.class);
    }
}