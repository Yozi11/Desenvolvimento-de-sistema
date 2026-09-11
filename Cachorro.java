class Cachorro extends Animal {
    private String raca;

    
    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

   
    public void emitirSom() {
        System.out.println("Au Au!");
    }

    
    @Override
    public void exibirInfo() {
        super.exibirInfo(); 
        System.out.println("Raça: " + raca);
    }
}