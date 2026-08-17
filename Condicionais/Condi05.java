package Condicionais;
import java.util.Scanner;

public class Condi05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("informe o nome: ");
        String nome =sc.nextLine();


        System.out.println("informe a senha");
        String senha=sc.nextLine();

        if (nome.equals("Raquel")&& senha.equals("1234")){
            System.out.println("Login realizado com sucesso");


        }else if (nome.equals("maria")&& senha.equals("5678")){

        }else{
            System.out.println("dados incorretos");
        }

        sc.close();

    }
    
}
