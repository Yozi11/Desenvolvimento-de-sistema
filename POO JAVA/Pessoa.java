public class Pessoa {
     private int codigo;
     private String nome;



     public Pessoa(int codigo,String nome){
        this.codigo=codigo;
        this.nome=nome;

     }
     public  int getcodigo(){
        return  codigo;
     }
     public void setcodigo(int codigo){
        this.codigo=codigo;
     }
     public String getnome(){
        return nome;
     }
     public void setnome(String nome){
        this.nome=nome;
     }
    
}
