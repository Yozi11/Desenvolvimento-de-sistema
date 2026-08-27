package Array;
import java.util.Scanner;

public class Array7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[3];

        // Cadastrar
        System.out.println("Cadastro de nomes");
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome: ");
            nomes[i] = sc.nextLine();
        }

        // Listar
        System.out.println("\nLista atual:");
        listar(nomes);

        // Alterar
        System.out.print("\nDigite a posicao para alterar: ");
        int posAlterar = sc.nextInt();
        sc.nextLine(); // Limpa o buffer do teclado

        if (posAlterar >= 0 && posAlterar < nomes.length) {
            System.out.print("Digite o novo nome: ");
            nomes[posAlterar] = sc.nextLine();
        } else {
            System.out.println("Posicao invalida");
        }

        System.out.println("\nLista atualizada:");
        listar(nomes);

        // Remover
        System.out.print("\nDigite a posicao para remover: ");
        int posRemover = sc.nextInt();
        sc.nextLine(); // CORRIGIDO: Limpa o buffer do teclado

        if (posRemover >= 0 && posRemover < nomes.length) {
            for (int i = posRemover; i < nomes.length - 1; i++) {
                nomes[i] = nomes[i + 1];
            }
            nomes[nomes.length - 1] = null; // Deixa a última posição vazia
        } else {
            System.out.println("Posicao invalida");
        }

        System.out.println("\nLista apos remocao:");
        listar(nomes);    

        sc.close();
    }

    // CORRIGIDO: Mudou de 'main' para 'listar' e recebeu o parâmetro 'String[] array'
    public static void listar(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " - " + array[i]);
        }
    }
}
