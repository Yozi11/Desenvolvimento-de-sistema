package dao;

import java.util.ArrayList;
import model.Produto;

public class ProdutoDAO {
    // Lista estática para manter os dados na memória corretamente
    private static ArrayList<Produto> produtos = new ArrayList<>();

    // Retorna boolean em vez de void
    public boolean cadastrar(Produto produto){
        // Verifica se já existe antes de adicionar
        if (buscar(produto.getId()) != null) {
            return false; // Retorna falso se o ID for repetido
        }
        produtos.add(produto);
        return true; // Retorna verdadeiro se cadastrou
    }

    public ArrayList<Produto> listar(){
        return produtos;
    }

    public Produto buscar(int id ){
        for (Produto produto : produtos){
            if (produto.getId() == id ){
                return produto;
            }
        }
        return null;
    }

    public boolean alterar(int id, String nome, String categoria, double preco, int quantidade ){
        Produto produto = buscar(id);
        if (produto != null) {
            produto.setNome(nome);
            produto.setCategoria(categoria);
            produto.setPreco(preco);
            produto.setQuantidade(quantidade);
            return true;
        }
        return false;
    }

    public boolean remover(int id){
        Produto produto = buscar(id);
        if (produto != null) {
            produtos.remove(produto);
            return true;
        }
        return false;
    }
}