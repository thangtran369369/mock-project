package com.smartphone.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
@SpringBootApplication
public class ShopSmartphoneApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(ShopSmartphoneApplication.class, args);
	}
	
	
	@GetMapping("/home")
	public String home() {
		return "web/home";
	}
	
	@GetMapping("/product-details")
	public String product() {
		return "web/product-details";
	}
	
	
	@GetMapping("/login")
	public String login() {
		return "web/login";
	}
	

}
