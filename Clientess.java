public class Clientess extends Pessoa implements Pagamento {

    public Clientess(int codigo, String nome) {
        super(codigo, nome);
    }

    @Override 
    public void pagar(double valor) {
        System.out.println("Pagamento realizado: R$ " + valor);
    }

    // Sobrecarga 1
    public void comprar(String produto) {
        System.out.println("Produto comprado: " + produto);
    }

    // Sobrecarga 2
    public void comprar(String produto, int quantidade) {
        System.out.println("Produto: " + produto + " | Quantidade: " + quantidade);
    }

    // Sobrecarga 3
    public void comprar(String produto, int quantidade, double valor) {
        System.out.println("Produto: " + produto);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor unitário: R$ " + valor);
        System.out.println("Total: R$ " + (quantidade * valor));
    }
}