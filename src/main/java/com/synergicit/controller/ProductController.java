package com.synergicit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.synergicit.dao.Product;
import com.synergicit.repository.ProductRepository;
import com.synergicit.repository.ProductRepositoryCustomImpl;

@RestController
public class ProductController {
	@Autowired
	ProductRepository productRepository;
	@Autowired
	ProductRepositoryCustomImpl productRepositoryCustomImpl;
	
	@CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(method=RequestMethod.GET, value="/products",produces=MediaType.APPLICATION_JSON_VALUE )
	public List<Product> showProducts(){
		Product product1 = new Product(1, "MacBook Air", "Apple", 1100.0, "Laptop", "https://images-na.ssl-images-amazon.com/images/I/719r4fxiLIL._SL1500_.jpg", 5);
		Product product2 = new Product(2, "HP Business Desktop", "HP", 1029.00, "Desktop", "https://images.samsung.com/is/image/samsung/my-hd-j4303-ua32j4303akxxm-002-front-indigoblue?$PD_GALLERY_L_JPG$", 5);
		Product product3 = new Product(3, "Monitor1", "Sony", 200.0, "Monitor", "https://images.samsung.com/is/image/samsung/my-hd-j4303-ua32j4303akxxm-002-front-indigoblue?$PD_GALLERY_L_JPG$", 5);
		Product product4 = new Product(4, "Monitor2", "Sony", 300.0, "Monitor", "https://images.samsung.com/is/image/samsung/my-hd-j4303-ua32j4303akxxm-002-front-indigoblue?$PD_GALLERY_L_JPG$", 5);
		Product product5 = new Product(5, "Smart LED TV", "Samsung", 1132.00, "TV&Video", "https://images-na.ssl-images-amazon.com/images/I/81m94VGdMzL._SL1500_.jpg", 5);
		Product product6 = new Product(6, "TV6", "Sony", 1350.0, "TV&Video", "https://images.samsung.com/is/image/samsung/my-hd-j4303-ua32j4303akxxm-002-front-indigoblue?$PD_GALLERY_L_JPG$", 5);
		Product product7 = new Product(7, "UHD Smart LED TV", "Sony", 3399.00, "TV&Video", "https://images-na.ssl-images-amazon.com/images/I/91oOrBLvwzL._SL1500_.jpg", 5);
		Product product8 = new Product(8, "Flat Panel HD TV", "Transit", 289.00, "TV&Video", "https://images-na.ssl-images-amazon.com/images/I/41LWK5NEHWL.jpg", 5);
		Product product9 = new Product(9, "HD LED TV", "LG", 220.00, "TV&Video", "https://images-na.ssl-images-amazon.com/images/I/81NZaNRrvDL._SL1500_.jpg", 5);
		Product product10 = new Product(10, "MacBook", "Apple", 1249.00, "Laptop", "https://www.adorama.com/images/Large/acmpxr2lla.jpg", 5);
		Product product11 = new Product(11, "earplug", "Apple", 12.49, "Accessory", "https://brain-images-ssl.cdn.dixons.com/7/3/10170337/u_10170337.jpg", 5);
		Product product12 = new Product(12, "Lenovo Laptop", "Lenovo", 385.00, "Laptop", "https://images-na.ssl-images-amazon.com/images/I/61hoTcz8p0L._SL1000_.jpg", 5);
		Product product13 = new Product(13, "HP Monitor", "HP", 88.81, "Monitor", "https://images-na.ssl-images-amazon.com/images/I/91tb3AvQSRL._SL1500_.jpg", 4);
		Product product14 = new Product(14, "HP Gaming Monitor", "HP", 169.99, "Monitor", "https://images-na.ssl-images-amazon.com/images/I/41OvamG2sOL.jpg", 4);
		Product product15 = new Product(15, "Dell LED Monitor", "Dell", 228.00, "Monitor", "https://images-na.ssl-images-amazon.com/images/I/71aNs6r9f9L._SL1500_.jpg", 4);
		Product product16 = new Product(16, "Laptop Backpack", "High Sierra", 49.99, "Accessory", "https://images-na.ssl-images-amazon.com/images/I/91rRJjoLSqL._SL1500_.jpg", 5);
		Product product17 = new Product(17, "Acer Laptop", "Acer", 400.00, "Laptop", "https://images-na.ssl-images-amazon.com/images/I/61Yeir0uhIL._SL1322_.jpg", 4);
		Product product18 = new Product(18, "iPhone Charger", "Apple", 12.99, "Accessory", "https://images-na.ssl-images-amazon.com/images/I/51GsTWzi33L._SL1000_.jpg", 4);
		Product product19 = new Product(19, "All-in-one Desktop", "ACER", 655.00, "Desktop", "https://images-na.ssl-images-amazon.com/images/I/81BDDSDDvRL._SL1500_.jpg", 5);
		Product product20 = new Product(20, "MacBook Pro", "Apple", 1249.00, "Laptop", "https://images-na.ssl-images-amazon.com/images/I/61XupUGMB7L._SL1024_.jpg", 5);
		Product product21 = new Product(21, "In-Ear Earbud Headphones", "Panasonic", 15.00, "Accessory", "https://images-na.ssl-images-amazon.com/images/I/71Iu-6R6UPL._SL1500_.jpg", 5);
		
		productRepository.save(product1);
		productRepository.save(product2);
		productRepository.save(product3);
		productRepository.save(product4);
		productRepository.save(product5);
		productRepository.save(product6);
		productRepository.save(product7);
		productRepository.save(product8);
		productRepository.save(product9);
		productRepository.save(product10);
		productRepository.save(product11);
		productRepository.save(product12);
		productRepository.save(product13);
		productRepository.save(product14);
		productRepository.save(product15);
		productRepository.save(product16);
		productRepository.save(product17);
		productRepository.save(product18);
		productRepository.save(product19);
		productRepository.save(product20);
		productRepository.save(product21);
		return productRepository.findAll();
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@RequestMapping(method=RequestMethod.GET, value="/products/{category}",produces=MediaType.APPLICATION_JSON_VALUE )
	public List<Product> showProductsByCategory(@PathVariable String category, @Param(value = "min") Double min, @Param(value = "max") Double max) {
		return productRepositoryCustomImpl.getProductsByCategoryAndPrice(category, min, max);
	}
	
	
	
	
	
	
	
	
//	@CrossOrigin(origins = "http://localhost:4200")
//    @RequestMapping(method=RequestMethod.GET, value="/products",produces=MediaType.APPLICATION_JSON_VALUE )
//	public List<Product> showAll(){
//		return productRepository.findAll();
//	}
	
	/*
	@CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(method=RequestMethod.GET, value="/products/{category}",produces=MediaType.APPLICATION_JSON_VALUE )
	public List<Product> showProductsByCategory(@PathVariable String category){
		return productRepository.findByCategory(category);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(method=RequestMethod.GET, value="/products/{category}",produces=MediaType.APPLICATION_JSON_VALUE )
	public List<Product> showProductsInRange(@PathVariable String category, @Param double min, @Param double max){
	
	}*/
}
