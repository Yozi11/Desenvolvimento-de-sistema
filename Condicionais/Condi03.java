package Condicionais;
import java.util.Scanner;

public class Condi03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("informa a idade");
        int idade=sc.nextInt();

        System.out.println("e estudante ? Digite 1 para Sim ou 0 nao: ");
        int estudante= sc.nextInt();

        if (idade>=60 || estudante==1){
            System.out.println("voce tem direito ao desconto");
        }else{
            System.out.println("voce nao tem direito ao desconto");
        }
    }
    
}
