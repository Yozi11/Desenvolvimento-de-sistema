package ExemplosJava;
import java.io.FileReader;
import java.io.IOException;

public class Exemplo05 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("dados.py");
            int caracater;

            while ((caracater=fr.read())!=-1) {
                System.out.println((char)caracater);
                
            }
            fr.close();
            
        } catch (IOException e) {
            e.printStackTrace();
            // TODO: handle exception
        }
    }
    
}

/*
Filewrite
buffereWriter
File

 */
