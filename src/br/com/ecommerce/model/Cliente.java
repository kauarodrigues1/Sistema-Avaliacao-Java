package br.com.ecommerce.model;

public class Cliente {

    private String id;
    private String nome;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cliente() {
    }

    public Cliente(String id) {
        this.id = id;
        this.nome = gerarNomeAleatorio();
    }

    private String gerarNomeAleatorio() {
        String[] nomes = {"Lucas", "Ana", "Rafael", "Julia", "Bruno"};
        String[] sobrenomes = {"Silva", "Souza", "Oliveira", "Santos", "Costa"};

        String nome = nomes[(int) (Math.random() * nomes.length)];
        String sobrenome = sobrenomes[(int) (Math.random() * sobrenomes.length)];

        return nome + " " + sobrenome;
    }

}

