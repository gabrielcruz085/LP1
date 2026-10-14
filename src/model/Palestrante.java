package atividade.model;

public class Palestrante {

    public String nome;
    public String cpf;
    public String email;
    public String instituicaoOrigem;
    public String grauAcademico;
    public String especialidade;
    public String resumoProfissional;

    public Palestrante() {
    }

    public Palestrante(String nome, String cpf, String email, String instituicaoOrigem,
                       String grauAcademico, String especialidade, String resumoProfissional) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.instituicaoOrigem = instituicaoOrigem;
        this.grauAcademico = grauAcademico;
        this.especialidade = especialidade;
        this.resumoProfissional = resumoProfissional;
    }

    public String exibirPerfil() {
        return "Palestrante: " + nome + " (" + grauAcademico + ")"
                + " | Instituição: " + instituicaoOrigem
                + " | Especialidade: " + especialidade
                + " | E-mail: " + email;
    }
}
