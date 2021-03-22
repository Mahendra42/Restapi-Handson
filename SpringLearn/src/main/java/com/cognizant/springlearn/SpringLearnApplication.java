package com.cognizant.springlearn;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@ImportResource({"classpath:country.xml"})
public class SpringLearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);
		displayCountry();
		displayCountries();

	}

	public static void displayCountry() {
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

		Country country = (Country) context.getBean("country", Country.class);
		Country anotherCountry = context.getBean("country", Country.class);
		
		System.out.println("handson1");
		System.out.println(country);
		
		System.out.println("handson2");
		System.out.println(anotherCountry);
		// LOGGER.debug("Country : {}", country.toString());

	}

	private static void displayCountries() {

		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		@SuppressWarnings("unchecked")
		List<Country> list=(List<Country>)context.getBean("countryList");
		System.out.println("hanson3");
		for(Country count:list) {
			System.out.println(count);
		}

	}
}
