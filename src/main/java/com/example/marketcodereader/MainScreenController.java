package com.example.marketcodereader;

import com.example.marketcodereader.models.Cart;
import com.example.marketcodereader.models.Product;
import com.example.marketcodereader.services.DBconnection;
import javafx.beans.Observable;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.util.Map;

public class MainScreenController {
    @FXML
    private TextField edtBarCode;
    @FXML
    private Label txtTotal;
    @FXML
    private ListView<String> listView;

    private final DBconnection db = new DBconnection();
    private final Cart cart = new Cart();


    public void btnAddOnAction(ActionEvent event) {
        this.db.connect();
        Product product = this.db.getProduct(Long.valueOf(edtBarCode.getText()));
        if(product != null){
            this.cart.addProduct(product);
            updateListView();
        }
        this.db.close();
    }

    private void updateListView() {
        listView.getItems().clear();
        for (Map.Entry<Product, Long> set: this.cart.getProductList().entrySet()){
            String productText = set.getKey().getCode() + " " + set.getKey().getName() + " " + set.getKey().getPrice();
            listView.getItems().add(productText);
        }
        txtTotal.setText(this.cart.getTotalItemsValue());
        listView.getSelectionModel().selectionModeProperty().addListener(this::selectionChanged);

    }

    private void selectionChanged(Observable observable) {
        ObservableList<String> selectedItem = listView.getSelectionModel().getSelectedItems();
    }

    public void btnPopOnAction(ActionEvent event) {
        this.db.connect();
        Product product = this.db.getProduct(Long.valueOf(edtBarCode.getText()));
        if(product != null){
            this.cart.removeProduct(product);
            updateListView();
        }
        this.db.close();
    }

    public void btnPrintNoteOnAction(ActionEvent event) {
        this.cart.printNote();
    }

}