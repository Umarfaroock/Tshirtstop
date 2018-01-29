/*package com.niit.backend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.Dao.RoleDAO;
import com.niit.model.Role;


public class RoleTest {
public static void main (String[] args) {
		
		
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.*");
		context.refresh();
		
		RoleDAO roleDAO = (RoleDAO) context.getBean("RoleDAO");
		Role role = (Role) context.getBean("role");
		
		roleDAO.saveOrUpdate(role);
}
}*/