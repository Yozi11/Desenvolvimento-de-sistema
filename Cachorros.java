public class Cachorros extends Animais {
    
    private String raca;

    // Construtor
    public Cachorros(String nome, int idade, String raca) {
        super(nome, idade); // Chama o construtor da classe pai (Animais)
        this.raca = raca;   // Atribui o valor à variável específica desta classe
    }

    // Métodos Get e Set para o atributo raca
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    // Implementação do método abstrato (obrigatório se foi criado na classe Animais)
    @Override
    public void emitirSom() {
        System.out.println(getNome() + " (Raça: " + raca + ") está latindo: Au Au!");
    }
}