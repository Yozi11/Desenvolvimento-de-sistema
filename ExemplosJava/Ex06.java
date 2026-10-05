package ExemplosJava;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ex06 {
    public static void main(String[] args) {
        try {
            BufferedWriter bw  = new BufferedWriter(new FileWriter("dados.py"));
            bw.write("Terceira linha");
            bw.newLine();
            bw.write("Quarta linha");
            
            bw.close();
            System.out.println("Escrita concluida");
        } catch (IOException e) {

            // TODO: handle exception
        }
    }
    
}
