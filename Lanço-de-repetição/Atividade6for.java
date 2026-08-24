import java.util.Scanner;

public class Atividade6for {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int opcao = -1;

        while (opcao !=0){
            System.out.println("----- menu -----");
            System.out.println("1- calcular a tabuada");
            System.out.println("2- contagem regressiva");
            System.out.println("0-sair");
            System.out.println("escolha uma opçao");


            opcao = sc.nextInt();


            switch (opcao) {
                case 1:
                    System.out.println("digite o numero  para ver a tabuada");
                    int numero =sc.nextInt();
                    for (int i=1;i<=10;i++){
                        System.out.println(numero+"x"+i+"="+(numero*i));
                    }
                    
                    break;
                case 2:
                    System.out.println("contagem regressiva");
                    int inicio = sc.nextInt();

                    for (int i = inicio; i>=0; i--){
                        System.out.println(i);
                    }
                    
                    break;
           
                case 0:
                    System.out.println("saindo do menu");
                    
                    break;
            
                default:
                    System.out.println("numero invalida");
                    break;
            }
        }
    }
    
}
