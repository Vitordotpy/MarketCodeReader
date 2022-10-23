package com.example.marketcodereader.models;

public class Client {
    private String name;
    private String CPF;

    public Client(String name, String CPF) {
        this.name = name;
        this.CPF = CPF;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}
