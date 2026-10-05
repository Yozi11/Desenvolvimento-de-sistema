import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.classfile.BufWriter;
import java.util.Scanner;

public class MenuManipulacao {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String nomeArquivo = "arquivo.txt";
        File arquivo = new File(nomeArquivo);
        int opcao = 0;

        do{
            System.out.println("Menu manipulacao");
            System.out.println("1- criar arquivo");
            System.out.println("2- Escrever arquivo");
            System.out.println("3- Ler arquivo");
            System.out.println("4-Alterar arquivo");
            System.out.println("5- remover arquivo");
            System.out.println("6- sair ");
            System.out.println("Escolha uma opcao ");

            // caso o usuario digite apenas letra no menu este e o codigo que para
            if(!sc.hasNextInt()){
                System.out.println("Tente novamente! Digite apenas numeros");
                sc.next();
                continue;
            }
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                //Criando arquivo 
                case 1:
                    try {
                        if(arquivo.createNewFile()){
                            System.out.println("Arquivo criado"+arquivo.getName());
                        }else{
                            System.out.println("Arquivo ja existe");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                        // TODO: handle exception
                    }
                
                    
                    break;
                //Escrever
                case 2:
                    if (arquivo.exists()){
                        System.out.println("Erro:Arquivo ja existe");
                        break;
                    }
                    System.out.print("digite o texto:  ");
                    String textoEscrever = sc.nextLine();

                    try {
                        FileWriter fw = new FileWriter(arquivo);
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write(textoEscrever);
                        bw.newLine();
                        bw.close();
                        System.out.println("Sucesso: Texto escrito ");

                            
                        
                        
                    } catch (IOException e) {
                        System.out.println("Erro ao escrever o arquivo"+e.getMessage());

                        // TODO: handle exception
                    }
                    break;

                    
                    break;
                //Ler arquivo    
                case 3:
                    if (!arquivo.exists()){
                        System.out.println("Erro: o arquivo nao existe");
                        break;
                    }
                    System.out.println("\n---Conteudo de "+nomeArquivo+"---");
                    
                    try {
                       
                        
                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                    
                    break;
                case value:
                    
                    break;
                case value:
                    
                    break;
                case value:
                    
                    break;
            
                default:
                    break;
            }


        }
    }
    
}
