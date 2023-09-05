package com.example.crudjava;

import java.time.LocalDate;

public class Pessoa {
    private String name;
    private int idade;

    public Pessoa(String name, int idade) {
        this.name = name;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public boolean ehMaior(){
        return getIdade() >=  18;
    }
}
