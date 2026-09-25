// Define o pacote (a pasta do projeto) onde este arquivo está salvo.
package atividadepoo6;

// Importa a ferramenta Scanner, que permite ao programa ler o que você digita no teclado.
import java.util.Scanner;

// Declara a classe pública chamada Principal. Todo programa Java precisa de pelo menos uma classe.
public class Principal {
    
    // É o método principal. O Java sempre procura esse método 'main' para saber onde começar a rodar o programa.
    public static void main(String[] args) {
        
        // Cria um objeto chamado 'scanner' que vai "escutar" o teclado (System.in) e ler os dados digitados.
        Scanner scanner = new Scanner(System.in);

        // Imprime uma linha em branco e o título do menu na tela.
        System.out.println("=== CADASTRO INICIAL ===");
        
        // Imprime a pergunta na tela sem pular linha (por causa do 'print' em vez de 'println').
        System.out.print("Número da agência: ");
        
        // Lê o próximo número inteiro que o usuário digitar e guarda na variável 'numAgencia'.
        int numAgencia = scanner.nextInt();
        
        // "Limpa o buffer". Consome a quebra de linha (Enter) que sobrou do número digitado acima, evitando pular a próxima leitura.
        scanner.nextLine(); 
        
        // Imprime a pergunta pedindo o nome da agência.
        System.out.print("Nome da agência: ");
        
        // Lê a linha inteira de texto que o usuário digitar (incluindo espaços) e guarda na variável 'nomeAgencia'.
        String nomeAgencia = scanner.nextLine();

        // Usa as variáveis 'numAgencia' e 'nomeAgencia' coletadas acima para criar (instanciar) um novo objeto do tipo Agencia.
        Agencia agencia = new Agencia(numAgencia, nomeAgencia);

        // Imprime a pergunta pedindo o número da conta.
        System.out.print("Número da conta: ");
        
        // Lê o número digitado e guarda na variável 'numConta'.
        int numConta = scanner.nextInt();
        
        // Limpa o buffer do teclado novamente após ler um número.
        scanner.nextLine(); 
        
        // Imprime a pergunta pedindo o nome do dono da conta.
        System.out.print("Titular: ");
        
        // Lê o texto digitado e guarda na variável 'titular'.
        String titular = scanner.nextLine();
        
        // Imprime a pergunta pedindo o valor inicial em dinheiro da conta.
        System.out.print("Saldo inicial: R$ ");
        
        // Lê um número decimal (com vírgula/ponto) e guarda na variável 'saldoInicial'.
        double saldoInicial = scanner.nextDouble();

        // Cria a ContaCorrente usando os dados lidos (número, titular, saldo) E a 'agencia' que criamos na linha 35.
        ContaCorrente conta = new ContaCorrente(numConta, titular, saldoInicial, agencia);

        // Inicia um loop infinito. O programa vai repetir esse bloco de código para sempre, até encontrar o comando 'return'.
        while (true) {
            
            // As próximas 9 linhas apenas imprimem o texto do menu visual na tela do usuário.
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Mostrar dados da conta");
            System.out.println("2 - Consultar saldo");
            System.out.println("3 - Depositar");
            System.out.println("4 - Pagar com PIX");
            System.out.println("5 - Pagar com cartão");
            System.out.println("6 - Pagar em dinheiro");
            System.out.println("7 - Transferir (Desafio)");
            System.out.println("0 - Sair");
            
            // Pede para o usuário escolher um número do menu.
            System.out.print("Escolha uma opção: ");

            // Lê o número que o usuário escolheu e guarda na variável 'opcao'.
            int opcao = scanner.nextInt();
            
            // Limpa o buffer do teclado novamente após ler o número da opção.
            scanner.nextLine(); 

            // Inicia a estrutura de decisão. Vai testar o valor guardado na variável 'opcao'.
            switch (opcao) {
                
                // Se a opção digitada for 1, entra neste bloco.
                case 1:
                    // Chama o método que imprime todos os dados da conta cadastrada.
                    conta.mostrarDadosConta();
                    // Interrompe o 'switch', voltando para o início do loop (menu).
                    break;

                // Se a opção digitada for 2, entra neste bloco.
                case 2:
                    // Chama o método que imprime apenas o saldo atual da conta.
                    conta.consultarSaldo();
                    // Interrompe o 'switch' e volta para o menu.
                    break;

                // Se a opção digitada for 3 (Depósito).
                case 3:
                    // Pede para o usuário digitar o valor que deseja depositar.
                    System.out.print("Digite o valor do depósito: R$ ");
                    // Lê o valor digitado e guarda na variável 'valorDep'.
                    double valorDep = scanner.nextDouble();
                    // Envia esse valor para o método 'depositar' dentro do objeto 'conta', para somar ao saldo.
                    conta.depositar(valorDep);
                    // Interrompe o 'switch' e volta para o menu.
                    break;

                // Se a opção digitada for 4 (PIX).
                case 4:
                    // Pede para o usuário digitar o valor do pagamento.
                    System.out.print("Valor do pagamento PIX: R$ ");
                    // Lê o valor e guarda na variável 'valorPix'.
                    double valorPix = scanner.nextDouble();
                    // Limpa o buffer porque a próxima leitura será um texto (String).
                    scanner.nextLine(); 
                    // Pede a chave PIX.
                    System.out.print("Chave PIX: ");
                    // Lê o texto da chave e guarda na variável 'chave'.
                    String chave = scanner.nextLine();
                    // Chama o método 'pagar' passando DOIS parâmetros (valor e texto). O Java sabe que é o método do PIX.
                    conta.pagar(valorPix, chave); 
                    // Interrompe o 'switch' e volta para o menu.
                    break;

                // Se a opção digitada for 5 (Cartão).
                case 5:
                    // Pede para o usuário digitar o valor da compra.
                    System.out.print("Valor da compra no Cartão: R$ ");
                    // Lê o valor e guarda na variável 'valorCartao'.
                    double valorCartao = scanner.nextDouble();
                    // Pede em quantas vezes o usuário quer parcelar.
                    System.out.print("Quantidade de parcelas: ");
                    // Lê o número inteiro e guarda na variável 'parcelas'.
                    int parcelas = scanner.nextInt();
                    // Chama o método 'pagar' passando DOIS parâmetros numéricos (double e int). O Java sabe que é o método do Cartão.
                    conta.pagar(valorCartao, parcelas);
                    // Interrompe o 'switch' e volta para o menu.
                    break;

                // Se a opção digitada for 6 (Dinheiro).
                case 6:
                    // Pede o valor do pagamento.
                    System.out.print("Valor do pagamento em Dinheiro: R$ ");
                    // Lê o valor e guarda na variável 'valorDinheiro'.
                    double valorDinheiro = scanner.nextDouble();
                    // Chama o método 'pagar' passando apenas UM parâmetro (double). O Java sabe que é o método do Dinheiro.
                    conta.pagar(valorDinheiro);
                    // Interrompe o 'switch' e volta para o menu.
                    break;

                // Se a opção digitada for 7 (Transferência).
                case 7:
                    // Pede o número da conta que vai receber o dinheiro.
                    System.out.print("Número da conta de destino: ");
                    // Lê o número e guarda na variável 'contaDestino'.
                    int contaDestino = scanner.nextInt();
                    // Pede o valor a ser transferido.
                    System.out.print("Valor da transferência: R$ ");
                    // Lê o valor e guarda na variável 'valorTransf'.
                    double valorTransf = scanner.nextDouble();
                    // Envia os dois dados (conta destino e valor) para o método 'transferir'.
                    conta.transferir(contaDestino, valorTransf);
                    // Interrompe o 'switch' e volta para o menu.
                    break;

                // Se a opção digitada for 0 (Sair).
                case 0:
                    // Imprime mensagem de despedida.
                    System.out.println("Encerrando o sistema...");
                    // Fecha o 'scanner', liberando a memória que estava sendo usada para ler o teclado.
                    scanner.close();
                    // Encerra o método 'main' imediatamente. Como o 'main' acaba, o programa inteiro fecha.
                    return; 

                // Se o usuário digitar qualquer número diferente de 0 a 7, cai aqui.
                default:
                    // Avisa que a opção não existe.
                    System.out.println("Opção inválida! Tente novamente.");
            } // Fim do bloco switch
        } // Fim do bloco while (se não foi a opção 0, ele volta lá pra linha 62 e mostra o menu de novo)
    } // Fim do método main
} // Fim da classe Principal