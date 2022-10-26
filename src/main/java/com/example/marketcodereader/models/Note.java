package com.example.marketcodereader.models;

public class Note extends Client{
    private final Cart cart;

    public Note(Client client, Cart cart) {
        super(client.getName(), client.getCPF());
        this.cart = cart;
    }
    @Override
    public String toString(){
        String string = "Nome: "+ getName() +"\n" + "CPF/CNPJ: " + getCPF() +"\n" + "Produtos: " + "\n";
        for (Product product : cart.getProductList()){
            string = string.concat(product.getName() + " R$ " + product.getPrice() + "\n");
        }
        string =string.concat("Volte Sempre!");
        return string;
    }

}
