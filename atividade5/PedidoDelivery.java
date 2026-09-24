package atividade5;

public class PedidoDelivery extends Pedido implements Pagamento {
    
    // Atributos exclusivos do Delivery
    private String endereco;
    private double taxaEntrega;

    public PedidoDelivery(int numero, String nomeCliente, double valor, String endereco, double taxaEntrega) {
        super(numero, nomeCliente, valor);
        this.endereco = endereco;
        this.taxaEntrega = taxaEntrega;
    }

    // Lógica para somar a taxa de entrega ao valor que o cliente precisa pagar
    public double getValorTotal() {
        return getValor() + this.taxaEntrega;
    }

    @Override
    public void realizarPagamento(double valorPago) {
        System.out.println("Pagamento em DINHEIRO (Delivery) processado.");
        System.out.println("Total (com taxa de R$ " + this.taxaEntrega + "): R$ " + getValorTotal());
    }

    @Override
    public void realizarPagamento(double valorPago, String chavePix) {
        System.out.println("Pagamento em PIX (Delivery) processado.");
        System.out.println("Chave: " + chavePix);
        System.out.println("Total (com taxa de R$ " + this.taxaEntrega + "): R$ " + getValorTotal());
    }

    @Override
    public void realizarPagamento(double valorPago, int parcelas) {
        System.out.println("Pagamento no CARTÃO (Delivery) processado.");
        System.out.println("Parcelado em: " + parcelas + "x");
        System.out.println("Total (com taxa de R$ " + this.taxaEntrega + "): R$ " + getValorTotal());
    }

    @Override
    public void mostrarDados() {
        System.out.println("--- TIPO: PEDIDO DELIVERY ---");
        super.mostrarDados();
        System.out.println("Endereço de Entrega: " + this.endereco);
        System.out.println("Taxa de Entrega: R$ " + this.taxaEntrega);
    }
}