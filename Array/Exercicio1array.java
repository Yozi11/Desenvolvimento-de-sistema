package Array;
import java.util.Scanner;

public class Exercicio1array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[5];
        int[] quantidades = new int[5];
        int qtd = 0; 
        int opcao = 0;

        while (opcao != 6) {
            System.out.println("\n======= MENU DA LOJA =======");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Pesquisar produto");
            System.out.println("4 - Alterar produto");
            System.out.println("5 - Remover produto");
            System.out.println("6 - Sair do sistema");
            System.out.print("Escolha uma opcao: ");
            opcao = sc.nextInt();
            sc.nextLine(); 

            switch (opcao) {

                case 1: 
                    System.out.println("\n--- Cadastrar Produto ---");
                    if (qtd < 5) {
                        System.out.print("Digite o nome do produto: ");
                        nomes[qtd] = sc.nextLine();
                        
                        System.out.print("Digite a quantidade em estoque: ");
                        quantidades[qtd] = sc.nextInt();
                        sc.nextLine(); 
                        
                        qtd++; 
                        System.out.println("Produto cadastrado com sucesso!");
                    } else {
                        System.out.println("Erro: Limite maximo de 5 produtos atingido.");
                    }
                    break;

                case 2: 
                    System.out.println("\n--- Lista Atual ---");
                    listar(nomes, quantidades, qtd);
                    break;

                case 3: 
                    System.out.println("\n--- Pesquisar Produto ---");
                    System.out.print("Digite o nome do produto para buscar: ");
                    String nomeBusca = sc.nextLine();
                    
                    int posEncontrada = -1;
                    for (int i = 0; i < qtd; i++) {
                        if (nomes[i].equalsIgnoreCase(nomeBusca)) {
                            posEncontrada = i;
                            break;
                        }
                    }

                    if (posEncontrada != -1) {
                        System.out.println("Produto encontrado -> Indice: " + posEncontrada + " - Nome: " + nomes[posEncontrada] + " - Qtd: " + quantidades[posEncontrada]);
                    } else {
                        System.out.println("Produto nao encontrado.");
                    }
                    break;

                case 4: 
                    System.out.println("\n--- Alterar Produto ---");
                    System.out.print("Digite o nome do produto que deseja alterar: ");
                    String nomeAlterar = sc.nextLine();
                    
                    int posAlterar = -1;
                    for (int i = 0; i < qtd; i++) {
                        if (nomes[i].equalsIgnoreCase(nomeAlterar)) {
                            posAlterar = i;
                            break;
                        }
                    }

                    if (posAlterar != -1) {
                        System.out.print("Digite o novo nome: ");
                        nomes[posAlterar] = sc.nextLine();
                        System.out.print("Digite a nova quantidade: ");
                        quantidades[posAlterar] = sc.nextInt();
                        sc.nextLine(); 
                        System.out.println("Produto alterado com sucesso!");
                    } else {
                        System.out.println("Produto nao encontrado para alteracao.");
                    }
                    break;

                case 5: 
                    System.out.println("\n--- Remover Produto ---");
                    System.out.print("Digite o nome do produto para remover: ");
                    String nomeRemover = sc.nextLine();
                    
                    int posRemover = -1;
                    for (int i = 0; i < qtd; i++) {
                        if (nomes[i].equalsIgnoreCase(nomeRemover)) {
                            posRemover = i;
                            break;
                        }
                    }

                    if (posRemover != -1) {
                        for (int i = posRemover; i < qtd - 1; i++) {
                            nomes[i] = nomes[i + 1];
                            quantidades[i] = quantidades[i + 1];
                        }
                        nomes[qtd - 1] = null;
                        quantidades[qtd - 1] = 0;
                        
                        qtd--; 
                        System.out.println("Produto removido com sucesso!");
                    } else {
                        System.out.println("Produto nao encontrado para remocao.");
                    }
                    break;

                case 6: 
                    System.out.println("\nSaindo do sistema... Ate logo!");
                    break;

                default:
                    System.out.println("Opcao invalida! Digite um numero de 1 a 6.");
                    break;
            }
        }

        sc.close();
    }

    public static void listar(String[] arrayNomes, int[] arrayQuantidades, int totalCadastrados) {
        if (totalCadastrados == 0) {
            System.out.println("Nenhum produto cadastrado no momento.");
            return;
        }
        for (int i = 0; i < totalCadastrados; i++) {
            System.out.println(i + " - Nome: " + arrayNomes[i] + " | Qtd: " + arrayQuantidades[i]);
        }
    }
}
