package com.product.inter;

import java.util.List;

import com.product.main.Productinfo;
import com.product.model.Product;

public interface Productin {
	 public Product addProduct(String name,int cost,String discount,int quantity,String url) ;
	    public List<Product> searchProduct(String name, List<Product> prodlist) ;
	     public List<Product> deleteProduct(String name,List<Product> custlist);
		public void updateProduct(String name,int cost,List<Product> custlist);
}
