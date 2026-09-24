package atividade4;

// HERANÇA (extends) e IMPLEMENTAÇÃO (implements)
public class CursoPresencial extends Curso implements Matricula {
    
    // Atributos exclusivos do curso presencial
    private String sala;
    private String turno;

    // CONSTRUTOR: Repassa os dados base para a classe Pai (super) e guarda os locais
    public CursoPresencial(int codigo, String nome, int cargaHoraria, double valor, String sala, String turno) {
        super(codigo, nome, cargaHoraria, valor); // Chama o construtor de Curso.java
        this.sala = sala;
        this.turno = turno;
    }

    // Cumprindo o contrato da interface (matrícula normal)
    @Override
    public double calcularMatricula() {
        return getValor(); // Retorna o valor base do curso
    }

    // Cumprindo o contrato da interface (matrícula com desconto)
    @Override
    public double calcularMatricula(double desconto) {
        return getValor() - desconto; // Subtrai o desconto do valor base
    }

    // Aproveita a exibição da classe Pai e adiciona os dados específicos
    @Override
    public void mostrarDados() {
        System.out.println("--- CURSO PRESENCIAL ---");
        super.mostrarDados(); // Imprime código, nome, horas e valor
        System.out.println("Sala: " + this.sala);
        System.out.println("Turno: " + this.turno);
    }
}
