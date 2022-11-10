package com.SpringGuru.DIpractice.service;

import com.SpringGuru.DIpractice.repository.EnglishGreetingRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;



public class i18nEnglishGreetingService implements GreetingService{

    private EnglishGreetingRepository englishGreetingRepository;

    public i18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
