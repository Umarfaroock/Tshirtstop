package com.niit.backend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.niit.Dao.UserDAO;
import com.niit.model.User;

public class UserTest {
public static void main (String[] args) {
		
		
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.*");
		context.refresh();
		
		UserDAO userDAO = (UserDAO) context.getBean("UserDAO");
		User user = (User) context.getBean("user");
		
		
		user.setUserName("skfr");
		user.setEmailId("jhvd@gmail.com");
		user.setPassword("jfkd");
		
		user.setContactNumber(98765);
		user.setAddress("s12,sejkajdh");
		user.setZipcode(75426);
		
	
		userDAO.saveOrUpdate(user);
}
}