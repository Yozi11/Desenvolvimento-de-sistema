package ExerciciosPoojava;
public class Animal {
    private String nome;
    private int idade;

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
    public void exibirDados() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }
    public void emitirSom() {
        System.out.println("O animal emite um som.");
    }

    

    
}
