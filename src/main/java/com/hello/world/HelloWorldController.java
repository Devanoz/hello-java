package com.hello.world;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloWorldController {
    
    @GetMapping("/")
    public String greeting() {
        return "Hello world";
    }

}
