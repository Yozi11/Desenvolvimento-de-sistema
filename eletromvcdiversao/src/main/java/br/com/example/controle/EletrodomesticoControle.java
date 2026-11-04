package br.com.example.controle;

import java.util.ArrayList;

import br.com.example.dao.EletrodomesticoDAO;
import br.com.example.modelo.Eletrodomestico;

public class EletrodomesticoControle {
    private EletrodomesticoDAO dao;

    public EletrodomesticoControle(){
        dao = new EletrodomesticoDAO();
    }
    
    public boolean cadastrar(int id, String nome, String marca, String voltagem, double preco){
        Eletrodomestico eletrodomestico = new Eletrodomestico(id, nome, marca, voltagem, preco);
        return dao.cadastrar(eletrodomestico);
    }
    public ArrayList<Eletrodomestico> listar(){
        return dao.listar();
    }

    public Eletrodomestico buscar(int id){
        return dao.buscar(id);
    }
    public boolean alterar(int id, String nome, String marca, String voltagem, double preco){
        return dao.alterar(id, nome, marca, voltagem, preco);
    }
    public boolean remover(int id){
         return dao.remover(id);
    }

    public void cadastrar(Eletrodomestico e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cadastrar'");
    }

    public void alterar(Eletrodomestico atual) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'alterar'");
    }
    
}
