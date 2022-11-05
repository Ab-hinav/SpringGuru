package com.SpringGuru.DIpractice.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class primaryGreetingService implements GreetingService{


    @Override
    public String sayGreeting() {
        return "Hello from Primary Bean";
    }
}
