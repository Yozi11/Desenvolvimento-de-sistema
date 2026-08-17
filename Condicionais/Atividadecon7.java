package Condicionais;
import java.util.Scanner;

public class Atividadecon7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a cor do cd: (Verde,Azul,Amarelo,Vermelho) ");
        String cor =sc.nextLine();

        if (cor.equals(" verde")){
            System.out.println("o preço e 10,00");

        }else if(cor.equals("Azul")){
            System.out.println("o preço e 20,00");
        }else if(cor.equals("amarelo")){
            System.out.println(" o preço e 30,00");
        }else if(cor.equals("Vermelho")){
            System.out.println("o preço e 40,00");
        }
    }
    
}
