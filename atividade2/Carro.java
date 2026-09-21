package atividade2; // Ficheiro pertencente ao pacote atividade2

// HERANÇA + INTERFACE na mesma linha de declaração:
// 'extends Veiculo' -> Herda todos os atributos e métodos da classe pai (Veiculo)
// 'implements Aluguel' -> Assume o compromisso de programar a lógica dos métodos da interface Aluguel
public class Carro extends Veiculo implements Aluguel {

    // CONSTRUTOR: Recebe os dados do formulário e reencaminha para a classe pai usando o 'super'
    public Carro(String placa, String modelo, int ano, double valorDiaria) {
        super(placa, modelo, ano, valorDiaria); // O super() executa o construtor da classe Veiculo
    }

    // @Override indica que estamos a cumprir/sobrescrever o método definido na Interface
    @Override
    public double calcularAluguel(int dias) {
        // Usa o getValorDiaria() herdado da classe pai e multiplica pelos dias
        return getValorDiaria() * dias;
    }

    // Sobrecarga do método de cálculo (versão que recebe também o valor do desconto)
    @Override
    public double calcularAluguel(int dias, double desconto) {
        // Calcula o valor total dos dias e subtrai o desconto
        return (getValorDiaria() * dias) - desconto;
    }

    // Sobrescreve o método de exibição para identificar o tipo específico de veículo
    @Override
    public void mostrarDados() {
        System.out.println("--- TIPO: CARRO ---");
        super.mostrarDados(); // Chama a exibição original da classe pai
    }
}