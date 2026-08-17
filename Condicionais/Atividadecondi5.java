package Condicionais;
import java.util.Scanner;

public class Atividadecondi5 {

    public static void main(String[] args) {
        String senhaCorreta = "Adimin1234";

        Scanner sc = new Scanner(System.in);

        System.out.println("digite a senha");
        String senha = sc.next();

        if (senha.equals(senhaCorreta)) {
            System.out.println("Porta Aberta");
        } else{
            System.out.println("dados incorretos");

        }
        sc.close();


    }
    
}
