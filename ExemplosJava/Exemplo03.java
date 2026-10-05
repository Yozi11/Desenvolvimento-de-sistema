package ExemplosJava;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        try {
            File arquivo = new File("exemplo.py");
            Scanner sc = new Scanner(arquivo);
            
            while (sc.hasNextLine()) {
                String linha = sc.nextLine();
                System.out.println(linha);
                
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo nao encontrado");
            e.printStackTrace();
            
        }
    }
    
}
