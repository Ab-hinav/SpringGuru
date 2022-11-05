package com.SpringGuru.DIpractice.controllers;

import com.SpringGuru.DIpractice.service.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class constructorInjectedController {

    private final GreetingService greetingService;

    public constructorInjectedController(@Qualifier("contructorInjectedGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }

}
