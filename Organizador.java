package atividade.model;

public class Organizador {

    public String nome;
    public String cpf;
    public String email;
    public String telefone;
    public String cargo;
    public String instituicao;

    public Organizador() {
    }

    public Organizador(String nome, String cpf, String email, String telefone, String cargo, String instituicao) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.cargo = cargo;
        this.instituicao = instituicao;
    }

    public String exibirInformacoes() {
        return "Organizador: " + nome + " (" + cargo + ")"
                + " | Instituição: " + instituicao
                + " | E-mail: " + email
                + " | Telefone: " + telefone
                + " | CPF: " + cpf;
    }
}