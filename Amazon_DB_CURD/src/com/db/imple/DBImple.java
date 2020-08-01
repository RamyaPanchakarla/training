package com.db.imple;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import com.db.connection.ConnectionDB;
import com.db.inter.DBInnter;
import com.db.model.Product;

public class DBImple implements DBInnter {
	@Override

	public void addProduct(String name, int cost, String discount, int quantity, String url) {
		Connection con = ConnectionDB.ConnectiontToDB();

		try {
			String sql = "insert into product values(?,?,?,?,?)";
			PreparedStatement stmt = con.prepareStatement(sql);
			// Product p=new Product();
			stmt.setString(1,name);
			stmt.setInt(2, cost);
			stmt.setString(3,discount);
			stmt.setInt(4,quantity);
			stmt.setString(5 ,url);
			System.out.println(stmt.executeUpdate());
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public List<Product> display() {
		Connection con = ConnectionDB.ConnectiontToDB();
		List<Product> prodlist = new ArrayList<Product>();
		try {
			String sql = "select * from product";
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Product p = new Product();
				p.setName(rs.getString(1));
				p.setCost(rs.getInt(2));
				p.setDiscount(rs.getString(3));
				p.setQuantity(rs.getInt(4));
				p.setUrl(rs.getString(5));
				prodlist.add(p);

			}

		}

		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return prodlist;

	}

	@Override
	public List<Product> searchProduct(String name) {
		// Product[] pr=new Product[arr1.length];
		// int j=0;
		//List<Product> n = new ArrayList<Product>();
		Connection con = ConnectionDB.ConnectiontToDB();	
		List<Product> prodlist = new ArrayList<Product>();
		Product p = new Product();
		try {
			String sql = "select * from product where productname=?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1,name);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {				
				if(name.equals(rs.getString(1))) {					
					p.setName(rs.getString(1));
					p.setName(rs.getString(1));
					p.setCost(rs.getInt(2));
					p.setDiscount(rs.getString(3));
					p.setQuantity(rs.getInt(4));
					p.setUrl(rs.getString(5));
					prodlist.add(p);
				}
			}
		}
					
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return prodlist;
		
		/*{
			for (Product x : prodlist) {
				if (name.equals(x.getName())) {
					n.add(x);
				}
			}
		}
		return n;*/

	}

	@Override
	public void deleteProduct(String name) {
		// TODO Auto-generated method stub
		// List<Product> n= new ArrayList<Product>();
		Connection con = ConnectionDB.ConnectiontToDB();

		try {
			String sql = "delete from product where productname=?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1,name);
			stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		{
			/*
			 * for (Product x:custlist) { if(name.equals(x.getName())) { custlist.remove(x);
			 * break; } }
			 * 
			 * 
			 * return custlist;
			 */
		}

	}

	@Override
	public void updateProduct(String name, int cost) {
		
		
		// TODO Auto-generated method stub
		
		
		Connection con = ConnectionDB.ConnectiontToDB();

		try {
			String sql = "update product set cost=? WHERE productname=?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1,cost);	
			stmt.setString(2,name);	
			stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		/*for (Product p : custlist) {
			if (name.equals(p.getName())) {
				p.setCost(cost);
			}

		}*/
		

	}

}
