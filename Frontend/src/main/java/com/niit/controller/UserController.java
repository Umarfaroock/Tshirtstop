package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.Dao.UserDAO;
import com.niit.model.User;

@Controller
public class UserController {

	@Autowired
	private UserDAO userDAO;

	/*
	 * @Autowired private RoleDAO roleDAO;
	 * 
	 * @Autowired private Role role;
	 */

	@RequestMapping("/addNewUser")
	

	public String addUser(@ModelAttribute User user, Model model) {
		
		System.out.println("user controller");

		user.setEnabled(true);

		userDAO.saveOrUpdate(user);
		return "home";

	}
}
