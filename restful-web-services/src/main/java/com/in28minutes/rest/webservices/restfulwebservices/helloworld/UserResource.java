package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.in28minutes.rest.webservices.restfulwebservices.user.UserDaoService;
import com.in28minutes.rest.webservices.restfulwebservices.user.userF;


@RestController
public class UserResource {
	
	private UserDaoService DAo;

	public UserResource(UserDaoService t) {
		this.DAo = t;
	}
	
	
	
	
	@GetMapping("/users")
	 List<userF> Showusers()
	 {
		// List<userF> all_users=DAo.Lusers;
		 return DAo.findAll();
	 }
	 
	 @GetMapping("/users/{id}")
	     userF retrieveUser(@PathVariable int id) {
		 userF us=DAo.findOne(id);
		 
		 if(us==null)
		 {
			 throw new UserNotFoundException("id: "+id);
		 }
		     
			return us;
		}

	    @DeleteMapping("/users/{id}")
	 void DeleteUser(@PathVariable int id) {
		 userF us=DAo.findOne(id);
		  if(us!=null)
		  {
			  UserDaoService.Lusers.remove(id-1);
		  }
		 
		}
	 
}
