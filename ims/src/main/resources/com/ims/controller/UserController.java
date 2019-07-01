package com.ims.controller;

import org.springframework.stereotype.Controller;

@Controller
public class UserController {
	
	 @RequestMapping(method = RequestMethod.GET)
	    public String sayHello(ModelMap model) {
	        model.addAttribute("greeting", "Hello World from Spring 4 MVC");
	        return "welcome";
	    }
	 
	    @RequestMapping(value="/helloagain", method = RequestMethod.GET)
	    public String sayHelloAgain(ModelMap model) {
	        model.addAttribute("greeting", "Hello World Again, from Spring 4 MVC");
	        return "welcome";
	    }
	

}
