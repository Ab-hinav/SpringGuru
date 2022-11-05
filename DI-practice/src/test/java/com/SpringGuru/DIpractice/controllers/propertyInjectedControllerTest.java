package com.SpringGuru.DIpractice.controllers;

import com.SpringGuru.DIpractice.service.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class propertyInjectedControllerTest {

    propertyInjectedController controller;

    @BeforeEach
    void setUp() {
    controller = new propertyInjectedController();
    controller.greetingService = new GreetingServiceImpl();

    }

    @Test
    void getGreeting() {
    System.out.println(controller.getGreeting());

    }


}