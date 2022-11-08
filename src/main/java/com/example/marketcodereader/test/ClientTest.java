package com.example.marketcodereader.test;

import com.example.marketcodereader.models.Client;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClientTest {

    @Test
    public void getName() {
        Client client = new Client("Alyson", "XXX.XXX.XXX-XX");
        Assert.assertEquals("Alyson", client.getName());
    }

    @Test
    public void getCPF() {
        Client client = new Client("Guilherme", "YYY.YYY.YYY-YY");
        Assert.assertEquals("YYY.YYY.YYY-YY", client.getCPF());
    }
}