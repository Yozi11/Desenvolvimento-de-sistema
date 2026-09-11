import java.text.ListFormat.Style;
import java.util.Scanner;

public class CarrosApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Carros carro1 = new Carros();
        System.out.println("informe a maca do carro");
        carro1.setMarca(sc.nextLine());

        System.out.println("informe o modelo do carro");
        carro1.setModelo(sc.nextLine());

        System.out.println("informe o ano");
        carro1.setAnoFabricacao(sc.nextInt());


        System.out.println("A marca"+carro1.getMarca());
        System.out.println(" o modelo"+carro1.getModelo());
        System.out.println("Ano de fabricacao"+carro1.getAnoFabricacao());



        









        sc.close();
    }
    
}
