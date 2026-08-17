package Condicionais;
import java.util.Scanner;

public class Atividadecondi6 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o numero1: ");
        double numero1 = sc.nextDouble();


        System.out.println("digite o numero2: ");
        double numero2 = sc.nextDouble();

        String operador = sc.next();


        if (operador.equals("+")){
            System.out.println(numero1+numero2);
        }else if(operador.equals("-")){
            System.out.println(numero1-numero2);
        }else if(operador.equals("*")){
            System.out.println(numero1*numero2);
        }else if(operador.equals("n1/n2")){
            System.out.println(numero1/numero2);
        }
        sc.close();
    }
    
}
