package com.niit.backend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.Dao.ProductDAO;
import com.niit.model.Product;

public class ProductTest {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.*");
		context.refresh();
	
		ProductDAO productDAO = (ProductDAO) context.getBean("ProductDAO");
		Product product = (Product) context.getBean("product");
		
		product.setProductName("fdknmfg");
		productDAO.saveOrUpdate(product);
	}
	
	
}
