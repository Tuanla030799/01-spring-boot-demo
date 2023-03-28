package com.tuna.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }

    // expose a new endpoint for "workout
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hark 5k!";
    }
}
