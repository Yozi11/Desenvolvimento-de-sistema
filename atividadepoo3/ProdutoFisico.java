package atividadepoo3;
// HERANÇA (extends Produto) + INTERFACE (implements Venda)

public class ProdutoFisico extends Produto implements Venda {
    
    // Atributo específico apenas do produto físico
    private double frete;

    // Construtor: Repassa código, nome e preço para a classe Pai e guarda o frete localmente
    public ProdutoFisico(int codigo, String nome, double preco, double frete) {
        super(codigo, nome, preco); // Executa o construtor de Produto
        this.frete = frete;
    }

    // Getter e Setter do atributo exclusivo 'frete'
    public double getFrete() {
        return this.frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }

    // IMPLEMENTAÇÃO DA INTERFACE: Cálculo para produto físico (inclui o valor do frete)
    @Override
    public double calcularVenda(int quantidade) {
        return (getPreco() * quantidade) + this.frete;
    }

    // SOBRECARGA DA INTERFACE: Aplica desconto percentual no valor dos produtos e soma o frete
    @Override
    public double calcularVenda(int quantidade, double percentualDesconto) {
        double totalProdutos = getPreco() * quantidade;
        double valorDesconto = totalProdutos * (percentualDesconto / 100.0);
        return (totalProdutos - valorDesconto) + this.frete;
    }

    // Sobrescreve o método de exibição para mostrar o valor do frete
    @Override
    public void mostrarDados() {
        System.out.println("--- PRODUTO FÍSICO ---");
        super.mostrarDados(); // Exibe código, nome e preço
        System.out.println("Valor do Frete: R$ " + this.frete);
    }
}