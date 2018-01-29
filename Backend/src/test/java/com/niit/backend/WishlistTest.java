package com.niit.backend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.Dao.WishlistDAO;
import com.niit.model.Wishlist;

public class WishlistTest {
public static void main (String[] args) {
		
		
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.*");
		context.refresh();
		
		WishlistDAO wishlistDAO = (WishlistDAO) context.getBean("WishlistDAO");
		Wishlist wishlist = (Wishlist) context.getBean("wishlist");
		
		wishlist.setProductName("dhjf");
		wishlist.setPrice(87);
		wishlistDAO.saveOrUpdate(wishlist);
}
}