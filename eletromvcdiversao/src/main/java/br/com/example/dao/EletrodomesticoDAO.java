package br.com.example.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.example.conexao.Conexao;
import br.com.example.modelo.Eletrodomestico;

public class EletrodomesticoDAO {
    public boolean cadastrar(Eletrodomestico eletrodomestico){
        String sql = "INSERT INTO eletrodomesticos(nome,marca,voltagem,preco)VALUES(?,?,?,?)";
        try(Connection conexao = Conexao.conectar();
    PreparedStatement comando = conexao.prepareStatement(sql)){
        comando.setInt(1, eletrodomestico.getId());
        comando.setString(2, eletrodomestico.getNome());
        comando.setString(3, eletrodomestico.getMarca());
        comando.setString(4, eletrodomestico.getVoltagem());
        comando.setDouble(5, eletrodomestico.getPreco());
        comando.executeUpdate();
        return true;

    }catch(SQLException e){
        System.out.println("Erro ao cadastrar "+e.getMessage());
        return false;
    }  
    }
    public ArrayList<Eletrodomestico> listar(){
        ArrayList<Eletrodomestico>eletrodomesticos = new ArrayList<>();
        String sql ="SELECT id,nome,marca,voltagem,preco FROM eletrodomesticos ORDER BY id";
        try(Connection conexao = Conexao.conectar(); PreparedStatement
        comando = conexao.prepareStatement(sql);
    ResultSet resultado = comando.executeQuery()){
        while (resultado.next()) {
            Eletrodomestico eletrodomestico = new Eletrodomestico();
            eletrodomestico.setId(resultado.getInt("id"));
            eletrodomestico.setNome(resultado.getString("nome"));
            eletrodomestico.setMarca(resultado.getString("marca"));
            eletrodomestico.setVoltagem(resultado.getString("voltagem"));
            eletrodomestico.setPreco(resultado.getDouble("preco"));
        }
    }
    }

    
}
