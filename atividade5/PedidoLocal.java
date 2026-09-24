package atividade5;

// HERANÇA E INTERFACE
public class PedidoLocal extends Pedido implements Pagamento {

    public PedidoLocal(int numero, String nomeCliente, double valor) {
        super(numero, nomeCliente, valor); // Envia os dados para a classe mãe
    }

    // Implementação da Sobrecarga 1 (Dinheiro)
    @Override
    public void realizarPagamento(double valorPago) {
        System.out.println("Pagamento em DINHEIRO processado.");
        System.out.println("Valor recebido: R$ " + valorPago);
    }

    // Implementação da Sobrecarga 2 (PIX)
    @Override
    public void realizarPagamento(double valorPago, String chavePix) {
        System.out.println("Pagamento em PIX processado.");
        System.out.println("Chave utilizada: " + chavePix);
        System.out.println("Valor recebido: R$ " + valorPago);
    }

    // Implementação da Sobrecarga 3 (Cartão)
    @Override
    public void realizarPagamento(double valorPago, int parcelas) {
        System.out.println("Pagamento no CARTÃO processado.");
        System.out.println("Parcelado em: " + parcelas + "x");
        System.out.println("Valor total: R$ " + valorPago);
    }

    @Override
    public void mostrarDados() {
        System.out.println("--- TIPO: PEDIDO LOCAL ---");
        super.mostrarDados();
    }
}