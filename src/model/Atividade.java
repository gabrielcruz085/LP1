package atividade.model;

public class Atividade {

    public String tituloAtividade;
    public String descricao;
    public String categoria;
    public String data;
    public String horarioInicio;
    public String horarioTermino;
    public String local;
    public Evento evento;

    public Atividade() {
    }

    public Atividade(String tituloAtividade, String descricao, String categoria,
                     String data, String horarioInicio, String horarioTermino,
                     String local, Evento evento) {
        this.tituloAtividade = tituloAtividade;
        this.descricao = descricao;
        this.categoria = categoria;
        this.data = data;
        this.horarioInicio = horarioInicio;
        this.horarioTermino = horarioTermino;
        this.local = local;
        this.evento = evento;
    }

    public String exibirAtividade() {
        String nomeEvento = (evento != null) ? evento.titulo : "N/A";
        return "Atividade: " + tituloAtividade + " (" + categoria + ")"
                + " | Evento: " + nomeEvento
                + " | Data: " + data + " | Horário: " + horarioInicio + " às " + horarioTermino
                + " | Local: " + local;
    }
}
