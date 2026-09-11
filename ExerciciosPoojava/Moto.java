package ExerciciosPoojava;
public class Moto extends Veiculo {
    private int cilindrada;

    public Moto(String marca, int ano, int cilindrada) {
        super(marca, ano);
        this.cilindrada = cilindrada;
    }

    @Override
    public void exibirInfo() {
        System.out.println("=== Informações da Moto ===");
        super.exibirInfo();
        System.out.println("Cilindrada: " + cilindrada + "cc\n");
    }
}