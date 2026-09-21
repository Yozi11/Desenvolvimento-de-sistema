package Array;
import java.util.Scanner;

import atividade1.Pagamento;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Funcionario funcionarioAtual = null; 

        while (true) {
            System.out.println("\n=== SISTEMA DE FUNCIONÁRIOS ===");
            System.out.println("1. Cadastrar Funcionário (CLT ou Freelancer)");
            System.out.println("2. Consultar/Mostrar os dados cadastrados");
            System.out.println("3. Calcular o pagamento normal");
            System.out.println("4. Calcular o pagamento com bônus");
            System.out.println("5. Encerrar o programa");
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do teclado

            switch (opcao) {
                case 1: 
                    System.out.print("Digite o nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o CPF: ");
                    String cpf = scanner.nextLine();
                    
                    System.out.println("Qual o tipo de funcionário?");
                    System.out.println("1 - CLT");
                    System.out.println("2 - Freelancer");
                    int tipo = scanner.nextInt();
                    
                    if (tipo == 1) {
                        System.out.print("Digite o salário mensal: ");
                        double salario = scanner.nextDouble();
                        funcionarioAtual = new FuncionarioCLT(nome, cpf, salario);
                        System.out.println("Funcionário CLT cadastrado com sucesso!");
                    } else if (tipo == 2) {
                        System.out.print("Digite a quantidade de horas trabalhadas: ");
                        int horas = scanner.nextInt();
                        System.out.print("Digite o valor da hora: ");
                        double valorHora = scanner.nextDouble();
                        funcionarioAtual = new FuncionarioFreelancer(nome, cpf, horas, valorHora);
                        System.out.println("Funcionário Freelancer cadastrado com sucesso!");
                    } else {
                        System.out.println("Tipo inválido!");
                    }
                    break;

                case 2: 
                    if (funcionarioAtual != null) {
                        System.out.println("\n--- DADOS DO FUNCIONÁRIO ---");
                        funcionarioAtual.mostrarDados();
                    } else {
                        System.out.println("Nenhum funcionário cadastrado ainda.");
                    }
                    break;

                case 3: 
                    if (funcionarioAtual != null) {
                        Pagamento pag = (Pagamento) funcionarioAtual;
                        System.out.println("Pagamento normal calculado: R$ " + pag.calcularPagamento());
                    } else {
                        System.out.println("Cadastre um funcionário primeiro.");
                    }
                    break;

                case 4: 
                    if (funcionarioAtual != null) {
                        System.out.print("Digite o valor do bônus: R$ ");
                        double bonus = scanner.nextDouble();
                        
                        Pagamento pag = (Pagamento) funcionarioAtual;
                        System.out.println("Pagamento com bônus calculado: R$ " + pag.calcularPagamento(bonus));
                    } else {
                        System.out.println("Cadastre um funcionário primeiro.");
                    }
                    break;

                case 5: 
                    System.out.println("Encerrando o sistema...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}