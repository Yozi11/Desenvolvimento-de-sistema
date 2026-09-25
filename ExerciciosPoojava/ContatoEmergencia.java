

package ExerciciosPoojava;
public class ContatoEmergencia extends Contatos {
    private String grauPrioridade;

    public ContatoEmergencia(String nome, String numero, String grauPrioridade) {
        super(nome, numero);
        this.grauPrioridade = grauPrioridade;
    }

    public String getGrauPrioridade() {
        return grauPrioridade;
    }

    public void setGrauPrioridade(String grauPrioridade) {
        this.grauPrioridade = grauPrioridade;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo: Emergência\nPrioridade: " + grauPrioridade;
    }
}