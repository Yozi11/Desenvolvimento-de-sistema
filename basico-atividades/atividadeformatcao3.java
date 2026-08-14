import java.util.Scanner;

public class atividadeformatcao3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("digite o nome do cliente");
        String nome=sc.nextLine();

        System.out.print("digite o nome do produto: ");
        String produto=sc.nextLine();

        System.out.print("digite a quantidade: ");
        int quantidade = sc.nextInt();

        System.out.print("digite o valor unitario: ");
        double unitario =sc.nextDouble();

        double total = quantidade*unitario;


        System.out.printf("Cliente: %s%n",nome);
        System.out.printf("Produto: %s%n",produto);
        System.out.printf("Quantidade: %d%n",quantidade);
        System.out.printf("Unitario: %.2f%n",unitario);



    }
    
}
