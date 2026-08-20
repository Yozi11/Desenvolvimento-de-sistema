import java.util.Scanner;

public class While5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int op=0;

        while (op!=5){
            System.out.println("\n======Menu====");
            System.out.println("\n-1-Cadastro");
            System.out.println("\n2-Listar");
            System.out.println("\n3-Alterar");
            System.out.println("\n4-Remover");
            System.out.println("\n5-sair");
            System.out.println("\nEscolha a opção");
            op=sc.nextInt();


            switch (op) {
                case 1:
                    System.out.println("Cadastrar");
                    
                case 2:
                    System.out.println("Listar");
                    
                case 3:
                    System.out.println("Alterar");
                    
                case 4:
                    System.out.println("Remover");
                    
                case 5:
                    System.out.println("sair");
                    
                    
                    break;
            
                default:
                    break;
            }
            
        }
        sc.close();
    }

    
}
