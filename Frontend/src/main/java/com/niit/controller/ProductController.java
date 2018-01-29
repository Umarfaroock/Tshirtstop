package com.niit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.niit.Dao.CategoryDAO;
import com.niit.Dao.ProductDAO;
import com.niit.Dao.SupplierDAO;
import com.niit.model.Category;
import com.niit.model.Product;
import com.niit.model.Supplier;

@Controller
	public class ProductController {

		@Autowired
		private ProductDAO productDao;
		@Autowired
		private CategoryDAO categoryDao;
		
		@Autowired
		private SupplierDAO supplierDao;
		 
		@RequestMapping("viewProduct")
		public String ViewProduct(){
			
			return "viewProduct";
		}
		@RequestMapping("Product")
		public ModelAndView newProduct(){
			
			ModelAndView mv = new ModelAndView("Product");
			List<Category> categoryList = categoryDao.list();
			List<Supplier> supplierList = supplierDao.list();
			mv.addObject("supplierList", supplierList);
			mv.addObject("categoryList", categoryList);
			mv.addObject("AddProductButtonClicked", true);
			return mv;
		}
		@RequestMapping("addProduct")
		public String addProduct(@ModelAttribute Product product, @RequestParam("file") MultipartFile file ,Model model){
			productDao.saveOrUpdate(product);
			
			String path = "S://Official/Projects/energyspear17/New/smFrontend/src/main/webapp/WEB-INF/resources/images/albums/";
			FileUtil.upload(path, file, product.getProductId()+".jpg");
			
			model.addAttribute("ViewProductButtonClicked", true);
			
			return "redirect:viewProduct";
			
		}
		@RequestMapping("viewProduct")
		public String viewProducts(Model model){
			
			List<Product> productList = productDao.list();
			model.addAttribute("productList", productList);
			model.addAttribute("ViewProductButtonClicked", true);
			return "Product";
			
			
		}
		
		@RequestMapping("deleteProduct")
		public String deleteProducts(@RequestParam("productId") int productid, Model model){
			
			productDao.delete(productid);
			return "redirect:viewProduct";
		}
		
		@RequestMapping("EditProduct")
		public ModelAndView editProduct(@RequestParam ("productId") int productId, Model model){
			ModelAndView mv = new ModelAndView("Product");
			List<Category> categoryList = categoryDao.list();
			List<Supplier> supplierList = supplierDao.list();
			Product product = productDao.getByProductId(productId);
			model.addAttribute("product", product);
			mv.addObject("supplierList", supplierList);
			mv.addObject("categoryList", categoryList);
			model.addAttribute("editProductClicked", true);
			return mv;
		}
		@RequestMapping("ProductEdited")
		public String productEdited(@ModelAttribute Product product){
			
			productDao.saveOrUpdate(product);
			return "redirect:viewProduct";
		}
		
		@RequestMapping("Prouctdescription")
		public String ProductDescription(@RequestParam ("productId") int productId, Model model){
			Product product = productDao.getByProductId(productId);
			model.addAttribute("product", product);
			return "Productdescription";
		}
}
