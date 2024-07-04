package com.aruio.mongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication()
public class JavaMongodbTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaMongodbTestApplication.class, args);
    }

}
