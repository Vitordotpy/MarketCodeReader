package com.example.marketcodereader.test;

import com.example.marketcodereader.models.Cart;
import com.example.marketcodereader.models.Client;
import com.example.marketcodereader.models.Note;
import com.example.marketcodereader.models.Product;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NoteTest {

    @Test
    public void print() {
        Client client = new Client("Alyson", "XXX.XXX.XXX-XX");

        Product product1 = new Product((long) 4, "carne", 37.99);

        Cart cart = new Cart();
        cart.addProduct(product1);

        Note note = new Note(client, cart);
        Assert.assertEquals(
                "Nome: Alyson\n" +
                        "CPF/CNPJ: XXX.XXX.XXX-XX\n" +
                        "Produtos: \n" +
                        "carne R$ 37.99\n"+
                "Volte Sempre!",
                note.toString());
    }
}