package atividadepoo3;

import java.util.Scanner; // Importa a leitura de teclado

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variáveis de controle do estado da aplicação
        Produto produtoAtual = null; // Guarda o objeto cadastrado (Físico ou Digital)
        int quantidade = 0;          // Guarda a quantidade desejada
        double valorFinal = 0.0;     // Guarda o resultado do cálculo da venda

        // Menu contínuo
        while (true) {
            System.out.println("\n=== SISTEMA DE GESTÃO DE PRODUTOS ===");
            System.out.println("1. Cadastrar produto (Escolher Físico ou Digital)");
            System.out.println("2. Escolher tipo do produto"); // Integrado na opção 1
            System.out.println("3. Mostrar dados do produto");
            System.out.println("4. Informar quantidade");
            System.out.println("5. Realizar venda");
            System.out.println("6. Realizar venda com desconto");
            System.out.println("7. Mostrar valor final");
            System.out.println("8. Encerrar o programa");
            System.out.print("Digite a opção desejada: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer de memória do teclado

            switch (opcao) {
                case 1:
                case 2:
                    // --- REQUISITOS 1 e 2: CADASTRO E TIPO DE PRODUTO ---
                    System.out.print("Digite o código do produto: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine(); // Limpa buffer
                    
                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();
                    
                    System.out.print("Digite o preço unitário: R$ ");
                    double preco = scanner.nextDouble();

                    System.out.println("Escolha o tipo do produto:");
                    System.out.println("1 - Produto Físico (com frete)");
                    System.out.println("2 - Produto Digital (sem frete)");
                    int tipo = scanner.nextInt();

                    if (tipo == 1) {
                        System.out.print("Digite o valor do frete: R$ ");
                        double frete = scanner.nextDouble();
                        // Instancia ProdutoFisico e armazena na variável genérica Produto
                        produtoAtual = new ProdutoFisico(codigo, nome, preco, frete);
                        System.out.println("Produto Físico cadastrado com sucesso!");
                    } else if (tipo == 2) {
                        // Instancia ProdutoDigital e armazena na variável genérica Produto
                        produtoAtual = new ProdutoDigital(codigo, nome, preco);
                        System.out.println("Produto Digital cadastrado com sucesso!");
                    } else {
                        System.out.println("Tipo inválido! Cadastro cancelado.");
                    }
                    break;

                case 3:
                    // --- REQUISITO 3: MOSTRAR DADOS ---
                    if (produtoAtual != null) {
                        produtoAtual.mostrarDados();
                    } else {
                        System.out.println("Nenhum produto cadastrado até o momento.");
                    }
                    break;

                case 4:
                    // --- REQUISITO 4: INFORMAR QUANTIDADE ---
                    System.out.print("Digite a quantidade de unidades para a venda: ");
                    quantidade = scanner.nextInt();
                    System.out.println("Quantidade registrada: " + quantidade + " unidade(s).");
                    break;

                case 5:
                    // --- REQUISITO 5: REALIZAR VENDA SIMPLES ---
                    if (produtoAtual != null && quantidade > 0) {
                        // Casting para a Interface Venda para executar a operação
                        Venda venda = (Venda) produtoAtual;
                        valorFinal = venda.calcularVenda(quantidade);
                        System.out.println("Venda realizada com sucesso!");
                        System.out.println("Valor calculado: R$ " + valorFinal);
                    } else {
                        System.out.println("Cadastre um produto e informe a quantidade (Opções 1 e 4).");
                    }
                    break;

                case 6:
                    // --- REQUISITO 6: REALIZAR VENDA COM DESCONTO (SOBRECARGA) ---
                    if (produtoAtual != null && quantidade > 0) {
                        System.out.print("Digite a porcentagem de desconto (ex: 10 para 10%): ");
                        double percentual = scanner.nextDouble();

                        // Casting para a Interface Venda
                        Venda venda = (Venda) produtoAtual;
                        // Chama o método sobrecarregado enviando a quantidade e a porcentagem
                        valorFinal = venda.calcularVenda(quantidade, percentual);
                        System.out.println("Venda com desconto realizada!");
                        System.out.println("Valor calculado: R$ " + valorFinal);
                    } else {
                        System.out.println("Cadastre um produto e informe a quantidade primeiro.");
                    }
                    break;

                case 7:
                    // --- REQUISITO 7: MOSTRAR VALOR FINAL ---
                    if (valorFinal > 0) {
                        System.out.println("\n----------------------------------");
                        System.out.println("VALOR FINAL DA COMPRA: R$ " + valorFinal);
                        System.out.println("----------------------------------");
                    } else {
                        System.out.println("Nenhuma venda foi processada ainda (Execute as opções 5 ou 6).");
                    }
                    break;

                case 8:
                    // --- REQUISITO 8: ENCERRAR O PROGRAMA ---
                    System.out.println("Encerrando o sistema de produtos. Até logo!");
                    scanner.close(); // Fecha o leitor de teclado
                    return; // Interrompe o loop infinitamente e encerra o método main

                default:
                    System.out.println("Opção inválida! Escolha um número de 1 a 8.");
            }
        }
    }
}