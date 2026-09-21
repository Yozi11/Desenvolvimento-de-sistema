package atividade2; // Ficheiro pertencente ao pacote atividade2

import java.util.Scanner; // Importa a classe do Java para ler digitações do teclado

public class Principal {
    public static void main(String[] args) {
        // Cria a ferramenta leitora de dados do teclado
        Scanner scanner = new Scanner(System.in);
        
        // Variável do tipo da classe pai criada como 'null' para poder guardar tanto um Carro como uma Moto
        Veiculo veiculoAtual = null;
        
        // Variável para guardar a quantidade de dias informada no menu
        int quantidadeDias = 0;

        // Loop 'while(true)' para manter o menu a funcionar até ser digitada a opção de fechar
        while (true) {
            // Desenho do menu na consola
            System.out.println("\n=== LOCADORA DE VEÍCULOS ===");
            System.out.println("1. Cadastrar Veículo (Carro ou Moto)");
            System.out.println("2. Mostrar dados do veículo");
            System.out.println("3. Informar quantidade de dias de locação");
            System.out.println("4. Calcular o valor do aluguel");
            System.out.println("5. Calcular o aluguel com desconto");
            System.out.println("6. Encerrar programa");
            System.out.print("Escolha uma opção: ");

            // Lê o número da opção digitado pelo utilizador
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa a quebra de linha ('Enter') que fica pendente na leitura de números

            // Estrutura de decisão para selecionar a atividade
            switch (opcao) {
                case 1:
                    // --- REQUISITO 1: CADASTRO DO VEÍCULO ---
                    System.out.print("Digite o modelo: ");
                    String modelo = scanner.nextLine(); // Lê o texto do modelo
                    
                    System.out.print("Digite a placa: ");
                    String placa = scanner.nextLine(); // Lê o texto da placa
                    
                    System.out.print("Digite o ano: ");
                    int ano = scanner.nextInt(); // Lê o valor numérico do ano
                    
                    System.out.print("Digite o valor da diária: R$ ");
                    double diaria = scanner.nextDouble(); // Lê o valor numérico com casas decimais

                    // Sub-menu para escolher o tipo de objeto
                    System.out.println("Qual o tipo? (1 - Carro | 2 - Moto)");
                    int tipo = scanner.nextInt();

                    if (tipo == 1) {
                        // Instancia a classe Carro e guarda o objeto dentro da variável genérica veiculoAtual
                        veiculoAtual = new Carro(placa, modelo, ano, diaria);
                        System.out.println("Carro cadastrado com sucesso!");
                    } else if (tipo == 2) {
                        // Instancia a classe Moto e guarda o objeto dentro da variável genérica veiculoAtual
                        veiculoAtual = new Moto(placa, modelo, ano, diaria);
                        System.out.println("Moto cadastrada com sucesso!");
                    } else {
                        System.out.println("Tipo inválido!");
                    }
                    break; // Interrompe este case e regressa ao início do while(true)

                case 2:
                    // --- REQUISITO 2: MOSTRAR DADOS ---
                    // Validação: Só executa se um veículo tiver sido cadastrado antes na opção 1
                    if (veiculoAtual != null) {
                        veiculoAtual.mostrarDados(); // Executa o método de exibição da classe correspondente
                    } else {
                        System.out.println("Nenhum veículo cadastrado ainda.");
                    }
                    break;

                case 3:
                    // --- REQUISITO 3: INFORMAR DIAS ---
                    System.out.print("Digite a quantidade de dias: ");
                    quantidadeDias = scanner.nextInt(); // Guarda o valor na variável global do menu
                    System.out.println("Dias de locação atualizados para: " + quantidadeDias);
                    break;

                case 4:
                    // --- REQUISITO 4: CALCULAR ALUGUEL SIMPLES ---
                    // Validação dupla: Requer veículo cadastrado E dias superiores a zero
                    if (veiculoAtual != null && quantidadeDias > 0) {
                        // CASTING: Converte o Veiculo para o tipo da Interface Aluguel para poder chamar o cálculo
                        Aluguel aluguel = (Aluguel) veiculoAtual;
                        // Chama a primeira versão do método (recebe apenas os dias)
                        System.out.println("Valor total do aluguel: R$ " + aluguel.calcularAluguel(quantidadeDias));
                    } else {
                        System.out.println("Cadastre o veículo e informe os dias primeiro (Opções 1 e 3).");
                    }
                    break;

                case 5:
                    // --- REQUISITO 5: CALCULAR ALUGUEL COM DESCONTO (SOBRECARGA) ---
                    if (veiculoAtual != null && quantidadeDias > 0) {
                        System.out.print("Digite o valor do desconto: R$ ");
                        double desconto = scanner.nextDouble(); // Lê o valor do desconto

                        // CASTING para a interface
                        Aluguel aluguel = (Aluguel) veiculoAtual;
                        // Chama a versão SOBRECARREGADA do método (recebe dias E desconto)
                        System.out.println("Valor total com desconto: R$ " + aluguel.calcularAluguel(quantidadeDias, desconto));
                    } else {
                        System.out.println("Cadastre o veículo e informe os dias primeiro.");
                    }
                    break;

                case 6:
                    // --- REQUISITO 6: ENCERRAR ---
                    System.out.println("Encerrando o programa...");
                    scanner.close(); // Liberar os recursos do leitor de teclado
                    return; // Interrompe o método main e desliga completamente a aplicação

                default:
                    // Resposta para caso o utilizador digite um número fora de 1..6
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}