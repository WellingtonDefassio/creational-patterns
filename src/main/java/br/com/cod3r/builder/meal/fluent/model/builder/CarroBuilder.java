package br.com.cod3r.builder.meal.fluent.model.builder;

import br.com.cod3r.builder.meal.fluent.model.Carro;

public class CarroBuilder {

    private String nome;

    private String modelo;

    private String cor;


    public CarroBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    public CarroBuilder modelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    public CarroBuilder cor(String cor) {
        this.cor = cor;
        return this;
    }

    public Carro build() {
        return new Carro(nome, modelo, cor);
    }

}
