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
            string = string.concat(String.format("%s R$ %.2f \n",product.getName(),product.getPrice()));
        }
        string =string.concat("Volte Sempre!");
        return string;
    }

}
