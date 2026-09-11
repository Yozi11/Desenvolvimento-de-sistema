package ExerciciosPoojava;
import java.util.Scanner;

public class VeiculoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro carro = null;
        Moto moto = null;

        int opcao;
        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Cadastrar Carro");
            System.out.println("2. Cadastrar Moto");
            System.out.println("3. Exibir dados do Carro");
            System.out.println("4. Exibir dados da Moto");
            System.out.println("5. Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nCadastrando Carro...");
                    scanner.nextLine(); 
                    System.out.print("Digite a marca do carro: ");
                    String marcaCarro = scanner.nextLine();
                    
                    System.out.print("Digite o ano do carro: ");
                    int anoCarro = scanner.nextInt();
                    
                    
                    System.out.print("Digite a quantidade de portas: ");
                    int portasCarro = scanner.nextInt();
                    
              
                    carro = new Carro(marcaCarro, anoCarro, portasCarro);
                    System.out.println("Carro cadastrado com sucesso!");
                    break;
                    
                case 2:
                    System.out.println("\nCadastrando Moto...");
                    scanner.nextLine();
                    System.out.print("Digite a marca da moto: ");
                    String marcaMoto = scanner.nextLine();
                    
                    System.out.print("Digite o ano da moto: ");
                    int anoMoto = scanner.nextInt();
                    
                   
                    System.out.print("Digite as cilindradas da moto: ");
                    int cilindradaMoto = scanner.nextInt();
                    
                    
                    moto = new Moto(marcaMoto, anoMoto, cilindradaMoto);
                    System.out.println("Moto cadastrada com sucesso!");
                    break;
                    
                case 3:
                    System.out.println("\n--- DADOS DO CARRO ---");
                    if (carro != null) {
                        carro.exibirInfo();
                    } else {
                        System.out.println("Nenhum carro cadastrado.");
                    }
                    break;
                    
                case 4:
                    System.out.println("\n--- DADOS DA MOTO ---");
                    if (moto != null) {
                        moto.exibirInfo();
                    } else {
                        System.out.println("Nenhuma moto cadastrada.");
                    }
                    break;
                    
                case 5:
                    System.out.println("Saindo...");
                    break;
            
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while(opcao != 5);
        
        scanner.close(); 
    }
} 