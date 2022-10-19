package com.example.marketcodereader;

import com.example.marketcodereader.models.Cart;
import com.example.marketcodereader.models.Product;
import com.example.marketcodereader.services.DBconnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.Arrays;
import java.util.List;

public class MainScreenController {
    @FXML
    private Button btnPop;
    @FXML
    private TextField edtBarCode;
    @FXML
    private Label txtTotal;
    @FXML
    private ListView<String> listView;
    @FXML
    private TableView<Product> tableView;
    @FXML
    private TableColumn<Product, Long> tbColumnCode;
    @FXML
    private TableColumn<Product, String> tbColumnName;
    @FXML
    private TableColumn<Product, String> tbColumnPrice;

    private final DBconnection db = new DBconnection();
    private final Cart cart = new Cart();

    private Product selectedItem;



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
        tbColumnCode.setCellValueFactory(new PropertyValueFactory<Product, Long>("code"));
        tbColumnName.setCellValueFactory(new PropertyValueFactory<Product, String>("name"));
        tbColumnPrice.setCellValueFactory(new PropertyValueFactory<Product, String>("price"));

        tableView.getItems().clear();

        for (Product product : cart.getProductList()){
            tableView.getItems().add(product);
        }
        txtTotal.setText(this.cart.getTotalItemsValue());

        tableView.setOnMouseClicked(mouseEvent -> {
            selectedItem = tableView.getSelectionModel().getSelectedItems().get(0);
            btnPop.setVisible(true);
        });
    }

    public void btnPopOnAction(ActionEvent event) {
        if (selectedItem!= null){
            tableView.getItems().remove(selectedItem);
            cart.removeProduct(selectedItem);
            updateListView();
            btnPop.setVisible(false);
        }
    }

    public void btnPrintNoteOnAction(ActionEvent event) {
        this.cart.printNote();
        updateListView();
    }

}