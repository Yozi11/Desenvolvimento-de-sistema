import java.util.Scanner;

public class Atividadeformatacao1 {

public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);

    System.out.print("digite o nome do produto: ");
    String produto = teclado.nextLine();

    System.out.print("digite a quantidade: ");
    int quantidade = teclado.nextInt();

    System.out.print("digite o preço");
    double preco = teclado.nextDouble();


    System.out.printf("Produto: %s%n Quantidade: %d%n Preco: %.2f%n",produto,quantidade,preco);

    
}
    
}
