import java.util.Scanner;

public class GerenciadorNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] numeros = new int[5]; // Array fixo
        int total = 0;              // A variável mais importante!
        int opcao = 0;
        
        do {
            System.out.println("\n1-Inserir | 2-Listar | 3-Remover | 4-Sair");
            opcao = sc.nextInt();
            
            switch(opcao) {
                case 1: // INSERIR
                    if (total == numeros.length) {
                        System.out.println("Erro: Array cheio!");
                    } else {
                        System.out.print("Digite o número: ");
                        numeros[total] = sc.nextInt(); // Insere na primeira posição livre
                        total++;                       // Aumenta a quantidade
                        System.out.println("Inserido com sucesso!");
                    }
                    break;
                    
                case 2: // LISTAR
                    if (total == 0) {
                        System.out.println("Nenhum número cadastrado.");
                    } else {
                        for (int i = 0; i < total; i++) {
                            System.out.println("Índice " + i + ": " + numeros[i]);
                        }
                    }
                    break;
                    
                case 3: // REMOVER
                    if (total == 0) {
                        System.out.println("Erro: Array vazio.");
                        break;
                    }
                    
                    System.out.print("Digite o índice para remover: ");
                    int indice = sc.nextInt();
                    
                    // Valida se o índice existe na nossa lista atual
                    if (indice < 0 || indice >= total) {
                        System.out.println("Erro: Índice inválido!");
                    } else {
                        // Lógica de deslocamento (puxar para a esquerda)
                        for (int i = indice; i < total - 1; i++) {
                            numeros[i] = numeros[i + 1];
                        }
                        total--; // Diminui a quantidade total de itens
                        System.out.println("Removido com sucesso!");
                    }
                    break;
                    
                case 4: // SAIR
                    System.out.println("Saindo...");
                    break;
            }
        } while (opcao != 4);
        
        sc.close();
    }
}