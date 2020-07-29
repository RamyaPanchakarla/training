package com.arwizon.product.main;

import java.util.Scanner;

import com.arwizon.product.modle.Product;

public class Productinfo  {
	public static void main (String[]args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = scr.nextInt();
		Product[] arr=new [size];
		System.out.println("press 1 to add new customer"+"\n press 2 to display customer"+"\n press 3 to search customer"+"\n press to exist");
		
		while(true) {
			System.out.println("please enter the option");
			int option=scr.nextInt();
			 
			switch(option) {
			case 1:
				for (int i=0;i<size;i++)
				{
					System.out.println("enter name");
					String name=scr.next();
					Customerr c= new Customerr();
					c.setName(name);
					System.out.println("enter address");
					String address=scr.next();
					c.setAddress(address);
					System.out.println("enter accType");
					String accType=scr.next();
					c.setAccType(accType);
					c.setCustomerId(Customerr.getCount());
					
	                 arr[i] =c;
					
				}
					break;
					
					case 2:
						for(Customerr c:arr) {
						System.out.println(c);
							 
						}
						break;
					
					case 3:
						if(arr[0]!=null) {
				
						System.out.println("enter the name");
						String name=scr.next();
						int j=0;
						
						for(int i=0;i<size;i++) 
						{
							
					
							
							
							if (name.equals(arr[i].getName()))
							{
								System.out.println(arr[i]);
								
				                   j++;
				                   break;
						     }
						
						}
						
					
					if(j==0) 
					{
						System.out.println("no customer found");
					}
						}
			   
						
			                 break;
					case 4:
						 System.exit(1);
						default:
							System.out.println("please enter the correct namne");
			
			}
		        }
	}
}

	
		    

	
			            
		
					
						
					
					
				
			
		
	

