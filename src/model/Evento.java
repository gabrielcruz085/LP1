package atividade.model;

public class Evento {

    public String titulo;
    public String descricao;
    public String data;
    public String horarioInicio;
    public String local;
    public String tematica;
    public String modalidade;
    public String status;

    public Evento() {
    }

    public Evento(String titulo, String descricao, String data, String horarioInicio,
                  String local, String tematica, String modalidade, String status) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
        this.horarioInicio = horarioInicio;
        this.local = local;
        this.tematica = tematica;
        this.modalidade = modalidade;
        this.status = status;
    }

    public String obterDetalhes() {
        return "Evento: " + titulo + " | Data: " + data + " às " + horarioInicio
                + " | Local: " + local + " | Tema: " + tematica
                + " | Modalidade: " + modalidade + " | Status: " + status;
    }
}
