package com.project.everything.Ready;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReadyController {

    @GetMapping("/hello")
    public String hello() {
        return "Test is Readyy";
    }
}

