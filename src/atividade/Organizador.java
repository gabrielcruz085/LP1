package atividade.model;

public class Organizador {

    public String nome;
    public String email;

    public Organizador() {
    }

    public Organizador(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String resumo() {
        return "Organizador: " + nome + " | E-mail: " + email;
    }
}
