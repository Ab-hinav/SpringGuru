package com.SpringGuru.DIpractice.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18n")
@Profile({"EN", "default"})
public class i18nEnglishGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
