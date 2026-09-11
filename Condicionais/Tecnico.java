package Condicionais;
import ExerciciosPoojava.Funcionarios;

public class Tecnico extends Funcionarios {
    private String especialidade;

    public Tecnico(String nome, double salario, String especialidade) {
        super(nome, salario);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public void exibirDados() {
        System.out.println("nome: " + getNome() + ", salario: " + getSalario() + ", especialidade: " + especialidade);
    }
    
}
