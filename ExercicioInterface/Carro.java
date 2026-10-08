package ExercicioInterface;

public class Carro extends Veiculo {

    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano); 
    }

    @Override 
    public void mostrarDados() {
        System.out.print("🚗 [CARRO] "); // Imprime o ícone na mesma linha
        super.mostrarDados();           // Executa o print que já está no pai
    }
}