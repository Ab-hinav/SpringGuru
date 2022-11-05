package com.SpringGuru.DIpractice.controllers;

import com.SpringGuru.DIpractice.service.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class setterInjectedControllerTest {

    setterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new setterInjectedController();
        controller.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }


}