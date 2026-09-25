package atividadepoo3;
// HERANÇA (extends Produto) + INTERFACE (implements Venda)

public class ProdutoDigital extends Produto implements Venda {

    // Construtor: Não recebe frete pois produtos digitais não cobram entrega
    public ProdutoDigital(int codigo, String nome, double preco) {
        super(codigo, nome, preco);
    }

    // IMPLEMENTAÇÃO DA INTERFACE: Cálculo simples sem frete
    @Override
    public double calcularVenda(int quantidade) {
        return getPreco() * quantidade;
    }

    // SOBRECARGA DA INTERFACE: Aplica desconto percentual sem frete
    @Override
    public double calcularVenda(int quantidade, double percentualDesconto) {
        double totalProdutos = getPreco() * quantidade;
        double valorDesconto = totalProdutos * (percentualDesconto / 100.0);
        return totalProdutos - valorDesconto;
    }

    // Exibe a identificação de produto digital
    @Override
    public void mostrarDados() {
        System.out.println("--- PRODUTO DIGITAL ---");
        super.mostrarDados();
        System.out.println("Frete: R$ 0,00 (Isento - Envio Digital)");
    }
}