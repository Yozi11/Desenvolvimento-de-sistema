public class Carros {
    private String marca;
    private String modelo;
    private int anoFabricacao; // Ajustado para camelCase (anoFabricacao)

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getMarca() {
        return marca;
    }

    // CORRETO: Letra 's' minúscula
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    // CORRETO: Letra 's' minúscula
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}