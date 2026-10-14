package atividade.model;

public class Inscricao {

    public Participante participante;
    public Evento evento;
    public String dataInscricao;
    public String situacao;
    public String modalidadeInscricao;

    public Inscricao() {
    }

    public Inscricao(Participante participante, Evento evento,
                     String dataInscricao, String situacao, String modalidadeInscricao) {
        this.participante = participante;
        this.evento = evento;
        this.dataInscricao = dataInscricao;
        this.situacao = situacao;
        this.modalidadeInscricao = modalidadeInscricao;
    }

    public String exibirInscricao() {
        String nomeParticipante = (participante != null) ? participante.nome : "N/A";
        String nomeEvento = (evento != null) ? evento.titulo : "N/A";
        return "Inscrição: " + nomeParticipante + " no evento " + nomeEvento
                + " | Data: " + dataInscricao + " | Situação: " + situacao
                + " | Modalidade: " + modalidadeInscricao;
    }
}