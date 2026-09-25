package atividadepoo2; // Ficheiro pertencente ao pacote atividade2

// Estrutura idêntica à classe Carro (herda de Veiculo e assina o contrato da interface Aluguel)
public class Moto extends Veiculo implements Aluguel {

    // Construtor a reencaminhar os dados para a classe pai (Veiculo)
    public Moto(String placa, String modelo, int ano, double valorDiaria) {
        super(placa, modelo, ano, valorDiaria);
    }

    // Lógica do cálculo simples de aluguel para motos
    @Override
    public double calcularAluguel(int dias) {
        return getValorDiaria() * dias;
    }

    // Lógica do cálculo de aluguel com desconto para motos
    @Override
    public double calcularAluguel(int dias, double desconto) {
        return (getValorDiaria() * dias) - desconto;
    }

    // Identifica que os dados exibidos pertencem a uma Moto
    @Override
    public void mostrarDados() {
        System.out.println("--- TIPO: MOTO ---");
        super.mostrarDados(); // Executa o método da classe pai
    }
}