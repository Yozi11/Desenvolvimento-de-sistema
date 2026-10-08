package interfacejava;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Menu {
    public static void main(String[] args) {
        ArrayList<String> produtos = new ArrayList<>();

        boolean executando = true;

        while (executando) {
            String opcao = JOptionPane.showInputDialog(null,
                "Escolha uma opcao\n"+
                "1-cadastrar produto"+
                "2-Listar produtos"+
                "3-sair",
                "Menu principal",
                JOptionPane.QUESTION_MESSAGE

            );
            if (opcao==null) {
                JOptionPane.showMessageDialog(null, "operaçao cancelada");
                break;
                
            }
            switch (opcao) {
                case "1":
                    String produto = JOptionPane.showInputDialog(null,"digite o nome do produto",
                        "cadastro do produto",
                        JOptionPane.QUESTION_MESSAGE
                    );
                    if (produto==null || produto.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "produto nao cadastrado");

                        
                    }else{
                        produtos.add(produto);
                        JOptionPane.showMessageDialog(null, "produto cadastrado com sucesso!");
                    }
                    
                    break;
                case "2":
                    if (produtos.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhum produto cadastrado!");
                        
                    }else{
                        String lista = "produto cadastrados\n\n";
                        for(int i=0;i<produtos.size();i++){
                            lista+=(i+1)+"-"+produtos.get(i)
                            +"\n";
                        }
                        JOptionPane.showMessageDialog(null, lista,"Lista de produtos",
                            JOptionPane.INFORMATION_MESSAGE
                        );
                    }
                case "3":
                    JOptionPane.showMessageDialog(null, "saindo....");
                    executando=false;        
            
                default:
                    JOptionPane.showMessageDialog(null, "opcaçao invalida");
                    break;
            }
        
            
        }
    }
    
}
