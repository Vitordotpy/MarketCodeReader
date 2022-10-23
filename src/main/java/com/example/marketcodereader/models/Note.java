package com.example.marketcodereader.models;

public class Note extends Client{
    private final Cart cart;

    public Note(Client client, Cart cart) {
        super(client.getName(), client.getCPF());
        this.cart = cart;
    }

    public String print(){
        String string = "Nome: "+ getName() +"\n" + "CPF/CNPJ: " + getCPF() +"\n" + "Produtos: " + "\n";
        for (Product product : cart.getProductList()){
            string = string.concat(product.getName() + " " + product.getPrice() + "\n");
        }
        return string;
    }

}
