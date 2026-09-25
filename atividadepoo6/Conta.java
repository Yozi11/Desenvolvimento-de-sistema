package atividadepoo6;
public class Conta {
    // Atributos da conta
    private int numeroConta;
    private String titular;
    private double saldo;
    private Agencia agencia; // COMPOSIÇÃO: A conta tem uma Agência ligada a ela

    // CONSTRUTOR
    public Conta(int numeroConta, String titular, double saldo, Agencia agencia) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
        this.agencia = agencia;
    }

    // GETTERS
    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // SETTER PARA O SALDO (Para podermos alterar o saldo na hora de pagar)
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Método para depositar (com validação para não aceitar zero ou negativo)
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo = this.saldo + valor; // Soma o valor ao saldo atual
            System.out.println("Depósito de R$ " + valor + " realizado!");
            System.out.println("Novo saldo: R$ " + this.saldo);
        } else {
            System.out.println("Erro: O valor do depósito deve ser maior que zero.");
        }
    }

    // Método para consultar o saldo
    public void consultarSaldo() {
        System.out.println("Saldo atual: R$ " + this.saldo);
    }

    // Método para mostrar todos os dados
    public void mostrarDadosConta() {
        System.out.println("\n--- DADOS DA CONTA ---");
        agencia.mostrarDadosAgencia(); // Chama a exibição da agência
        System.out.println("Conta: " + numeroConta);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$ " + saldo);
    }
}