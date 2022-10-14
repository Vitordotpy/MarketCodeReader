package com.example.marketcodereader.models;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private final HashMap<Product, Long> productList;
    private Long productAmmout = 1L;
    private double total = 0;

    public Cart() {
        this.productList = new HashMap<>();
    }

    public void addProduct(Product product){
        if(productList.containsKey(product)){
            productAmmout = productList.get(product);
            productList.replace(product, productAmmout, productAmmout +1);
        }else {
            productList.put(product, productAmmout);
        }
    }

    public void removeProduct(Product product){
        if(productList.containsKey(product)){
            productAmmout = productList.get(product);
            if(productAmmout > 1){
                productList.replace(product, productAmmout-1);
            }else {
                productList.remove(product);
            }
        }else {
            System.out.println("Cannot remove the product "+ product.getName() + "because he isn't on the cart");
        }
    }

    public String getTotalItemsValue(){
        for (Map.Entry<Product, Long> set: productList.entrySet()){
            total += set.getKey().getPrice();
        }
        return String.valueOf(total);
    }

    public void printNote(){
        productList.clear();
    }

    public HashMap<Product, Long> getProductList(){
        return productList;
    }


}
