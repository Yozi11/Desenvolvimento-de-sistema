import java.util.Scanner;

public class Desafiowhile3 {
    public class ProfessorFofo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = "";

        while (!nome.equalsIgnoreCase("Anderson")) {
            System.out.print("Digite o nome do professor mais fofo do SENAI: ");
            nome = scanner.nextLine();
        }

        System.out.println("Acertou! O professor Anderson é o mais fofo.");
        scanner.close();
    }
}
    
}
