package atividade.model;

public class Pagamento {

    public Inscricao inscricao;
    public double valorTotal;
    public String dataPagamento;
    public String meioPagamento;
    public String statusPagamento;

    public Pagamento() {
    }

    public Pagamento(Inscricao inscricao, double valorTotal, String dataPagamento,
                     String meioPagamento, String statusPagamento) {
        this.inscricao = inscricao;
        this.valorTotal = valorTotal;
        this.dataPagamento = dataPagamento;
        this.meioPagamento = meioPagamento;
        this.statusPagamento = statusPagamento;
    }

    public String exibirComprovante() {
        String nomeParticipante = (inscricao != null && inscricao.participante != null)
                ? inscricao.participante.nome : "N/A";
        return "Pagamento | Participante: " + nomeParticipante
                + " | Valor: R$ " + String.format("%.2f", valorTotal)
                + " | Método: " + meioPagamento
                + " | Data: " + dataPagamento
                + " | Status: " + statusPagamento;
    }
}