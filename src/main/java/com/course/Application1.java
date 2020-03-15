package com.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.annotation.PreDestroy;

//@SpringBootApplication
@EnableScheduling
@SpringBootApplication(exclude = MongoAutoConfiguration.class)
public class Application1 {

    private  static ConfigurableApplicationContext context;

    public static void main(String[] args) {
        Application1.context = SpringApplication.run(Application1.class,args);
    }

    @PreDestroy
    public void close(){
        Application1.context.close();
    }

}