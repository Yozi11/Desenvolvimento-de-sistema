package ExerciciosPoojava;
class Gato extends Animal {
    private String cor;

    
    public Gato(String nome, int idade, String cor) {
        super(nome, idade);
        this.cor = cor;
    }

   
    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }

    
    @Override
    public void exibirInfo() {
        super.exibirInfo(); 
        System.out.println("Cor: " + cor);
    }
}