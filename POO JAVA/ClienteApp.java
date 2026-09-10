import java.util.Scanner;

public class ClienteApp {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        
        do { 
            System.out.println("1- Cadastrar cliente PF");
            System.out.println("2- Cadastrar cliente PJ");
            System.out.println("3- Sair");
            

            while(!sc.hasNextInt()){
                System.out.println("Opção inválida! Digite 1, 2 ou 3:");
                sc.next(); 
            }
            
            opcao = sc.nextInt();
            sc.nextLine(); 
            
            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do cliente PF:");
                    String nomePF = sc.nextLine();
                    System.out.println("Digite o endereço do cliente PF:");
                    String enderecoPF = sc.nextLine();
                    System.out.println("Digite o CPF do cliente PF:");
                    String cpf = sc.nextLine();
                    
                    ClientePF clientePF = new ClientePF(nomePF, enderecoPF, cpf);
                    
                    clientePF.setNome(nomePF);
                    clientePF.setEndereco(enderecoPF);
                    clientePF.setcpf(cpf); 
                    System.out.println("Cliente PF cadastrado com sucesso!");
                    clientePF.exibirDados();
                    break;
                    
                case 2:
                    System.out.println("Digite o nome do cliente PJ:");
                    String nomePJ = sc.nextLine();
                    System.out.println("Digite o endereço do cliente PJ:");
                    String enderecoPJ = sc.nextLine();
                    System.out.println("Digite o CNPJ do cliente PJ:");
                    String cnpj = sc.nextLine();
                    
                    ClientePJ clientePJ = new ClientePJ(nomePJ, enderecoPJ, cnpj);
                    clientePJ.setNome(nomePJ);
                    clientePJ.setEndereco(enderecoPJ);
                    clientePJ.setCnpj(cnpj);
                    
                    System.out.println("Cliente PJ cadastrado com sucesso!");
                    clientePJ.exibirDados();
                    break;
                    
                case 3:
                    System.out.println("Saindo do programa...");
                    break;
                    
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
            
        } while (opcao != 3); 
        
        sc.close();
    }
}