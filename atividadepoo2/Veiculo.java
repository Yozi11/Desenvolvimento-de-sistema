package atividadepoo2; // Pacote da atividade 2

// CLASSE ABSTRATA: Serve de modelo (mãe) para Carro e Moto. Não pode ser criada diretamente com 'new'.
public abstract class Veiculo {
    
    // ENCAPSULAMENTO: Atributos 'private' para que nenhuma outra classe altere estes dados sem passar pelos setters
    private String placa;
    private String modelo;
    private int ano;
    private double valorDiaria;

    // CONSTRUTOR: Método especial executado ao criar o objeto para preencher os dados iniciais
    public Veiculo(String placa, String modelo, int ano, double valorDiaria) {
        this.placa = placa;           // Guarda a placa recebida no atributo privado desta classe
        this.modelo = modelo;         // Guarda o modelo recebido no atributo privado desta classe
        this.ano = ano;               // Guarda o ano recebido no atributo privado desta classe
        this.valorDiaria = valorDiaria; // Guarda o valor da diária no atributo privado desta classe
    }

    // GETTERS E SETTERS (Formato Tradicional)

    // Getter da Placa: Devolve o valor guardado no atributo privado
    public String getPlaca() {
        return this.placa;
    }

    // Setter da Placa: Altera o valor guardado no atributo privado
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    // Getter do Modelo
    public String getModelo() {
        return this.modelo;
    }

    // Setter do Modelo
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Getter do Ano
    public int getAno() {
        return this.ano;
    }

    // Setter do Ano
    public void setAno(int ano) {
        this.ano = ano;
    }

    // Getter do Valor da Diária
    public double getValorDiaria() {
        return this.valorDiaria;
    }

    // Setter do Valor da Diária
    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    // MÉTODOS DE AÇÃO
    // Método para imprimir na consola os dados genéricos do veículo
    public void mostrarDados() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Placa: " + this.placa);
        System.out.println("Ano: " + this.ano);
        System.out.println("Valor da Diária: R$ " + this.valorDiaria);
    }
}