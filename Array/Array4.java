package Array;
import java.util.Scanner;

public class Array4 {


    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String [] nomes = new String[3];



        
        for (int i=0;i<nomes.length;i++){
            System.out.println("inform o nome: ");

        }
        System.out.println("Nomes cadastrado sao: ");

        for(String nome:nomes){
            System.out.println(nomes);
        }

        for(int i=0;i<nomes.length;i++){
            System.out.println(nomes[i]);
        }
        sc.close();
    }
    
}
