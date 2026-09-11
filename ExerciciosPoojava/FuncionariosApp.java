package ExerciciosPoojava;
import java.util.Scanner;

public class FuncionariosApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        Funcionarios funcionarios = null; 
        Professor professor = null;

        int opcao;
        do { 
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Cadastrar Funcionário");
            System.out.println("2. Cadastrar Professor");
            System.out.println("3. Exibir dados do Funcionário");
            System.out.println("4. Exibir dados do Professor");
            System.out.println("5. Sair");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.println("\nCadastrando Funcionário...");
                    System.out.print("Digite o nome do funcionário: ");
                    String nomeFuncionario = scanner.nextLine();
                    System.out.print("Digite o salário do funcionário: ");
                    double salarioFuncionario = scanner.nextDouble();
                    funcionarios = new Funcionarios(nomeFuncionario, salarioFuncionario);
                    System.out.println("Funcionário cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("\nCadastrando Professor...");
                    System.out.print("Digite o nome do professor: ");
                    String nomeProfessor = scanner.nextLine();
                    System.out.print("Digite o salário do professor: ");
                    double salarioProfessor = scanner.nextDouble();
                    scanner.nextLine(); 
                    System.out.print("Digite a disciplina do professor: ");
                    String disciplinaProfessor = scanner.nextLine();
                    professor = new Professor(nomeProfessor, salarioProfessor, disciplinaProfessor);
                    System.out.println("Professor cadastrado com sucesso!");
                    break;

                case 3:
                    System.out.println("\n--- DADOS DO FUNCIONÁRIO ---");
                    if (funcionarios != null) {
                        funcionarios.exibirDados(); 
                    } else {
                        System.out.println("Nenhum funcionário cadastrado.");
                    }
                    break;

                case 4:
                    System.out.println("\n--- DADOS DO PROFESSOR ---");
                    if (professor != null) {
                        professor.exibirDados(); 
                    } else {
                        System.out.println("Nenhum professor cadastrado.");
                    }
                    break;

                case 5:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        
        
        } while (opcao != 5); 
        
        scanner.close(); 
    }
}