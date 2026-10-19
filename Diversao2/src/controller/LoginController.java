package controller;

import dao.UsuarioDAO;
import model.Usuario;

public class LoginController {
    private UsuarioDAO dao;

    public LoginController(){
        dao = new UsuarioDAO();
    }

    public boolean fazerLogin(String login, String senha){
        Usuario usuario = new Usuario(login, senha);
        return dao.autenticar(usuario);
    }

    
}
