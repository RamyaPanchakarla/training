package com.db.inter;

import java.util.List;

import com.db.model.Product;

public interface DBInnter {

public void addProduct(String name,int cost,String discount,int quantity,String url) ;
public List<Product> searchProduct(String name) ;
public void deleteProduct(String name);
public void updateProduct(String name,int cost);
public List<Product> display();
}