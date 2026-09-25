package atividadepoo6;


import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ==========================================
        // PASSO 1: CADASTRO INICIAL (Fora do Menu)
        // ==========================================
        System.out.println("=== CADASTRO INICIAL ===");
        
        System.out.print("Número da agência: ");
        int numAgencia = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer
        System.out.print("Nome da agência: ");
        String nomeAgencia = scanner.nextLine();

        // Instancia a Agência com os dados digitados
        Agencia agencia = new Agencia(numAgencia, nomeAgencia);

        System.out.print("Número da conta: ");
        int numConta = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer
        System.out.print("Titular: ");
        String titular = scanner.nextLine();
        System.out.print("Saldo inicial: R$ ");
        double saldoInicial = scanner.nextDouble();

        // Instancia a Conta Corrente já com a agência acoplada nela
        ContaCorrente conta = new ContaCorrente(numConta, titular, saldoInicial, agencia);

        // ==========================================
        // PASSO 2: MENU DE OPERAÇÕES (Loop)
        // ==========================================
        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Mostrar dados da conta");
            System.out.println("2 - Consultar saldo");
            System.out.println("3 - Depositar");
            System.out.println("4 - Pagar com PIX");
            System.out.println("5 - Pagar com cartão");
            System.out.println("6 - Pagar em dinheiro");
            System.out.println("7 - Transferir (Desafio)");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    conta.mostrarDadosConta();
                    break;

                case 2:
                    conta.consultarSaldo();
                    break;

                case 3:
                    System.out.print("Digite o valor do depósito: R$ ");
                    double valorDep = scanner.nextDouble();
                    conta.depositar(valorDep);
                    break;

                case 4:
                    System.out.print("Valor do pagamento PIX: R$ ");
                    double valorPix = scanner.nextDouble();
                    scanner.nextLine(); // Limpa o buffer
                    System.out.print("Chave PIX: ");
                    String chave = scanner.nextLine();
                    
                    // Chama a sobrecarga 2
                    conta.pagar(valorPix, chave); 
                    break;

                case 5:
                    System.out.print("Valor da compra no Cartão: R$ ");
                    double valorCartao = scanner.nextDouble();
                    System.out.print("Quantidade de parcelas: ");
                    int parcelas = scanner.nextInt();
                    
                    // Chama a sobrecarga 3
                    conta.pagar(valorCartao, parcelas);
                    break;

                case 6:
                    System.out.print("Valor do pagamento em Dinheiro: R$ ");
                    double valorDinheiro = scanner.nextDouble();
                    
                    // Chama a sobrecarga 1
                    conta.pagar(valorDinheiro);
                    break;

                case 7:
                    System.out.print("Número da conta de destino: ");
                    int contaDestino = scanner.nextInt();
                    System.out.print("Valor da transferência: R$ ");
                    double valorTransf = scanner.nextDouble();
                    
                    conta.transferir(contaDestino, valorTransf);
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    scanner.close();
                    return; // Sai do programa

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}