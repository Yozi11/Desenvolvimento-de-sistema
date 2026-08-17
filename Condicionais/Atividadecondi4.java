package Condicionais;
import java.util.Scanner;

public class Atividadecondi4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("informe a idade: ");
        int idade = sc.nextInt();

        if (idade >= 18){
            System.out.println("e maior de idade");
        }else{
            System.out.println("voce e menor de idade");
        }
    }
    
}
