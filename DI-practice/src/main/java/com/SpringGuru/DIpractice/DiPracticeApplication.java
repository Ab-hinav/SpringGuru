package com.SpringGuru.DIpractice;

import com.SpringGuru.DIpractice.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiPracticeApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DiPracticeApplication.class, args);

		System.out.println("------ Pet Controller ------");
		myPetController petController = (myPetController) ctx.getBean("myPetController");
		System.out.println(petController.whichPetIsTheBest());


		System.out.println("---------- Profile Example ----------");
		i18nController i18nController = (i18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		System.out.println("---------- Primary Bean");
		myController controller = (myController) ctx.getBean("myController");
		System.out.println(controller.sayHello());

		System.out.println("------ Property");
		propertyInjectedController propertyInjectedController = (propertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("------ Setter");
		setterInjectedController setterInjectedController = (setterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("------ Constructor");
		constructorInjectedController constructorInjectedController = (constructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());



	}

}
