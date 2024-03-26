package com.example.aws2.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class HelloController {

    @GetMapping("/")
    public String home(){
        // 로그 레벨의 디폴트는 info
        log.trace("get /");
        log.debug("get /");
        log.info("get /");
        log.warn("get /");
        log.error("get /");
        return "home";
        //개발할 때 sout 대신에 log를 직접 남겨야한다
    }

    @GetMapping("/aws/2")
    public String aws1(){
        log.info("get /aws/2");
        return "<h1>aws2</h1>";
    }
}
