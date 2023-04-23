package br.com.cod3r.builder.meal.fluent;

import br.com.cod3r.builder.meal.fluent.model.Pessoa;

public class Client2 {

    public static void main(String[] args) {


        Pessoa pessoa = Pessoa.builder().cpf("123456").cidade("londrina").idade("26").nome("maria").build();

        Pessoa build = Pessoa.builder().build();

        System.out.println(build);


    }

}
