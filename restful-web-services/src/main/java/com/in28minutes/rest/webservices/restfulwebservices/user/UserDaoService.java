package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import java.time.LocalDate;


@Component
public class UserDaoService {

	public static  List<userF> Lusers=new ArrayList<>();
		 
	       static
	       {
			Lusers.add(new userF("1","Adam",LocalDate.now().minusYears(30)));
			Lusers.add(new userF("2","Eve",LocalDate.now().minusYears(25)));
			Lusers.add(new userF("3","Jim",LocalDate.now().minusYears(20)));
	       }

		public List<userF> findAll() {
			// TODO Auto-generated method stub
			return Lusers;
		}

		public userF findOne(int id) {
			
			return Lusers.get(id);
		}
		
	
}
