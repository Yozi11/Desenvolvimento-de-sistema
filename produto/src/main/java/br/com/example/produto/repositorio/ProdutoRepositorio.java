package br.com.example.produto.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.example.produto.modelo.ProdutoModelo;

public interface  ProdutoRepositorio extends JpaRepository<ProdutoModelo,Long> {
    

    
}
