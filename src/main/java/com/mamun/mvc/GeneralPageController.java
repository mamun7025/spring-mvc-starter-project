package com.mamun.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GeneralPageController {
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("rendering home page");
		return "home";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("rendering about page");
		return "about";
	}

}