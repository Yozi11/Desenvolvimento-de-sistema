import java.util.Scanner;

public class While3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("informe o numero: ");
        int limite = sc.nextInt();

        int numero = 1;
        while (numero<=limite){
            System.out.println(numero);
            numero++;
        }







        sc.close();
    }
    
}
