package br.com.example.produto.servico;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.example.produto.modelo.ProdutoModelo;
import br.com.example.produto.modelo.RespotaModelo;
import br.com.example.produto.repositorio.ProdutoRepositorio;

@Service 
public class ProdutoServico {
    
    private final ProdutoRepositorio repositorio;

    public ProdutoServico(ProdutoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public Iterable<ProdutoModelo> listar(){
        return repositorio.findAll();
    }

    public ResponseEntity<?> cadastrarAlterar(ProdutoModelo produto, String acao){
        
        // 1. Valida o nome e FECHA a chave
        if (produto.getNome() == null || produto.getNome().isBlank()) {
            return ResponseEntity.badRequest().body(criarRespota("O nome do produto e obrigatorio"));
        }

        // 2. Valida a marca e FECHA a chave
        if (produto.getMarca() == null || produto.getMarca().isBlank()) {
            return ResponseEntity.badRequest().body(criarRespota("O nome da marca e obrigatorio"));
        }
            
        // 3. Se passou pelas duas validações, salva o produto
        ProdutoModelo produtoSalvar = repositorio.save(produto);

        // 4. Retorna a resposta correta baseada na ação
        if ("cadastrar".equals(acao)) {
            return ResponseEntity.status(HttpStatus.CREATED).body(produtoSalvar);
        }
        
        return ResponseEntity.ok(produtoSalvar);
    }
    
    public ResponseEntity<RespotaModelo> remover(Long codigo){
        repositorio.deleteById(codigo);
        return ResponseEntity.ok(criarRespota("O produto foi removido "));
    }

    private RespotaModelo criarRespota(String mensagem){
        RespotaModelo respota = new RespotaModelo();
        // Dica: Você esqueceu de colocar a mensagem dentro da resposta!
        // Provavelmente precisa de algo assim:
        // respota.setMensagem(mensagem); 
        return respota;
    }
}