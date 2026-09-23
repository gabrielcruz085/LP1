package atividade.model;

public class Atividade {

    public String horario;
    public String local;
    public String descricao;
    public Palestrante responsavel;
    public Evento evento;

    public Atividade() {
    }

    public Atividade(String horario, String local, String descricao,
                     Palestrante responsavel, Evento evento) {
        this.horario = horario;
        this.local = local;
        this.descricao = descricao;
        this.responsavel = responsavel;
        this.evento = evento;
    }

    public String resumo() {
        String nomeResponsavel = (responsavel != null) ? responsavel.nome : "N/A";
        return "Atividade: " + descricao + " | Horário: " + horario
                + " | Local: " + local + " | Responsável: " + nomeResponsavel;
    }
}