public abstract class Animais {

    private String nome;
    private int idade;

    public Animais() {
    }

    public Animais(String nome, int idade) {
        this.nome = nome;
        this.idade = idade; // Atribuição adicionada
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome; 
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    
    public abstract void emitirSom();
}