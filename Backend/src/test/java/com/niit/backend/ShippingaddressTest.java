package com.niit.backend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.Dao.ShippingaddressDAO;
import com.niit.model.Shippingaddress;

public class ShippingaddressTest {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.*");
		context.refresh();
		
		ShippingaddressDAO shippingaddressDAO = (ShippingaddressDAO) context.getBean("ShippingaddressDAO");
		Shippingaddress shippingaddress = (Shippingaddress) context.getBean("shippingaddress");
		
		shippingaddress.setAddress("fdgfs");
		shippingaddress.setUserName("jkfgjd");
		shippingaddressDAO.saveOrUpdate(shippingaddress);

	}
	}
