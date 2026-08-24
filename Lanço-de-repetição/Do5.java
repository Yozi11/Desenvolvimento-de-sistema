import java.util.Scanner;

public class Do5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;

        do{
            System.out.println("1-Iniciar jogo");
            System.out.println("2-carregar jogo");
            System.out.println("3-configuraçoes");
            System.out.println("0-sair");
            System.out.println("Escolha uma opçao: ");

            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("iniciar jogo");
                    break;
                    
                case 2:
                    System.out.println("Carregar jogo");
                    break;
                    
                case 3:
                    System.out.println("configuraçoes");
                    break;
                case 4:
                    System.out.println("sair ");

                    
                    break;

            
                default:
                    break;
            }


        }while (op!=0);
        sc.close();
    }
    
}
