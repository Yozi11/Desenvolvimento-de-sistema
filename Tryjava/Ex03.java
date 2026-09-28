package Tryjava;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("informe o numero inteiro");
            int numero = sc.nextInt();

            System.out.println("voce digitou: "+numero);
        }catch(InputMismatchException exception){
            System.out.println("Erro voce deve digitar um numero inteiro");
        }



        sc.close();
    }
    
}
