package ExemplosJava;
// O 'import' serve para trazer ferramentas prontas do Java para dentro do nosso código.
// Aqui estamos importando a ferramenta 'File', que serve para manipular arquivos no computador.
import java.io.File;

// Importamos a 'IOException', que é um tipo de alerta de erro (Exceção) do Java.
// Ela lida com problemas de Entrada e Saída (Input/Output), como falhar ao ler ou criar um arquivo.
import java.io.IOException;

// Criação da nossa classe principal (o "molde" do nosso programa).
public class Exemplo01 {
    
    // O método 'main' é o ponto de partida. O Java sempre procura ele para começar a rodar o programa.
    public static void main(String[] args) {
        
        // O bloco 'try' (tentar) diz ao Java: "Tente executar o código abaixo. Se der erro, não feche o programa, me avise!"
        // Sempre usamos 'try' quando vamos mexer com coisas fora do programa, como arquivos do computador, pois algo pode dar errado (ex: falta de espaço no disco).
        try {
            
            // Criamos um objeto chamado 'arquivo' que representa um arquivo de texto chamado "exemplo.txt".
            // Atenção: Isso ainda não cria o arquivo de verdade no computador, apenas prepara a referência na memória.
            File arquivo = new File("exemplo.py");
            
            // O 'if' (se) vai testar uma condição. 
            // O comando 'arquivo.createNewFile()' é quem DE FATO tenta criar o arquivo no computador.
            // Se ele conseguir criar, o comando responde "true" (verdadeiro) e entra no bloco do 'if'.
            if (arquivo.createNewFile()) {
                
                // Imprime na tela a mensagem de sucesso junto com o nome do arquivo que foi criado.
                System.out.println("Arquivo criado com sucesso: " + arquivo.getName());
                
            } else {
                // O 'else' (senão) acontece se o comando acima responder "false" (falso).
                // Isso significa que o arquivo não foi criado porque já existia um com esse nome.
                System.out.println("Arquivo já existe");
            }
            
        // O 'catch' (capturar) é o parceiro do 'try'. Ele só é executado SE der algum problema grave na hora de criar o arquivo.
        } catch (IOException exception) {
            
            // Imprime uma mensagem amigável avisando que deu ruim.
            System.out.println("Ocorreu um erro ao tentar criar o arquivo.");
            
            // Esse comando imprime na tela o "rastro" do erro, mostrando exatamente em qual linha o Java tropeçou. É ótimo para o programador investigar o problema.
            exception.printStackTrace();
        }

    } // Fim do método main
} // Fim da classe Ex01