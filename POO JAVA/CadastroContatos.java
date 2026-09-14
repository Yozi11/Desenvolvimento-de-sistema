import java.util.ArrayList;
import java.util.Scanner;

public class CadastroContatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Contato> contatos = new ArrayList<>();

        while (true) {
            System.out.println("\n<<<<<<< SDCC >>>>>>>");
            System.out.println("1 - Cadastrar contato");
            System.out.println("2 - Listar contatos");
            System.out.println("3 - Excluir contato");
            System.out.println("4 - Alterar contato");
            System.out.println("5 - Pesquisar contato");
            System.out.println("6 - Sair");
            System.out.print("Opção: ");
            
            int op = sc.nextInt();
            sc.nextLine(); 

            switch (op) {
                case 1:
                    System.out.print("Informe o nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Informe o telefone: ");
                    String numero = sc.nextLine();

                    contatos.add(new Contato(nome, numero));
                    System.out.println("Cadastro realizado com sucesso!");
                    break;

                case 2:
                    System.out.println("\nNomes cadastrados:");
                    if (contatos.isEmpty()) {
                        System.out.println("Nenhum contato cadastrado.");
                    } else {
                        for (int i = 0; i < contatos.size(); i++) {
                            System.out.println((i + 1) + " - " + contatos.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Informe o índice para remover: ");
                    int index = sc.nextInt();
                    sc.nextLine();

                    if (index > 0 && index <= contatos.size()) {
                        contatos.remove(index - 1);
                        System.out.println("Contato removido com sucesso!");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;

                case 4:
                    System.out.print("Informe o número da posição para alterar: ");
                    int pos = sc.nextInt();
                    sc.nextLine();

                    if (pos > 0 && pos <= contatos.size()) {
                        System.out.print("Digite o novo nome do contato: ");
                        String novoNome = sc.nextLine();

                        System.out.print("Novo número: ");
                        String novoNumero = sc.nextLine();

                        contatos.get(pos - 1).setNome(novoNome);
                        contatos.get(pos - 1).setNumero(novoNumero);
                        System.out.println("Contato alterado com sucesso!");
                    } else {
                        System.out.println("Posição inválida.");
                    }
                    break;

                case 5:
                    System.out.print("Informe o nome para pesquisar: ");
                    String busca = sc.nextLine();
                    boolean encontrado = false;

                    for (int i = 0; i < contatos.size(); i++) {
                        if (contatos.get(i).getNome().equalsIgnoreCase(busca)) {
                            System.out.println("Encontrado: " + contatos.get(i));
                            encontrado = true;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 6:
                    System.out.println("Fui......");
                    sc.close();
                    return; 

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}