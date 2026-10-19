package dao;

import model.Usuario;

public class UsuarioDAO {
    public boolean autenticar(Usuario usuario){
        return usuario.getLogin().equals("admin") && usuario.getSenha().equals("123");
    }
    
}
