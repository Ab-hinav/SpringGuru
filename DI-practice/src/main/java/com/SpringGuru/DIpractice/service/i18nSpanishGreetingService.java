package com.SpringGuru.DIpractice.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;



public class i18nSpanishGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
