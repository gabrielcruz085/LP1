package atividade.model;

public class Evento {

    public String nome;
    public String descricao;
    public String data;
    public String horario;
    public String local;
    public String tema;
    public String modalidade;
    public String situacao;

    public Evento() {
    }

    public Evento(String nome, String descricao, String data, String horario,
                  String local, String tema, String modalidade, String situacao) {
        this.nome = nome;
        this.descricao = descricao;
        this.data = data;
        this.horario = horario;
        this.local = local;
        this.tema = tema;
        this.modalidade = modalidade;
        this.situacao = situacao;
    }

    public String resumo() {
        return "Evento: " + nome + " | Data: " + data + " às " + horario
                + " | Local: " + local + " | Modalidade: " + modalidade
                + " | Situação: " + situacao;
    }
}
