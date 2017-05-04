package com.greenfoxacademy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MessageproceederApplication implements CommandLineRunner {

	@Autowired
	MessageProceeder messageProceeder;

	public static void main(String[] args) {
		SpringApplication.run(MessageproceederApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String result = messageProceeder.processMessage("Hi Barba, How are you?", "office@greenfox.com");
		System.out.println(result);
	}
}
