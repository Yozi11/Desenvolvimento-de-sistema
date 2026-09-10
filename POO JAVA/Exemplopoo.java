public class Exemplopoo {
    public static void mensagem(){
        System.out.println("seja bem vindo");
    }

    /// com parametro e sem retorno
    public static void mostrarNome(String nome){
        System.out.println("Nome:"+nome);
    }
    //Sem  parametro e com retorno
    public static  int obeterNumero(){
        return 10;
    }
    
    //com parametro e com retorno 
    public static int  somar(int n1, int n2){
        return  n1+n2;
    }
    
    public static void main(String[] args) {
        mensagem();
        mostrarNome("matheus");
        int numero=obeterNumero();
        System.out.println("numero:"+numero);
        int resultado = somar(10,5);
        System.out.println("somar:"+resultado);
    }

}
