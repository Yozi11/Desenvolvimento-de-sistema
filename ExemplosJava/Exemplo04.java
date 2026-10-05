package ExemplosJava;
import java.io.FileWriter;
import java.io.IOException;

public class Exemplo04 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("dado.py");
            fw.write("linha\n");
            fw.write("Segunda linha\n");
            fw.close();
            System.out.println("Escrita concluida");
            
        } catch (IOException e) {
            e.printStackTrace();
            
        }
    }
    
}
