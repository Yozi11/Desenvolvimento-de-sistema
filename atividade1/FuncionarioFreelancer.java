package atividade1;

public class FuncionarioFreelancer extends Funcionario implements Pagamento {
    private int horasTrabalhadas;
    private double valorHora;

    public FuncionarioFreelancer(String nome, String cpf, int horasTrabalhadas, double valorHora) {
        super(nome, cpf); // Repassa nome e cpf para a classe pai
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularPagamento() {
        return this.horasTrabalhadas * this.valorHora;
    }

    @Override
    public double calcularPagamento(double bonus) {
        return calcularPagamento() + bonus;
    }
    
    @Override
    public void mostrarDados() {
        super.mostrarDados(); // Chama o método da classe pai
        System.out.println("Tipo: Freelancer");
        System.out.println("Horas Trabalhadas: " + this.horasTrabalhadas);
        System.out.println("Valor da Hora: R$ " + this.valorHora);
    }
}