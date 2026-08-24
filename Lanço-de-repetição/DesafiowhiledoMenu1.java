import java.util.Scanner;

public class DesafiowhiledoMenu1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("1-Caixa de papelao");
            System.out.println("2-Sacola Plastica");
            System.out.println("3-sacola de vidro");
            System.out.println("0-sair");
            System.out.println("Escolha uma opçao");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("caixa de papelao");
                    
                    break;
                case 2:
                    System.out.println("sacola de plastico");
                    
                    break;
                case 3:
                    System.out.println("sacola de vidro");
                    
                    break;
                case 4:
                    System.out.println("sair");
                    
                    break;
            
                default:
                    break;
            }
        }while (opcao!=0);
        sc.close();

      
                

        
    }
    
}
