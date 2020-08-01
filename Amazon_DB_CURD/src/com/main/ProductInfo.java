package com.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.db.imple.DBImple;
import com.db.model.Product;
import com.db.utilities.Utilities;

public class ProductInfo {
	public static void main(String[] args) {
		List<Product> l = new ArrayList<Product>();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of products");
		int size = sc.nextInt();
	//	Product arr[] = new Product[size];
	DBImple obj = new DBImple();
		while (true) {
			System.out.println("press 1 to add" + "\npress 2 to display" + "\npress 3 to search"+ "\npress 4 to delete"+ "\npress 5 to update");
			System.out.println("choose an option");
			int option = sc.nextInt();
			switch (option) {
			case 1:
				//for (int i = 0; i < size; i++) {
					String name=null;
					while(true) {
					System.out.println("enter the productname");
					name = sc.next();
					try {
						Utilities.validateName(name);
					break;
					}
					catch (Exception e) {
					System.out.println(e.getMessage());	
					
				}
					}
					System.out.println("enter the productcost");
					String cost = sc.next();
					int cost1=Integer.parseInt(cost);
					System.out.println("enter the product discount");
					String discount = sc.next();	
					System.out.println("enter the productquantity");
					String quantity = sc.next();
					int quantity1=Integer.parseInt(quantity);	
				String url=null;
				while(true) {
					System.out.println("enter the URL");
					  url = sc.next();
					try {
					Utilities.urlValidation(url);
						break;
					}
					catch (Exception e) {
						System.out.println(e.getMessage());	
					}
					}
				//	Productin obj = new Productimp();

				 obj.addProduct(name,cost1,discount,quantity1,url);
					 //arr[i]=pr;
					//l.add(pr);
					
				
				
				break;

			case 2:
				
				List<Product> pr= obj.display();
				for (Product c : pr) {
					System.out.println(c);
				}
				break;

			case 3:
				
				String name1=null;
				while(true) {
					System.out.println("enter product name to search");
				 name = sc.next();		
				
				try {
					Utilities.validateName(name);
				break;
				}
				catch (Exception e) {
				System.out.println(e.getMessage());	
				
			}
				}
				
			List<Product> n= obj.searchProduct(name);
				if (n.size()==0) {				
					System.out.println("product not found");
				}
				 else {
					for (Product z : n) {			
							System.out.println(z);
					}
				 
				}
						
				break;		
			case 4:	
				String pname=null;
				while(true) {
					System.out.println("enter product name to Delete");
				pname = sc.next();		
				
				try {
					Utilities.validateName(pname);
				break;
				}
				catch (Exception e) {
				System.out.println(e.getMessage());	
				
			}
				}			
				//System.out.println("enter product name to delete");
				//String pname = sc.next();
				 // Productin pro1 = new Productimp();			
				//l = obj.deleteProduct(pname,l);
				 obj.deleteProduct(pname);
				for(Product q:l) {
				
				System.out.println(q);
				}
				break;
				
			case 5:	
				
				String name2 = null;
				while(true) {
					System.out.println("enter product name to update");
				 name2 = sc.next();		
				
				try {
					Utilities.validateName(name2);
				break;
				}
				catch (Exception e) {
				System.out.println(e.getMessage());	
				
				
			}
				}
				
			//	System.out.println("enter the name");
			//	String name1 =sc.next();
				System.out.println("enter the updated cost");
				String cost2= sc.next();	
				int cost3=Integer.parseInt(cost2) ;			
				//Productin up= new Productimp();
				obj.updateProduct(name2, cost3);
				System.out.println("Value is updated sucessfully.");
				
				
			}
		}
	}
}
