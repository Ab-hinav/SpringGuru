package com.SpringGuru.DIpractice.controllers;

import com.SpringGuru.DIpractice.service.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class i18nController {

    private final GreetingService greetingService;

    public i18nController(@Qualifier("i18n") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }

}
