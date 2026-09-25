package atividadepoo4;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variáveis de estado para guardar informações entre as opções do menu
        Curso cursoAtual = null;
        String nomeAluno = "";
        double valorPago = 0.0;
        boolean alunoMatriculado = false; // Flag para saber se a matrícula já foi feita

        while (true) {
            System.out.println("\n=== SISTEMA DE CURSOS ===");
            System.out.println("1. Cadastrar curso (Presencial ou Online)");
            System.out.println("2. Escolher tipo de curso"); // Unificado na opção 1
            System.out.println("3. Cadastrar nome do aluno");
            System.out.println("4. Realizar matrícula");
            System.out.println("5. Realizar matrícula com desconto");
            System.out.println("6. Mostrar dados do curso");
            System.out.println("7. Mostrar dados da matrícula");
            System.out.println("8. Encerrar o programa");
            System.out.print("Sua opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do teclado

            switch (opcao) {
                case 1:
                case 2: // Resolvi as opções 1 e 2 no mesmo bloco para fazer mais sentido na navegação
                    System.out.print("Digite o código do curso: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.print("Digite o nome do curso: ");
                    String nome = scanner.nextLine();
                    
                    System.out.print("Carga horária (em horas): ");
                    int carga = scanner.nextInt();
                    
                    System.out.print("Valor do curso: R$ ");
                    double valor = scanner.nextDouble();
                    
                    System.out.println("Qual a modalidade? (1 - Presencial | 2 - Online)");
                    int tipo = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer antes de ler os próximos textos

                    if (tipo == 1) {
                        System.out.print("Nome da Sala: ");
                        String sala = scanner.nextLine();
                        System.out.print("Turno (Ex: Matutino, Noturno): ");
                        String turno = scanner.nextLine();
                        
                        // Cria o objeto Presencial e guarda na variável polimórfica 'cursoAtual'
                        cursoAtual = new CursoPresencial(codigo, nome, carga, valor, sala, turno);
                        System.out.println("Curso Presencial cadastrado!");
                        
                    } else if (tipo == 2) {
                        System.out.print("Endereço da Plataforma (Ex: Zoom, Teams): ");
                        String plataforma = scanner.nextLine();
                        System.out.print("Código de Acesso (Link/Senha): ");
                        String codigoAcesso = scanner.nextLine();
                        
                        // Cria o objeto Online e guarda na variável
                        cursoAtual = new CursoOnline(codigo, nome, carga, valor, plataforma, codigoAcesso);
                        System.out.println("Curso Online cadastrado!");
                    } else {
                        System.out.println("Tipo inválido.");
                    }
                    // Sempre que cadastramos um curso novo, resetamos o estado da matrícula
                    alunoMatriculado = false; 
                    break;

                case 3:
                    System.out.print("Digite o nome do aluno: ");
                    nomeAluno = scanner.nextLine();
                    System.out.println("Aluno " + nomeAluno + " registrado no sistema.");
                    break;

                case 4:
                    // Só permite matricular se tiver curso e aluno cadastrados
                    if (cursoAtual != null && !nomeAluno.isEmpty()) {
                        Matricula mat = (Matricula) cursoAtual; // Faz o casting para a interface
                        valorPago = mat.calcularMatricula();    // Chama o método sem desconto
                        alunoMatriculado = true;
                        System.out.println("Matrícula realizada com sucesso para " + nomeAluno + "!");
                    } else {
                        System.out.println("Erro: Cadastre o curso e o nome do aluno primeiro.");
                    }
                    break;

                case 5:
                    if (cursoAtual != null && !nomeAluno.isEmpty()) {
                        System.out.print("Digite o valor do desconto (em R$): ");
                        double desconto = scanner.nextDouble();
                        
                        Matricula mat = (Matricula) cursoAtual; // Casting para a interface
                        valorPago = mat.calcularMatricula(desconto); // Chama o método COM desconto
                        alunoMatriculado = true;
                        System.out.println("Matrícula com desconto realizada com sucesso!");
                    } else {
                        System.out.println("Erro: Cadastre o curso e o nome do aluno primeiro.");
                    }
                    break;

                case 6:
                    if (cursoAtual != null) {
                        cursoAtual.mostrarDados(); // Executa o método da classe específica instanciada
                    } else {
                        System.out.println("Nenhum curso foi cadastrado ainda.");
                    }
                    break;

                case 7:
                    if (alunoMatriculado) {
                        System.out.println("\n--- COMPROVANTE DE MATRÍCULA ---");
                        System.out.println("Aluno: " + nomeAluno);
                        System.out.println("Curso: " + cursoAtual.getNome());
                        System.out.println("Valor Final da Matrícula: R$ " + valorPago);
                        System.out.println("--------------------------------");
                    } else {
                        System.out.println("Nenhuma matrícula foi finalizada ainda.");
                    }
                    break;

                case 8:
                    System.out.println("Encerrando o sistema de matrículas...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida! Escolha um número de 1 a 8.");
            }
        }
    }
}