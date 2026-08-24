import java.util.Scanner;

public class for5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for(int i=1;i<=3;i++){
            System.out.println("informe o nome:"+i);
            String nome=sc.nextLine();
            System.out.println("o nome cadastrado e: "+nome);

        }
        sc.close();
    }
    
}
