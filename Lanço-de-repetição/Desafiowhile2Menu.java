import java.util.Scanner;

public class Desafiowhile2Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("1-Caneta esferografica");
            System.out.println("2-Caneta gel");
            System.out.println("3-Caneta Tinteiro");
            System.out.println("0-sair");
            System.out.println("Escolha uma opção");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("caneta esferografica");
                    break;
                case 2:
                    System.out.println("caneta gel");
                    break;
                case 3:
                    System.out.println("caneta de tinteiro");
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
