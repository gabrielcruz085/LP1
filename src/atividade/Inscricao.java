package atividade.model;

public class Inscricao {

    public Participante participante;
    public Evento evento;
    public String dataInscricao;
    public String status;
    public String tipoInscricao;

    public Inscricao() {
    }

    public Inscricao(Participante participante, Evento evento,
                     String dataInscricao, String status, String tipoInscricao) {
        this.participante = participante;
        this.evento = evento;
        this.dataInscricao = dataInscricao;
        this.status = status;
        this.tipoInscricao = tipoInscricao;
    }

    public String resumo() {
        String nomeParticipante = (participante != null) ? participante.nome : "N/A";
        String nomeEvento = (evento != null) ? evento.nome : "N/A";
        return "Inscrição de: " + nomeParticipante + " no evento: " + nomeEvento
                + " | Data: " + dataInscricao + " | Status: " + status
                + " | Tipo: " + tipoInscricao;
    }
}
