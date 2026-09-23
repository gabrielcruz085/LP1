package atividade.model;

public class Certificado {

    public Participante participante;
    public Evento evento;
    public int cargaHoraria;
    public String dataEmissao;
    public String codigoValidacao;

    public Certificado() {
    }

    public Certificado(Participante participante, Evento evento,
                       int cargaHoraria, String dataEmissao, String codigoValidacao) {
        this.participante = participante;
        this.evento = evento;
        this.cargaHoraria = cargaHoraria;
        this.dataEmissao = dataEmissao;
        this.codigoValidacao = codigoValidacao;
    }

    public String resumo() {
        String nomeParticipante = (participante != null) ? participante.nome : "N/A";
        String nomeEvento = (evento != null) ? evento.nome : "N/A";
        return "Certificado | Participante: " + nomeParticipante
                + " | Evento: " + nomeEvento
                + " | Carga horária: " + cargaHoraria + "h"
                + " | Emitido em: " + dataEmissao
                + " | Código: " + codigoValidacao;
    }
}