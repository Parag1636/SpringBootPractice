package com.introduction.week1HW.IntroductionToSpringBootWeek1HW;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroductionToSpringBootWeek1HwApplication implements CommandLineRunner {

	@Autowired
	Cakebaker cakebaker;

	@Override
	public void run(String... args) throws Exception {
		System.out.println(cakebaker.bakeCake());
	}

	public static void main(String[] args) {
		SpringApplication.run(IntroductionToSpringBootWeek1HwApplication.class, args);
	}

}
