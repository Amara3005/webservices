package com.in28minutes.rest.webservices.restfulwebservices.data;

import org.springframework.data.repository.CrudRepository;

import com.in28minutes.rest.webservices.restfulwebservices.user.userF;


public interface UserRepository extends CrudRepository<userF, Long> {
	userF findByUsername(String username);  
}