

public class Agencia {
    // ENCAPSULAMENTO: Atributos privados (ninguém mexe direto neles)
    private int numeroAgencia;
    private String nomeAgencia;

    // CONSTRUTOR: Exige o número e o nome na hora de criar a agência
    public Agencia(int numeroAgencia, String nomeAgencia) {
        this.numeroAgencia = numeroAgencia;
        this.nomeAgencia = nomeAgencia;
    }

    // GETTERS E SETTERS (Formato padrão para acessar os dados)
    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public String getNomeAgencia() {
        return nomeAgencia;
    }

    public void setNomeAgencia(String nomeAgencia) {
        this.nomeAgencia = nomeAgencia;
    }

    // Método para mostrar os dados da agência na tela
    public void mostrarDadosAgencia() {
        System.out.println("Agência: " + numeroAgencia + " - " + nomeAgencia);
    }
}