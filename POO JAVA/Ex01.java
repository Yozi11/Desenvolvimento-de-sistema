import java.util.ArrayList;

public class Ex01 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Marcos");

        //Listar
        System.out.println("Lista");
        for (String nome:nomes){
            System.out.println(nome);
        }
        
        //Alterar
        nomes.set(index: 1,  "edivivandecodecleide");
        System.out.println("Lista apos alterar");
        for(String nome:nomes){
            System.out.println(nome);
        }
        //Remover
        nomes.remove(index:0);

        System.out.println("Lista de nomes apos remoção");
        for(String nome:nomes){
            System.out.println(nome);
        }
    

    
    }
    
}
