package atividade.model;

public class Pagamento {

    public double valor;
    public String data;
    public String formaPagamento;
    public String status;

    public Pagamento() {
    }

    public Pagamento(double valor, String data, String formaPagamento, String status) {
        this.valor = valor;
        this.data = data;
        this.formaPagamento = formaPagamento;
        this.status = status;
    }

    public String resumo() {
        return "Pagamento | Valor: R$ " + String.format("%.2f", valor)
                + " | Forma: " + formaPagamento
                + " | Data: " + data
                + " | Status: " + status;
    }
}
