package atividade5;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variável genérica para guardar o pedido (Polimorfismo)
        Pedido pedidoAtual = null;

        while (true) {
            System.out.println("\n=== RESTAURANTE: SISTEMA DE PEDIDOS ===");
            System.out.println("1. Cadastrar pedido e Escolher tipo (Opções 1 e 2 juntas)");
            System.out.println("3. Mostrar dados do pedido");
            System.out.println("4. Escolher forma de pagamento (Instrução)");
            System.out.println("5. Pagar em dinheiro");
            System.out.println("6. Pagar via PIX");
            System.out.println("7. Pagar com cartão");
            System.out.println("8. Encerrar o programa");
            System.out.print("Digite a opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                case 2:
                    // REQUISITO 1 e 2: Cadastro
                    System.out.print("Número do Pedido: ");
                    int numero = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.print("Nome do Cliente: ");
                    String nome = scanner.nextLine();
                    
                    System.out.print("Valor do Pedido: R$ ");
                    double valor = scanner.nextDouble();
                    
                    System.out.println("Tipo do Pedido? (1 - Local | 2 - Delivery)");
                    int tipo = scanner.nextInt();
                    scanner.nextLine(); // Limpar buffer

                    if (tipo == 1) {
                        pedidoAtual = new PedidoLocal(numero, nome, valor);
                        System.out.println("Pedido Local cadastrado com sucesso!");
                    } else if (tipo == 2) {
                        System.out.print("Endereço de Entrega: ");
                        String endereco = scanner.nextLine();
                        System.out.print("Taxa de Entrega: R$ ");
                        double taxa = scanner.nextDouble();
                        
                        pedidoAtual = new PedidoDelivery(numero, nome, valor, endereco, taxa);
                        System.out.println("Pedido Delivery cadastrado com sucesso!");
                    } else {
                        System.out.println("Tipo inválido.");
                    }
                    break;

                case 3:
                    // REQUISITO 3: Mostrar dados
                    if (pedidoAtual != null) {
                        pedidoAtual.mostrarDados();
                    } else {
                        System.out.println("Cadastre um pedido primeiro.");
                    }
                    break;

                case 4:
                    // REQUISITO 4: Escolher forma (Aviso visual)
                    System.out.println(">>> Para pagar, escolha a opção 5 (Dinheiro), 6 (PIX) ou 7 (Cartão) no menu.");
                    break;

                case 5:
                    // REQUISITO 5: Dinheiro (Usa a Sobrecarga 1)
                    if (pedidoAtual != null) {
                        Pagamento pag = (Pagamento) pedidoAtual;
                        System.out.print("Digite o valor a ser pago em dinheiro: R$ ");
                        double valorPago = scanner.nextDouble();
                        pag.realizarPagamento(valorPago); // Chama o método com 1 parâmetro
                    } else {
                        System.out.println("Cadastre um pedido primeiro.");
                    }
                    break;

                case 6:
                    // REQUISITO 6: PIX (Usa a Sobrecarga 2)
                    if (pedidoAtual != null) {
                        Pagamento pag = (Pagamento) pedidoAtual;
                        System.out.print("Digite o valor a ser pago: R$ ");
                        double valorPix = scanner.nextDouble();
                        scanner.nextLine();
                        System.out.print("Digite a chave PIX: ");
                        String chave = scanner.nextLine();
                        
                        pag.realizarPagamento(valorPix, chave); // Chama o método com 2 parâmetros (String)
                    } else {
                        System.out.println("Cadastre um pedido primeiro.");
                    }
                    break;

                case 7:
                    // REQUISITO 7: Cartão (Usa a Sobrecarga 3)
                    if (pedidoAtual != null) {
                        Pagamento pag = (Pagamento) pedidoAtual;
                        System.out.print("Digite o valor a ser pago: R$ ");
                        double valorCartao = scanner.nextDouble();
                        System.out.print("Quantidade de parcelas: ");
                        int parcelas = scanner.nextInt();
                        
                        pag.realizarPagamento(valorCartao, parcelas); // Chama o método com 2 parâmetros (int)
                    } else {
                        System.out.println("Cadastre um pedido primeiro.");
                    }
                    break;

                case 8:
                    // REQUISITO 8: Encerrar
                    System.out.println("Encerrando o sistema do restaurante...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}