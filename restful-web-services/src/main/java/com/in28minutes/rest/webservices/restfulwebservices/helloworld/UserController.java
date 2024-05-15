package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
	}
	
	
	@PostMapping("/users")
	ResponseEntity<Object> NewUser(@RequestBody userF u1)
	{
	   
	   UserDaoService.Lusers.add(u1);
	   //userRepo.save(UserDaoService.Lusers.get(UserDaoService.Lusers.size()-1));
	   
	   
	  // /users/4
	 URI location=ServletUriComponentsBuilder.fromCurrentRequest()
              .path("/{id}")
              .buildAndExpand(u1.getId())
              .toUri();
	   
	   return ResponseEntity.created(location).build();
	}
	
	@RequestMapping("/")
	String showallUsers()
	{
		
		return "user";
	}
	
	/*@GetMapping("/users")
	 List<userF> Showusers()
	 {
		// List<userF> all_users=DAo.Lusers;
		 return DAo.findAll();
	 }
	 
	 @GetMapping("/users/{id}")
	     userF retrieveUser(@PathVariable int id) {
			return DAo.findOne(id);
		}*/

}
