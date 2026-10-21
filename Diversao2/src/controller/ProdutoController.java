package controller;

import java.util.ArrayList;
import dao.ProdutoDAO;
import model.Produto;

public class ProdutoController {
    private static ProdutoDAO dao;

    public ProdutoController(){
        dao = new ProdutoDAO();
    }

    // Retorna boolean em vez de void
    public static boolean cadastrar(int id, String nome, String categoria, double preco, int quantidade ){
        Produto produto = new Produto(id, nome, categoria, preco, quantidade);
        return dao.cadastrar(produto); 
    }

    public ArrayList<Produto> listar(){
        return dao.listar();
    }

    public Produto buscar(int id){
        return dao.buscar(id);
    }

    public boolean alterar(int id, String nome, String categoria, double preco, int quantidade ){
        return dao.alterar(id, nome, categoria, preco, quantidade);
    }
    
    public boolean remover(int id){
        return dao.remover(id);
    }
}