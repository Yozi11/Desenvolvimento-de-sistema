package br.com.example.produto.servico;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import br.com.example.produto.modelo.RespotaModelo;
import br.com.example.produto.modelo.UserModelo;
import br.com.example.produto.repositorio.UserRepositorio;

public class LoginServico {
    private final UserRepositorio userRepo;

    public LoginServico(UserRepositorio userRepo){
        this.userRepo=userRepo;
    }


    public ResponseEntity<RespotaModelo> login(UserModelo usuarioReq){
        RespotaModelo respota = new RespotaModelo();

        String usuario=usuarioReq.getUsuario();
        String senha = usuarioReq.getSenha();

        if (usuario==null|| usuario.isBlank() || senha==null|| senha.isBlank()) {
            respota.setMensagem("informe o usuario e senha");
            return ResponseEntity.badRequest().body(respota);
            
        }

        UserModelo user = userRepo.findByUsuario(usuario);

        if (usuario==null) {
            respota.setMensagem("usuario nao encontrado!");
            return  ResponseEntity.status(HttpStatus.NOT_FOUND).body(respota);

            
        }
        
        if (!senha.equals(user.getSenha())) {
            respota.setMensagem("Senha incorreta");
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(respota);
            
        }
        respota.setMensagem("login realizado com sucesso");
        return ResponseEntity.ok(respota);
    }
    
}
