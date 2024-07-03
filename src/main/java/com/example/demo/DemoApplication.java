package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	@GetMapping("/")
	public String helloWorld()
	{
		return "hello world";
	}

	@GetMapping("/about")
	public String aboutPage()
	{
		return "about";
	}

	@GetMapping("/hello-world")
	public String helloPage()
	{
		return "hello-world";
	}

	@GetMapping("/test")
	public String testPage()
	{
		return "this is test page";
	}

	@GetMapping("/27")
	public String test27()
	{
		return "this is test page 27";
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
