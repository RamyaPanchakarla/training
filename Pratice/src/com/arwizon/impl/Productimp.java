package com.arwizon.impl;


import java.util.*;


import com.product.inter.Productin;
import com.product.model.Product;

public class Productimp implements Productin {

	@Override
	public Product addProduct(String name,int cost,String discount,int quantity,String url) {
		Product p=new Product();
		p.setName(name);	
		p.setCost(cost);
		p.setDiscount(discount);
		p.setQuantity(quantity);
		p.setUrl(url);
		
		return p;
	}

	@Override
	public List<Product> searchProduct(String name,List<Product> prodlist) {
		//Product[] pr=new Product[arr1.length];
		//int j=0;
		List<Product> n=new ArrayList<Product>();
		{
			for (Product x:prodlist)
			{
				if(name.equals(x.getName()))
				{
					n.add(x);
				}
			}
		}
		return n;	
		
	}
	@Override
	public List<Product> deleteProduct(String name, List<Product> custlist) {
		// TODO Auto-generated method stub		
		// List<Product> n= new ArrayList<Product>();
		{
			for (Product x:custlist)
			{
				if(name.equals(x.getName()))
				{
					custlist.remove(x);
					 break;
			}
		}
		
		
		return custlist;
	}
	
	}

	@Override
	public void updateProduct(String name,int cost,List<Product> custlist) {	
		// TODO Auto-generated method stub
		for(Product p:custlist) {
		if(name.equals(p.getName())) {
				p.setCost(cost);
			}
		
		
	}
		
		
			
	}
}

	

	

	

	


