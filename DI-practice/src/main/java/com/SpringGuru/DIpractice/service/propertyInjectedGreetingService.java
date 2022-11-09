package com.SpringGuru.DIpractice.service;

import org.springframework.stereotype.Service;

public class propertyInjectedGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello World - Property";
    }
}
