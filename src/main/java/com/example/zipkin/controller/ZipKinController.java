package com.example.zipkin.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ZipKinController {

    @GetMapping("/zipkinExample")
    public String getSample(){
        log.info("1 line of getSample method");
        log.info(" zipkin example");
        log.info("last line of getSample method");
        return "success response";
    }

}
