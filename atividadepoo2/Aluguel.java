package atividadepoo2; // Linha de pacote para evitar erros de ficheiro duplicado no editor

// INTERFACE: É um "contrato". Define QUAIS métodos as classes filhas são obrigadas a criar.
public interface Aluguel {
    
    // Método 1: Declara o cálculo normal recebendo apenas a quantidade de dias
    double calcularAluguel(int dias);
    
    // Método 2 (SOBRECARGA): Mesmo nome de método, mas aceita um parâmetro extra (desconto)
    double calcularAluguel(int dias, double desconto);
}