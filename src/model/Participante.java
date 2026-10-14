package atividade.model;

public class Participante {

    public String nome;
    public String cpf;
    public String email;
    public String telefone;
    public String instituicaoEnsino;
    public String curso;
    public String tipoInscricao;

    public Participante() {
    }

    public Participante(String nome, String cpf, String email, String telefone,
                        String instituicaoEnsino, String curso, String tipoInscricao) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.instituicaoEnsino = instituicaoEnsino;
        this.curso = curso;
        this.tipoInscricao = tipoInscricao;
    }

    public String exibirDados() {
        return "Participante: " + nome + " | CPF: " + cpf
                + " | E-mail: " + email + " | Tel: " + telefone
                + " | Instituição: " + instituicaoEnsino + " | Curso: " + curso
                + " | Categoria: " + tipoInscricao;
    }
}
