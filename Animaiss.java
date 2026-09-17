import java.util.ArrayList;

public class Animaiss {
    private ArrayList<Animais> listaAnimaiss;

    public Animaiss(){
        listaAnimaiss =  new ArrayList<>();

    }
    public void adcionarAnimal(Animais 0){
        listaAnimaiss.add(0);

        System.out.println("Animal cadastrado");
    }
    
}

public  void listaAnimais (){
    if (listaAnimaiss.isEmpty()) {
        System.out.println("Lista vazia");

        
    }else{
        System.out.println("\nLista de animais --");
        for(int i=0;i<listaAnimaiss.size();i++){
            System.out.println((i+1)+"-"+listaAnimaiss.get(i).exibirInfo());
        }
    }
}
public  void atualizarAnimal(int indece, Animais novoAnimais){
    if (indece>=0 && indece<listaAnimaiss.size()) {
        listaAnimaiss.set(indece,novoAnimais);
        System.out.println("Animal alterado com sucesso!");
        
    }else{
        System.out.println("indice invalido");
    }
}
public void removerAnimal(int indice){
    if (indece >=0 && indece<listaAnimaiss.size()) {
        listaAnimaiss.remove(indece);
        System.out.println("Animal removido com sucesso");
        
    }else{
        System.out.println("indece invalido ");
    }
}
