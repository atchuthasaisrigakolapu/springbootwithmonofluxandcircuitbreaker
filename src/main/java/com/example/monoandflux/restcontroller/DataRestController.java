package com.example.monoandflux.restcontroller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class DataRestController {

    @GetMapping("/data")
    @HystrixCommand(fallbackMethod = "getDataFromDb",
            commandProperties = {
            @HystrixProperty(name="circuitBreaker.requestVolumeThreshold",value="3"),
                    @HystrixProperty(name="circuitBreaker.sleepWindowInMilliseconds",value="10000"),
                    @HystrixProperty(name="circuitBreaker.enabled",value="true")
            }
    )
    public String getDataFromRedis(){
        System.out.println("Get Data getting from redis()");
        if(new Random().nextInt(10)<=10){
            throw new RuntimeException("Redis server is down");
        }
        return "data accessed from redis";
    }
    public String getDataFromDb(){
        System.out.println("Get Data getting from DB()");

        return "data accessed from DB";
    }

}
