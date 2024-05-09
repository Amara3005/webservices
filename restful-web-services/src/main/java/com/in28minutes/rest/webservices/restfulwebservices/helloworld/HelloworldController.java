package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {
	
	/*@GetMapping
	String helloworld()
	{
		 System.out.println("hello");
	     return "hello";
	}*/
	
	@GetMapping("/hello")
	public String helloWorld() 
	{
		
	    return "Hello world!";
	}
	
	@GetMapping("/helloworldbean")
	public helloworldbean helloWorldBean() 
	{
	    return new helloworldbean("Hello world!");
	}
	
	
	@GetMapping(path="/helloworldbean/path-variable/{name}")
	public helloworldbean helloWorldBean(@PathVariable String name) 
	{
	    return new helloworldbean("Hello world!"+ name);
	}
}
