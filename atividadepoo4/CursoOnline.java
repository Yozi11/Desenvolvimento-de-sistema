package atividadepoo4;

public class CursoOnline extends Curso implements Matricula {
    
    // Atributos exclusivos do curso online
    private String plataforma;
    private String codigoAcesso;

    // Construtor
    public CursoOnline(int codigo, String nome, int cargaHoraria, double valor, String plataforma, String codigoAcesso) {
        super(codigo, nome, cargaHoraria, valor);
        this.plataforma = plataforma;
        this.codigoAcesso = codigoAcesso;
    }

    @Override
    public double calcularMatricula() {
        return getValor();
    }

    @Override
    public double calcularMatricula(double desconto) {
        return getValor() - desconto;
    }

    @Override
    public void mostrarDados() {
        System.out.println("--- CURSO ONLINE ---");
        super.mostrarDados();
        System.out.println("Plataforma: " + this.plataforma);
        System.out.println("Código de Acesso: " + this.codigoAcesso);
    }
}