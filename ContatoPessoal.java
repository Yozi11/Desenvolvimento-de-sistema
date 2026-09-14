public class ContatoPessoal extends Contato {
    String parentesco;

    public  ContatoPessoal(String nome, String numero, String parentesco){
        super(nome,numero);
        this.parentesco = parentesco;

    }
    public String getParenteco(){
        return parentesco;
    }
    public void setParentesco(String parentesco){
        this.parentesco = parentesco;
    } 

    @Override 
    public String toString(){
        return  super.toString()+"\nTipopessoal parentesco: "+parentesco; 
    }
    
}
