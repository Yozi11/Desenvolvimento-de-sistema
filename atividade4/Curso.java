package atividade4;
// CLASSE ABSTRATA: Molde genérico. Não pode ser instanciada diretamente com 'new'.
public  abstract class Curso {

    //ENCAPSULAMENTO: atributos privados para seguraça dos dados
    private int codigo;
    private String nome;
    private  int cargaHoraria;
    private double valor;


    //Construtor: exige o preenchimento destes dados ao criar qualquer curso
    public Curso(int codigo, String nome, int cargaHoraria, double valor){
        this.codigo = codigo;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.valor = valor;

    }

    //GETTERS E SETTERS no formato tradicional

    public int getCodigo(){
        return this.codigo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getCargaHoraria(){
        return this.cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }
    public double getValor(){
        return  this.valor;
    }
    public void setValor(double valor){
        this.valor = valor;
    }

    public void mostrarDados(){
        System.out.println("Codigo:"+ this.codigo);
        System.out.println("Curso:"+ this.nome);
        System.out.println("Carga Horaria:"+ this.cargaHoraria+"horas");
        System.out.println("Valor: R$"+ this.valor);
    }





    
}
