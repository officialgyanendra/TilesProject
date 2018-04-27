package com.jlcindia.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController{
	@RequestMapping(value="/home")
	public String showHello(){
	System.out.println("***Show Hello****");
	return "HomeDef";
	}

}
