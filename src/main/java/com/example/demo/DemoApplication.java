package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class DemoApplication {

	@RequestMapping("/test")
	public String test(ModelMap mm){
		mm.put("key", " world");
		System.out.println (111);
		System.out.println ("123123" );
		System.out.println ("123" );
		return "index.html";
	}

	/*@RequestMapping("/login")
	public String login(Model m){
		m.addAttribute ("key","This is login.");
		return "login";
	}*/
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
