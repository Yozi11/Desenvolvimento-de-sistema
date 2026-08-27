package Array;
import java.util.Scanner;



public class Array6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String []nomes;
        int[] idade;

        System.out.println("Quantas pessoas deseja cadastrar");

        int quantidade =  sc.nextInt();

        nomes=new String[quantidade];
        idade = new int [quantidade];

        for(int i=0;i<quantidade;i++){
            System.out.println("digite o nome");
            nomes[i] =sc.nextLine();


            System.out.println("digite a idade");
            idade [i]= sc.nextInt();
            sc.nextLine();
        }
        for(int i=0; i<quantidade;i++){
            System.out.println(nomes[i]+"-"+idade[i]+"anos");
        }






        sc.close();
    }
    
}
