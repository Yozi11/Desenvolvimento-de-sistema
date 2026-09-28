import java.util.InputMismatchException;
import java.util.Scanner;

public class SafeBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldo = 1000.00;
        System.out.println("========== Bencido ao SafeBank");
        System.out.println("saldo disponivel: R$"+saldo);


        try{
            System.out.println("digite o valor que deseja sacar: ");
            double valorSaque = sc.nextDouble();

            if (valorSaque <0) {
                System.out.println("Eroo: o valor do saque nao pode ser negativo");
                
            }else if (valorSaque>saldo){
                System.out.println("Erro saldo insuficiente");
            }else{
                saldo -= valorSaque;
                System.out.println("Saque realizado com sucesso!");
                System.out.println("Novo saldo: R$"+saldo);
            }
        }catch(InputMismatchException e){
            System.out.println("Erro critico: entrada invalida por favor, use apenas numeros e virgula");
        }catch(Exception e){
            System.out.println("ocorreu um erro inesperado: "+e.getLocalizedMessage());

        }finally{
            System.out.println("operação finalizada");
        }



    }
    
}
