package atividade.model;

public class Certificado {

    public Participante participante;
    public Evento evento;
    public int horasComprovadas;
    public String dataEmissao;
    public String chaveAutenticidade;

    public Certificado() {
    }

    public Certificado(Participante participante, Evento evento,
                       int horasComprovadas, String dataEmissao, String chaveAutenticidade) {
        this.participante = participante;
        this.evento = evento;
        this.horasComprovadas = horasComprovadas;
        this.dataEmissao = dataEmissao;
        this.chaveAutenticidade = chaveAutenticidade;
    }

    public String emitirCertificado() {
        String nomeParticipante = (participante != null) ? participante.nome : "N/A";
        String nomeEvento = (evento != null) ? evento.titulo : "N/A";
        return "Certificado | Aluno: " + nomeParticipante
                + " | Evento: " + nomeEvento
                + " | Carga Horária: " + horasComprovadas + "h"
                + " | Emitido em: " + dataEmissao
                + " | Chave: " + chaveAutenticidade;
    }
}