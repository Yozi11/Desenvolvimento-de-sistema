import java.util.Scanner;

public class Atividadeformatacao2 {

    public static void main(String[] args) {
        Scanner aluno= new Scanner(System.in);

        System.out.print("digite seu nome: ");
        String nome=aluno.nextLine();

        System.out.print("digite sua nota1: ");
        double nota1 = aluno.nextDouble();

        System.out.print("digite a sua nota2: ");
        double nota2 = aluno.nextDouble();


        double media = (nota1 + nota2) / 2;


        System.out.printf("Nome: %s%n",nome);
        System.out.printf("Nota1: %.2f%n",nota1);
        System.out.printf("Nota2: %.2f%n",nota2);
        System.out.printf("Media: %.2f%n",media);

        aluno.close();

    



    }



    
}
