import java.util.Scanner;

public class Desafiowhile3Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("1-Mochila Escolar");
            System.out.println("2- Mochila de Viagem");
            System.out.println("3-Mochila esportiva");
            System.out.println("0-sair");
            System.out.println("Escolha uma opção");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Mochila Escolar");
                    break;
                case 2:
                    System.out.println("Mochila De Viagem");
                    break;
                case 3:
                    System.out.println("Mochila Esportiva");
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        }
        sc.close();
    }
}