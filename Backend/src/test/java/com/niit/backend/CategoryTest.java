package com.niit.backend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.Dao.CategoryDAO;
import com.niit.model.Category;

public class CategoryTest {
	public static void main (String[] args) {
		
		
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.*");
		context.refresh();
		
		CategoryDAO categoryDAO = (CategoryDAO) context.getBean("CategoryDAO");
		Category category = (Category) context.getBean("category");
		
category.setCategoryName("Watches");
		
		categoryDAO.saveOrUpdate(category);
}
}