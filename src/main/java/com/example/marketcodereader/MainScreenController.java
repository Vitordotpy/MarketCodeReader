package com.example.marketcodereader;

import com.example.marketcodereader.models.Cart;
import com.example.marketcodereader.models.Product;
import com.example.marketcodereader.services.DBconnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainScreenController {
    @FXML
    private Button btnAdd;
    @FXML
    private Button btnPop;
    @FXML
    private Button btnPrintNote;
    @FXML
    private Button btnClose;
    @FXML
    private TextField edtBarCode;
    @FXML
    private Label txtTotal;
    @FXML
    private ListView<String> listView;

    private DBconnection db;
    private Cart cart;


    public void btnAddOnAction(ActionEvent event) {
        db.connect();
        Product product = db.getProduct(Long.valueOf(edtBarCode.getText()));
        if(product != null){
            cart.addProduct(product);
            updateListView();
        }
        db.close();
    }

    private void updateListView() {
    }

    public void btnPopOnAction(ActionEvent event) {
        db.connect();
        Product product = db.getProduct(Long.valueOf(edtBarCode.getText()));
        if(product != null){
            cart.removeProduct(product);
        }
        db.close();
    }

    public void btnPrintNoteOnAction(ActionEvent event) {
        cart.printNote();
    }

    public void btnCloseOnAction(ActionEvent event) {
        Stage stage = (Stage) btnClose.getScene().getWindow();
        stage.close();
    }
}