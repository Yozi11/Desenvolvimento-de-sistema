package Tryjava;
public class Ex02 {
    public static void main(String[] args) {
        int [] numeros = {10,20,30};

        try{
            System.out.println(numeros [5]);
        }catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("erro indice fora da lista");
        }finally{
            System.err.println("Fim do programa");
        }
    }
    
}
