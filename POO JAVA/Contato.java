public class Contato {
    private String nome;
    private String numero;

    // Construtor
    public Contato(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }

    // --- OS MÉTODOS SETTERS QUE FALTAM: ---
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    // Para exibir o contato bonitinho na lista
    @Override
    public String toString() {
        return "Nome: " + nome + " | Telefone: " + numero;
    }
}