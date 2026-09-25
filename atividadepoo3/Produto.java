package atividadepoo3;


// CLASSE ABSTRATA: Serve de modelo base para ProdutoFisico e ProdutoDigital
public abstract class Produto {
    
    // ENCAPSULAMENTO: Atributos privados protegidos contra acesso direto
    private int codigo;
    private String nome;
    private double preco;

    // CONSTRUTOR: Inicializa os dados principais do produto
    public Produto(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    // GETTERS E SETTERS (Formato Tradicional)

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Exibe os dados base do produto na consola
    public void mostrarDados() {
        System.out.println("Código: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço Unitário: R$ " + this.preco);
    }
}