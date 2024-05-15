package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

import com.in28minutes.rest.webservices.restfulwebservices.data.UserRepository;

import java.time.LocalDate;


@Component
public class UserDaoService {

	public static  List<userF> Lusers=new ArrayList<>();
		private static int  c=0; 
		private UserRepository userRepo;
	       static
	       {
			Lusers.add(new userF(++c,"Adam",LocalDate.now().minusYears(30)));
			Lusers.add(new userF(++c,"Eve",LocalDate.now().minusYears(25)));
			Lusers.add(new userF(++c,"Jim",LocalDate.now().minusYears(20)));
	       }
	       
	       
		public List<userF> findAll() {
			// TODO Auto-generated method stub

			return Lusers;
		}
		
		public userF Save(userF user)
		{
			user.setId(++c);
			Lusers.add(user);
			return user;
		}

		public userF findOne(int id) {
			
			return Lusers.get(id);
		}
		
	
}
