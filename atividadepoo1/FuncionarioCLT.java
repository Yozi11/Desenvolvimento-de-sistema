package atividadepoo1;

public class FuncionarioCLT extends Funcionario implements Pagamento {
    private double salarioMensal;

    public FuncionarioCLT(String nome, String cpf, double salarioMensal) {
        super(nome, cpf);
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularPagamento() {
        return this.salarioMensal;
    }

    @Override
    public double calcularPagamento(double bonus) {
        return this.salarioMensal + bonus;
    }
    
    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Tipo: CLT");
        System.out.println("Salário Fixo: R$ " + this.salarioMensal);
    }
}