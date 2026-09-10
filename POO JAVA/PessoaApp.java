public class PessoaApp {
    public static void main(String[] args) {
        Pessoa p1=new Pessoa(1, "edivandercidecleide");
        Pessoa p2=  new Pessoa(2, "carla");



        System.out.println("pessoa:"+p1.getcodigo()+"nome"+p1.getnome());



        //modificador
        p1.setnome("vanessa");

        System.out.println("Pessoa:"+p1.getcodigo()+"nome"+p1.getnome());
    }
    
}
