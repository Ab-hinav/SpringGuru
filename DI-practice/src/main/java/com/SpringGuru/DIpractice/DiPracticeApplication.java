package com.SpringGuru.DIpractice;

import com.SpringGuru.DIpractice.config.sfgconfig;
import com.SpringGuru.DIpractice.controllers.*;
import com.SpringGuru.DIpractice.datasource.FakeDataSource;
import com.SpringGuru.DIpractice.service.GreetingService;
import com.SpringGuru.DIpractice.service.PrototypeBean;
import com.SpringGuru.DIpractice.service.SingletonBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan(basePackages = {"com.SpringGuru.DIpractice", "pets"})
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

		System.out.println("------ Greeting Service xml");
		GreetingService greetingService = (GreetingService) ctx.getBean("greetingService");
		System.out.println(greetingService.sayGreeting());

		System.out.println("------ Bean Scopes");
		SingletonBean singletonBean1 = (SingletonBean) ctx.getBean("singletonBean");
		SingletonBean singletonBean2 = (SingletonBean) ctx.getBean("singletonBean");

		PrototypeBean prototypeBean1 = (PrototypeBean) ctx.getBean("prototypeBean");
		PrototypeBean prototypeBean2 = (PrototypeBean) ctx.getBean("prototypeBean");

		System.out.println("------- FakeDataSource");
		FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUser());
		System.out.println(fakeDataSource.getPassword());
		System.out.println(fakeDataSource.getUrl());

		System.out.println("------- Config sfg");
		sfgconfig sfgconfig1 = (sfgconfig) ctx.getBean(sfgconfig.class);
		System.out.println(sfgconfig1.getUser());
		System.out.println(sfgconfig1.getPassword());
		System.out.println(sfgconfig1.getUrl());




	}

}
