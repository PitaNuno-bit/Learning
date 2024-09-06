package com.programacao.web.fatec.api_fatec.entities;

public class User {
    private String name;
    private Integer age;

    // Construtor padrão
    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    // Getters e Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}