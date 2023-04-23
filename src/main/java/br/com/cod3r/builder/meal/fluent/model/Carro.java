package br.com.cod3r.builder.meal.fluent.model;

import br.com.cod3r.builder.meal.fluent.model.builder.CarroBuilder;

public class Carro {

    private String nome;

    private String modelo;

    private String cor;


    public Carro(String nome, String modelo, String cor) {
        this.nome = nome;
        this.modelo = modelo;
        this.cor = cor;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public static CarroBuilder builder() {
        return new CarroBuilder();
    }
}
