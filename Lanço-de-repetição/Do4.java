import java.util.Scanner;

public class Do4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String senha = "";

        do{
            System.out.println("informe a senha");
            senha = sc.nextLine();
        }while(!senha.equals("1234"));

        System.out.println("acesso permitido");

        sc.close();
    }
    
}
