package br.com.cod3r.builder.meal.fluent.model;

public class Pessoa {

    private String nome;

    private String cpf;

    private String cidade;

    private String idade;

    private PessoaBuilder pessoaBuilder = new PessoaBuilder();

    public Pessoa(String nome, String cpf, String cidade, String idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.cidade = cidade;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public static PessoaBuilder builder() {
       return new PessoaBuilder();
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", cidade='" + cidade + '\'' +
                ", idade='" + idade + '\'' +
                '}';
    }

    public static class PessoaBuilder {

        private String nome;
        private String cpf;
        private String cidade;
        private String idade;


        public PessoaBuilder nome(String nome) {
            this.nome = nome;
            return this;
        }
        public PessoaBuilder cpf(String cpf) {
            this.cpf = cpf;
            return this;
        }
        public PessoaBuilder cidade(String cidade) {
            this.cidade = cidade;
            return this;
        }
        public PessoaBuilder idade(String idade) {
            this.idade = idade;
            return this;
        }

        public Pessoa build() {
            return new Pessoa(nome,cpf,cidade,idade);
        }

    }
}
