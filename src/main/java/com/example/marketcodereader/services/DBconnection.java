package com.example.marketcodereader.services;
import com.example.marketcodereader.models.Product;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBconnection {
    private java.sql.Connection connection;

    public boolean connect(){
        try {
            String path = "jdbc:sqlite:database/products.db";
            connection = DriverManager.getConnection(path);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public Product getProduct(Long barCode){
        try {
            Statement statement = connection.createStatement();
            String sql = "SELECT code, name, price FROM products WHERE code="+barCode;
            ResultSet rs = statement.executeQuery(sql);
            return new Product(rs.getLong("code"), rs.getString("name"), rs.getDouble("price"));
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public void close() {
        try {
            connection.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
