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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

    private String selectedItem;


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
        for (Product product : cart.getProductList()){
            String productText = product.getCode() + "/" + product.getName() + "/" + product.getPrice();
            listView.getItems().add(productText);
        }
        txtTotal.setText(this.cart.getTotalItemsValue());
        listView.getSelectionModel().selectionModeProperty().addListener(this::selectionChanged);

    }

    private void selectionChanged(Observable observable) {
        selectedItem = listView.getSelectionModel().getSelectedItems().get(0);
    }

    public void btnPopOnAction(ActionEvent event) {
        if (selectedItem!= null){
            listView.getItems().remove(selectedItem);
            List<String> colunms = Arrays.stream(selectedItem.split("/")).toList();
            Product product = new Product(Long.valueOf(colunms.get(0)), String.valueOf(colunms.get(0)), Double.parseDouble(colunms.get(0)));
            cart.removeProduct(product);
            updateListView();
        }
    }

    public void btnPrintNoteOnAction(ActionEvent event) {
        this.cart.printNote();
        updateListView();
    }

}