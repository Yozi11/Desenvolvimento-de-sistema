package br.com.example.produto.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.example.produto.modelo.UserModelo;



public interface  UserRepositorio extends JpaRepository<UserModelo,Long> {
    UserModelo  findByUsuario(String usuario);

    
}
