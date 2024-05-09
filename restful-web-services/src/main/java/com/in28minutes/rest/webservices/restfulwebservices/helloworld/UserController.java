package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.in28minutes.rest.webservices.restfulwebservices.user.userF;
import com.in28minutes.rest.webservices.restfulwebservices.data.UserRepository;
import com.in28minutes.rest.webservices.restfulwebservices.user.UserDaoService;

//for creating a new user

@RestController
public class UserController {
	
	private UserDaoService DAo;
	private UserRepository userRepo;
	
	
	UserController(UserDaoService t,UserRepository p)
	{
		this.DAo=new UserDaoService();
		this.userRepo=p;
		
		for(int i=0;i<UserDaoService.Lusers.size();i++)
		{
			userRepo.save(UserDaoService.Lusers.get(i));
		}
          
	}
	
	
	@RequestMapping("/")
	String showallUsers()
	{
		
		return "user";
	}
	
	@GetMapping("/users")
	 List<userF> Showusers()
	 {
		// List<userF> all_users=DAo.Lusers;
		 return DAo.findAll();
	 }
	 
	 @GetMapping("/users/{id}")
	     userF retrieveUser(@PathVariable int id) {
			return DAo.findOne(id);
		}

}
