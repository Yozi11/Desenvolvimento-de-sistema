package ExercicioInterface;

// Importamos o JOptionPane para abrir janelinhas pop-up interativas na tela
import javax.swing.JOptionPane;
// Importamos o ArrayList para conseguir guardar uma lista dinâmica de objetos Carro na memória
import java.util.ArrayList;
// Importamos as ferramentas necessárias para criar e escrever em arquivos de texto (.txt)
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Sistema {
    public static void main(String[] args) {
        
        // Criamos a nossa "garagem virtual": uma lista dinâmica que armazenará apenas objetos do tipo Carro
        ArrayList<Carro> listaDeCarros = new ArrayList<>();

        // Loop infinito (while true) que mantém o menu reaparecendo até o usuário escolher a opção 7 (Sair)
        while (true) {
            
            // Montamos o texto explicativo do menu com as 7 opções
            String menu = "=== CONCESSIONÁRIA ===\n\n"
                        + "1 - Cadastrar Carro\n"
                        + "2 - Listar Carros\n"
                        + "3 - Detalhar Carro\n"
                        + "4 - Alterar Carro\n"
                        + "5 - Remover Carro\n"
                        + "6 - Gravar Informações em Arquivo\n"
                        + "7 - Sair\n\n"
                        + "Escolha uma opção:";

            // Exibe a janela de texto para o usuário digitar a opção desejada
            String entrada = JOptionPane.showInputDialog(null, menu, "Menu Principal", JOptionPane.QUESTION_MESSAGE);

            // Se o usuário clicar no botão 'Cancelar' ou fechar no 'X', a variável 'entrada' fica nula (null)
            if (entrada == null) {
                break; // Encerra o loop e fecha o programa com segurança
            }

            int opcao;
            // O bloco try-catch evita que o programa quebre se o usuário digitar letras no menu
            try {
                // Converte o texto digitado pelo usuário em um número inteiro
                opcao = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                // Se a conversão falhar (ex: digitou "abc"), avisa o usuário e volta para o início do menu
                JOptionPane.showMessageDialog(null, "Digite apenas números de 1 a 7!", "Erro", JOptionPane.ERROR_MESSAGE);
                continue; // O comando 'continue' pula o resto do código do loop e reexibe o menu
            }

            // O switch analisa o número que o usuário escolheu e redireciona para a funcionalidade correspondente
            switch (opcao) {
                
                // ==========================================
                // 1. CADASTRAR CARRO
                // ==========================================
                case 1:
                    // Pede a marca do veículo
                    String marca = JOptionPane.showInputDialog("Digite a marca do carro:");
                    if (marca == null) break; // Se cancelar, interrompe o cadastro

                    // Pede o modelo do veículo
                    String modelo = JOptionPane.showInputDialog("Digite o modelo do carro:");
                    if (modelo == null) break;

                    // Pede o ano como texto
                    String anoTexto = JOptionPane.showInputDialog("Digite o ano do carro:");
                    if (anoTexto == null) break;

                    // Valida se o ano digitado é um número
                    try {
                        int ano = Integer.parseInt(anoTexto);
                        
                        // Cria um novo objeto Carro na memória e adiciona ao final da nossa ArrayList
                        listaDeCarros.add(new Carro(marca, modelo, ano));
                        
                        JOptionPane.showMessageDialog(null, "Carro cadastrado com sucesso!");
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "O ano deve conter apenas números!", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                    break;

                // ==========================================
                // 2. LISTAR CARROS
                // ==========================================
                case 2:
                    // Testamos se a lista está vazia usando .isEmpty()
                    if (listaDeCarros.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhum carro cadastrado no momento.");
                    } else {
                        // StringBuilder é uma ferramenta eficiente para juntar/acumular vários textos longos
                        StringBuilder lista = new StringBuilder("Lista de Carros Cadastrados:\n\n");
                        
                        // Percorremos a lista usando um for tradicional para obter o índice (posição) de cada elemento
                        for (int i = 0; i < listaDeCarros.size(); i++) {
                            // Pega o carro que está na posição 'i'
                            Carro c = listaDeCarros.get(i);
                            
                            // Monta a linha com o número do índice e as informações de resumo (marca e modelo)
                            lista.append("Número: ").append(i)
                                 .append(" | Marca: ").append(c.getMarca())
                                 .append(" | Modelo: ").append(c.getModelo()).append("\n");
                        }
                        // Mostra a lista completa em uma única janela
                        JOptionPane.showMessageDialog(null, lista.toString());
                    }
                    break;

                // ==========================================
                // 3. DETALHAR CARRO
                // ==========================================
                case 3:
                    if (listaDeCarros.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhum carro cadastrado para detalhar.");
                        break;
                    }
                    
                    try {
                        // Pede para o usuário indicar a posição (número) do carro que quer consultar
                        int indexDetalhe = Integer.parseInt(JOptionPane.showInputDialog("Digite o NÚMERO do carro para detalhar:"));
                        
                        // Validação de segurança: o número precisa existir dentro da lista (entre 0 e o tamanho total - 1)
                        if (indexDetalhe >= 0 && indexDetalhe < listaDeCarros.size()) {
                            // Busca o carro na posição exata solicitada
                            Carro c = listaDeCarros.get(indexDetalhe);
                            
                            // Exibe todos os atributos do carro escolhido (Marca, Modelo e Ano)
                            String detalhes = "Detalhes do Carro (Posição " + indexDetalhe + "):\n\n"
                                            + "Marca: " + c.getMarca() + "\n"
                                            + "Modelo: " + c.getModelo() + "\n"
                                            + "Ano: " + c.getAno();
                            
                            JOptionPane.showMessageDialog(null, detalhes);
                        } else {
                            // Erro de fora dos limites da lista
                            JOptionPane.showMessageDialog(null, "Número inválido! Esse carro não existe na lista.", "Aviso", JOptionPane.WARNING_MESSAGE);
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Digite um número inteiro válido!", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                    break;

                // ==========================================
                // 4. ALTERAR CARRO
                // ==========================================
                case 4:
                    if (listaDeCarros.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhum carro cadastrado para alterar.");
                        break;
                    }
                    
                    try {
                        int indexAlterar = Integer.parseInt(JOptionPane.showInputDialog("Digite o NÚMERO do carro que deseja alterar:"));
                        
                        // Verifica se o número informado é válido
                        if (indexAlterar >= 0 && indexAlterar < listaDeCarros.size()) {
                            // Resgata a referência do carro escolhido
                            Carro c = listaDeCarros.get(indexAlterar);
                            
                            // Solicita os novos valores exibindo o valor antigo como referência
                            String novaMarca = JOptionPane.showInputDialog("Nova marca (Atual: " + c.getMarca() + "):");
                            if (novaMarca == null) break;
                            
                            String novoModelo = JOptionPane.showInputDialog("Novo modelo (Atual: " + c.getModelo() + "):");
                            if (novoModelo == null) break;
                            
                            String novoAnoTexto = JOptionPane.showInputDialog("Novo ano (Atual: " + c.getAno() + "):");
                            if (novoAnoTexto == null) break;
                            
                            int novoAno = Integer.parseInt(novoAnoTexto);
                            
                            // Usamos os métodos modificadores (Setters) herdados da classe Veiculo para atualizar os dados
                            c.setMarca(novaMarca);
                            c.setModelo(novoModelo);
                            c.setAno(novoAno);
                            
                            JOptionPane.showMessageDialog(null, "Dados do carro atualizados com sucesso!");
                        } else {
                            JOptionPane.showMessageDialog(null, "Número inválido! Digite uma posição válida.");
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Valores inválidos inseridos!", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                    break;

                // ==========================================
                // 5. REMOVER CARRO
                // ==========================================
                case 5:
                    if (listaDeCarros.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhum carro cadastrado para remover.");
                        break;
                    }
                    
                    try {
                        int indexRemover = Integer.parseInt(JOptionPane.showInputDialog("Digite o NÚMERO do carro que deseja remover:"));
                        
                        // Verifica se a posição escolhida existe na lista
                        if (indexRemover >= 0 && indexRemover < listaDeCarros.size()) {
                            // Remove o objeto da ArrayList na posição 'indexRemover'
                            listaDeCarros.remove(indexRemover);
                            
                            JOptionPane.showMessageDialog(null, "Carro removido com sucesso!");
                        } else {
                            JOptionPane.showMessageDialog(null, "Número inválido! Carro não encontrado.");
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Digite apenas números!", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                    break;

                // ==========================================
                // 6. GRAVAR INFORMAÇÕES EM ARQUIVO
                // ==========================================
                case 6:
                    if (listaDeCarros.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "A lista está vazia! Não há dados para salvar no arquivo.");
                        break;
                    }
                    
                    // Como operações de arquivo podem falhar (disco cheio, sem permissão), usamos o bloco try-catch com IOException
                    try {
                        // 1. O FileWriter abre/cria o arquivo "carros.txt" no disco do computador
                        FileWriter arquivo = new FileWriter("carros.txt");
                        
                        // 2. O BufferedWriter usa a memória RAM (buffer) para gravar as informações de forma muito mais rápida
                        BufferedWriter gravador = new BufferedWriter(arquivo);
                        
                        // Percorremos todos os carros guardados na memória
                        for (Carro c : listaDeCarros) {
                            // Monta a linha de texto com as informações do veículo
                            String linhaTextual = "Marca: " + c.getMarca() + " - Modelo: " + c.getModelo() + " - Ano: " + c.getAno();
                            
                            // Escreve o texto no arquivo
                            gravador.write(linhaTextual);
                            
                            // Pula para a linha de baixo (comando nativo do BufferedWriter)
                            gravador.newLine();
                        }
                        
                        // MUITO IMPORTANTE: Fecha o gravador! É no .close() que o conteúdo da memória é descarregado de fato no arquivo .txt
                        gravador.close();
                        
                        JOptionPane.showMessageDialog(null, "Dados salvos com sucesso no arquivo 'carros.txt'!");
                        
                    } catch (IOException e) {
                        // Caso aconteça um erro ao tentar criar/escrever no arquivo
                        JOptionPane.showMessageDialog(null, "Erro de gravação: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                    break;

                // ==========================================
                // 7. SAIR DO SISTEMA
                // ==========================================
                case 7:
                    JOptionPane.showMessageDialog(null, "Encerrando o sistema da concessionária. Até logo!");
                    System.exit(0); // Força a finalização completa do programa Java
                    break;

                // Se o usuário digitar um número fora do intervalo 1..7
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida! Escolha um número de 1 a 7.", "Aviso", JOptionPane.WARNING_MESSAGE);
            } // Fim do bloco switch
            
        } // Fim do loop while
    } // Fim do método main
} // Fim da classe Sistema