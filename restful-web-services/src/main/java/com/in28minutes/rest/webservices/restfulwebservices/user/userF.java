package com.in28minutes.rest.webservices.restfulwebservices.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import java.time.LocalDate;

@Entity
@Data
//@NoArgsConstructor(access=AccessLevel.PRIVATE, force=true) 
//@RequiredArgsConstructor
public class userF {
 
	//private static final long serialVersionUID = 1L;
	
	  @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String username;
	private String name;     
    private LocalDate dob;
	
    
    public userF(String username, String name, LocalDate dob) {
		super();
		this.username =username;
		this.name = name;
		this.dob = dob;
	}
    
    
	@Override
	public String toString() {
		return "user [user_id=" + username + ", name=" + name + ", dob=" + dob + "]";
	}


	public String getUser_id() {
		return username;
	}
	public void setUser_id(String username) {
		this.username =username;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	} 
	
}
