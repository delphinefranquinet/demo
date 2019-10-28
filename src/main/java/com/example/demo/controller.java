package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class TestController {

    // GET http://localhost:8080/spring-dvdrental/test
    @GetMapping(value="test", produces= MediaType.TEXT_PLAIN_VALUE)
    public String tester() {
        return entity.ok("ça marche !");
    }
}

