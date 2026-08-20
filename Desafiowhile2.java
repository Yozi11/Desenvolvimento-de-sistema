import java.util.Scanner;

public class Desafiowhile2 {

    public static void main(String[] args) {
        Scanner sc =  new scanner(System.in);

        System.out.println("digite numeros positivos: ");

        while (true){
            double numero = sc.nextDouble();
            
            if (numero < 0) {
                System.out.println("fim do programa");
                break;
            }
        }
    }
    
}
