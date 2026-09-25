package atividadepoo6;

// HERANÇA E IMPLEMENTAÇÃO
public class ContaCorrente extends Conta implements Pagamento {

    // CONSTRUTOR: Repassa os dados para a classe Pai (Conta)
    public ContaCorrente(int numeroConta, String titular, double saldo, Agencia agencia) {
        super(numeroConta, titular, saldo, agencia);
    }

    // IMPLEMENTAÇÃO 1: Dinheiro
    @Override
    public void pagar(double valor) {
        if (valor > 0 && getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
            System.out.println("Pagamento em dinheiro realizado!");
            System.out.println("Novo saldo: R$ " + getSaldo());
        } else {
            System.out.println("Erro: Valor inválido ou saldo insuficiente.");
        }
    }

    // IMPLEMENTAÇÃO 2: PIX
    @Override
    public void pagar(double valor, String chavePix) {
        if (valor > 0 && getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
            System.out.println("Pagamento PIX realizado para a chave: " + chavePix);
            System.out.println("Novo saldo: R$ " + getSaldo());
        } else {
            System.out.println("Erro: Valor inválido ou saldo insuficiente.");
        }
    }

    // IMPLEMENTAÇÃO 3: Cartão
    @Override
    public void pagar(double valor, int parcelas) {
        if (parcelas <= 0) {
            System.out.println("Erro: Quantidade de parcelas inválida.");
            return; // Interrompe o método se a parcela for inválida
        }

        if (valor > 0 && getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
            double valorDaParcela = valor / parcelas;
            System.out.println("Pagamento em Cartão realizado!");
            System.out.println("Dividido em " + parcelas + "x de R$ " + valorDaParcela);
            System.out.println("Novo saldo: R$ " + getSaldo());
        } else {
            System.out.println("Erro: Valor inválido ou saldo insuficiente.");
        }
    }

    // DESAFIO: Método de Transferência
    public void transferir(int contaDestino, double valor) {
        if (valor > 0 && getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
            System.out.println("Transferência de R$ " + valor + " para a conta " + contaDestino + " realizada!");
            System.out.println("Novo saldo: R$ " + getSaldo());
        } else {
            System.out.println("Erro: Valor inválido ou saldo insuficiente.");
        }
    }
}