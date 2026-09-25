package atividadepoo5;

// INTERFACE: Define o contrato de pagamento
public interface Pagamento {
    
    // SOBRECARGA 1: Pagamento em Dinheiro (recebe apenas o valor)
    void realizarPagamento(double valor);
    
    // SOBRECARGA 2: Pagamento em PIX (recebe valor e chave PIX)
    void realizarPagamento(double valor, String chavePix);
    
    // SOBRECARGA 3: Pagamento em Cartão (recebe valor e parcelas)
    void realizarPagamento(double valor, int parcelas);
}