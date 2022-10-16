package com.example.marketcodereader.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Cart {
    private final ArrayList<Product> productList;
    private Long productAmmout = 1L;
    private double total = 0;

    public Cart() {
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product){
        productList.add(product);
    }

    public void removeProduct(Product product){
        productList.remove(product);
    }

    public String getTotalItemsValue(){
        for (Product product: productList){
            total += product.getPrice();
        }
        return String.valueOf(total);
    }

    public void printNote(){
        productList.clear();
    }
    public ArrayList<Product> getProductList(){
        return productList;
    }


}
