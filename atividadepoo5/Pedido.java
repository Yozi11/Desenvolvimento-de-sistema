package atividadepoo5;

// CLASSE ABSTRATA: Serve de molde genérico para os tipos de pedidos
public abstract class Pedido {
    
    // ENCAPSULAMENTO: Protegendo os dados principais
    private int numero;
    private String nomeCliente;
    private double valor;

    // CONSTRUTOR: Obriga a preencher estes dados ao iniciar um pedido
    public Pedido(int numero, String nomeCliente, double valor) {
        this.numero = numero;
        this.nomeCliente = nomeCliente;
        this.valor = valor;
    }

    // GETTERS E SETTERS (Formato Tradicional)

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomeCliente() {
        return this.nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    // Método para imprimir na tela
    public void mostrarDados() {
        System.out.println("Pedido Nº: " + this.numero);
        System.out.println("Cliente: " + this.nomeCliente);
        System.out.println("Valor do Pedido: R$ " + this.valor);
    }
}