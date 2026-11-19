package br.com.example.produto.controle;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController; // Import adicionado

import br.com.example.produto.modelo.ProdutoModelo;
import br.com.example.produto.modelo.RespotaModelo;
import br.com.example.produto.modelo.UserModelo;
import br.com.example.produto.servico.LoginServico;
import br.com.example.produto.servico.ProdutoServico;

// 1. ANOTAÇÃO OBRIGATÓRIA ADICIONADA AQUI
@RestController 
public class ProdutoControle {
    
    private final ProdutoServico produtoServico;
    private final LoginServico loginServico;

    public ProdutoControle(ProdutoServico produtoServico, LoginServico loginServico) {
        this.produtoServico = produtoServico;
        this.loginServico = loginServico;
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<?> cadastrar(@RequestBody ProdutoModelo produto){
        return produtoServico.cadastrarAlterar(produto, "cadastrar");
    }

    @PutMapping("/alterar")
    public ResponseEntity<?> alterar(@RequestBody ProdutoModelo produto){
        return produtoServico.cadastrarAlterar(produto, "alterar");
    }

    @GetMapping("/listar")
    public Iterable<ProdutoModelo> listar(){
        return produtoServico.listar();
    }

    // 2. ERRO DE DIGITAÇÃO CORRIGIDO (uso de chaves {})
    @DeleteMapping("/remover/{codigo}") 
    public ResponseEntity<RespotaModelo> remover(@PathVariable("codigo") long codigo){
        return produtoServico.remover(codigo);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody UserModelo usuario){
        return loginServico.login(usuario);
    }

    @GetMapping("")
    public String rota(){
        return "api de produtos funcionando!";
    }
}