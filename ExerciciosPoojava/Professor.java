package ExerciciosPoojava;
public class Professor extends Funcionarios{
    private String disciplina;

    public Professor(String nome, double salario, String disciplina){
        super(nome,salario);
        this.disciplina = disciplina;
    }
    public String getDisciplina(){
        return disciplina;
    }public void setDisciplina(String disciplina){
        this.disciplina = disciplina;
    }
    @Override
    public void exibirDados(){
        System.out.println("nome"+getNome()+"salario"+getSalario()+"disciplina"+disciplina+"");
    }    




    
}
