package ExemplosJava;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Ex07 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("dado.py"));
            String linha;

            while ((linha=br.readLine())!=null) {
                System.out.println(linha);
                
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
            // TODO: handle exception
        }
    }
    
}
