package com.SpringGuru.DIpractice.config;

import com.SpringGuru.DIpractice.service.GreetingServiceImpl;
import com.SpringGuru.DIpractice.service.propertyInjectedGreetingService;
import com.SpringGuru.DIpractice.service.setterInjectedGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingServiceConfig {

    @Bean
    propertyInjectedGreetingService propertyInjectedGreetingService(){
        return new propertyInjectedGreetingService();
    }

    @Bean
    setterInjectedGreetingService setterInjectedGreetingService(){
        return new setterInjectedGreetingService();
    }

    @Bean
    GreetingServiceImpl greetingService(){
        return new GreetingServiceImpl();
    }
}
