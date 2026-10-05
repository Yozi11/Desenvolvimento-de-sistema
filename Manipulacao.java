import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Manipulacao {
    public static void main(String[] args) {
        //Criar Arquivo
        try {
          File arquivo = new File("arquivo.txt");
          if (arquivo.createNewFile()) {
            System.out.println("Arquivo criado "+arquivo.getName());
            
          }else{
            System.out.println("Arquivo ja existe");
          }
        } catch (IOException e) {
            e.printStackTrace();
            // TODO: handle exception
        }

        //Escrever

        try {
            FileWriter escritor = new FileWriter("arquivo.txt");
            escritor.write("ola este e o conteudo inicial");
            escritor.write("Linha 2 do arquivo");
            escritor.close();
            System.out.println("conteudo escrito com sucesso");
        } catch (IOException e) {
            System.out.println("Erro ao escrever"+e.getMessage());
            // TODO: handle exception
        }

        //lER ARQUIVO

        try {
            BufferedReader reader = new BufferedReader(new FileReader("arquivo.txt"));
            String linha;

            System.out.println("\nConteudo do arquivo");
            while ((linha=reader.readLine())!=null) {
                System.out.println(linha);
                
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler"+e.getMessage());
            // TODO: handle exception
        }

        //Alterar

        try {
            FileWriter fw = new FileWriter("arquivo.txt");
            fw.write("conteudo alterado\n");
            fw.write("Nova informaçao no arquivo");
            fw.close();

            System.out.println("arquivo alterado com sucesso ");
        } catch (IOException e) {
            System.out.println("Erro ao alterrar"+e.getMessage());
            // TODO: handle exception
        }

        //Mostrar conteudo apos alteraçao
        try {
            BufferedReader br = new BufferedReader(new FileReader("arquivo.txt"));
            String linha;

            System.out.println("\n Conteudo apos alterar");
            while ((linha=br.readLine())!=null) {
                System.out.println(linha);
                
            }
            br.close();
            
        } catch (IOException e) {
            System.out.println("Erro ao ler "+e.getMessage());
            // TODO: handle exception
        }

        File arquivo = new File("arquivo.txt");
        if (arquivo.delete()) {
            System.out.println("arquivo removido");
            
        }else{
            System.out.println("Erro ao remover o arquivo ");
        }


    }
    
}
