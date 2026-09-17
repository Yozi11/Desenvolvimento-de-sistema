package ExerciciosPoojava;
public class ContatoProfissional extends Contatos {
    private String empresa;
    private String cargo;

    public ContatoProfissional(String nome, String numero, String empresa, String cargo ){
        super(nome,numero);
        this.empresa = empresa;
        this.cargo = cargo;

    }
    public String getEmpresa(){
        return empresa;
    }
    public  void setEmpresa(String empresa){
        this.empresa = empresa;
    }
    public String getCargo(){
        return cargo;
    }
    public void setCargo(String cargo){
        this.cargo =cargo;
    }

    @Override 
    public String toString(){
        return super.toString()+ "\nTipo: Profissional\nEmpresa: " + empresa + "\nCargo: " + cargo;
    }
    
}
