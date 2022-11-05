package com.SpringGuru.DIpractice.controllers;

import com.SpringGuru.DIpractice.service.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class myController {

    private final GreetingService greetingService;

    public myController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String sayHello() {
        return greetingService.sayGreeting();
    }

}
