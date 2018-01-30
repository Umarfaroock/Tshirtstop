/*package com.niit.backend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.Dao.BillingaddressDAO;
import com.niit.Dao.CartDAO;
import com.niit.Dao.CategoryDAO;
import com.niit.Dao.ProductDAO;
import com.niit.Dao.RoleDAO;
import com.niit.Dao.ShippingaddressDAO;
import com.niit.Dao.SupplierDAO;
import com.niit.Dao.UserDAO;
import com.niit.model.Billingaddress;
import com.niit.model.Cart;
import com.niit.model.Category;
import com.niit.model.Product;
import com.niit.model.Role;
import com.niit.model.Shippingaddress;
import com.niit.model.Supplier;
import com.niit.model.User;

public class Test {

	private static Cart productid;

	public static void main (String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.*");
		context.refresh();

		CategoryDAO categoryDao = (CategoryDAO) context.getBean("CategoryDao");
		UserDAO userDao = (UserDAO) context.getBean("UserDao");
		ProductDAO productDao = (ProductDAO) context.getBean("ProductDao");
		BillingaddressDAO billingaddressDao = (BillingaddressDAO) context.getBean("BillingaddressDao");
		CartDAO cartDao = (CartDAO) context.getBean("CartDao");
		SupplierDAO supplierDao = (SupplierDAO) context.getBean("SupplierDao");
		WishlistDao wishlistDao = (WishlistDao) context.getBean("WishlistDao");
		ShippingaddressDAO shippingaddressDao = (ShippingaddressDAO) context.getBean("ShippingaddressDao");
		RoleDAO roleDao = (RoleDAO) context.getBean("RoleDao");
		
		Category category = (Category) context.getBean("category");
		User user = (User) context.getBean("user");
		Product product = (Product) context.getBean("product");
		Billingaddress billingaddress = (Billingaddress) context.getBean("billingaddress");
		Cart cart = (Cart) context.getBean("cart");
		Supplier supplier = (Supplier) context.getBean("supplier");
		Wishlist whishlist = (Wishlist) context.getBean("wishlist");
		Shippingaddress shippingaddress = (Shippingaddress) context.getBean("shippingaddress");
		Role role = (Role) context.getBean("role");
		
		
		category.setCategoryName("Watches");
		
		categoryDao.saveOrUpdate(category);
		
		
		user.setUserName("skfr");
		user.setEmailId("jhvd@gmail.com");
		user.setPassword("jfkd");
		
		user.setContactNumber(98765); 
		user.setAddress("s12,sejkajdh");

		role.setUname("kjgdffd");
		role.setEmail("hgfshdghj");
		role.setMnum("6567");
		
		user.setRole(role);
		role.setUser(user);
		
		userDao.saveOrUpdate(user);
		roleDao.saveOrUpdate(role);
		
		
		product.setProductName("fdknmfg");
		productDao.saveOrUpdate(product);
		
		billingaddress.setAddress("hfdjdufuinv");
		billingaddress.setContactNumber(897465);
		billingaddressDao.saveOrUpdate(billingaddress);
		
		
		cart.setProductName("dfhjj");
		cartDao.saveOrUpdate(cart);
		
		
		supplier.setSupplierName("hddsjk");
		supplier.setContactNumber(87968764);
		supplierDao.saveOrUpdate(supplier);
		
		
		whishlist.setProductName("dhjf");
		whishlist.setPrice(87);
		wishlistDao.saveOrUpdate(whishlist);
		
		shippingaddress.setAddress("fdgfs");
		shippingaddress.setUserName("jkfgjd");
		shippingaddressDao.saveOrUpdate(shippingaddress);
		
		
	}

}
*/