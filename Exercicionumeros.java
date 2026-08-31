import java.io.SyncFailedException;
import java.util.Scanner;

public class Exercicionumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] numeros = new int [5];
        int total = 0;
        int opcao = 0;


        do{
            System.out.println("--------- menu----");
            System.out.println("1- inserir numero");
            System.out.println("2- Listar numero");
            System.out.println("3- remover numero");
            System.out.println("4-sair ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    if (total==numeros.length){
                        System.out.println("erro array esta cheio");
                    }else{
                        System.out.print("digite o numero");
                        numeros[total] = sc.nextInt();
                        total++;
                        System.out.println("inserido com sucesso!");
                    }
                    

                    
                    break;
                case 2:
                    if (total == 0){
                        System.out.println("nenhum numero cadastrado.");

                    }else{
                        for (int i =0; i < total; i++){
                            System.out.println("indicie"+i+":"+numeros[i]);
                        }
                    }
                    
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
