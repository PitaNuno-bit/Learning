package com.fatec.controle_financeiro.entities;
 
public class Client {
    private int id;
    private String name;
 
    public Client() {
    }
 
    // Construtor
    public Client(int id, String nome) {
        this.id = id;
        this.name = nome;
    }
 
    // Métodos

    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
}