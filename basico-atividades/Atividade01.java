import java.util.Scanner;

public class Atividade01 {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("informe o numero1: ");
        double N1=sc.nextDouble();

        System.out.println("informe o numero2: ");
        double N2=sc.nextDouble();

        double soma = N1 + N2;
        double subtracao = N1 - N2;
        double multiplicacao = N1 * N2;
        double divisao = N1 / N2;

        System.out.println("soma: "+soma);
        System.out.println("subtraçao: "+subtracao);
        System.out.println("multiplicaçao: "+multiplicacao);
        System.out.println("multiplicaçao: "+divisao);


        
    }
    
}
