package com.SpringGuru.DIpractice.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18n")
@Profile("ES")
public class i18nSpanishGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
