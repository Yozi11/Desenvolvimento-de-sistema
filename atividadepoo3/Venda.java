package atividadepoo3; // Pertence ao pacote da atividade 3

// INTERFACE: Define as operações obrigatórias de venda para qualquer tipo de produto
public interface Venda {
    
    // Método 1: Calcula o valor total da venda normal com base na quantidade
    double calcularVenda(int quantidade);
    
    // Método 2 (SOBRECARGA): Mesmo nome, mas aceita a taxa percentual de desconto
    double calcularVenda(int quantidade, double percentualDesconto);
}