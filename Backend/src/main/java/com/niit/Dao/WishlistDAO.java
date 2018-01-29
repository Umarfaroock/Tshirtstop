package com.niit.Dao;

import java.util.List;

import com.niit.model.Wishlist;

public interface WishlistDAO {
public List<Wishlist> list();
	
	public Wishlist getByProductName(String productname);		
	
	public Wishlist getByProductId(int productid);	
	
    public Wishlist getByPrice(String price);
	
	public void saveOrUpdate(Wishlist wishlist);
		
	public void delete(String Productname);
}
