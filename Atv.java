import java.util.Scanner;

public class Atv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        int maxQuartos = 5;
        int maxReservas = 25;

       
        int totalQuartos = 0;
        int[] numerosQuartos = new int[maxQuartos];
        int[] camasDisponiveis = new int[maxQuartos];


        int totalReservas = 0;
        int[] reservaQuarto = new int[maxReservas];
        String[] reservaHospede = new String[maxReservas];

      
        while (true) {
            System.out.print("Informe a quantidade de quartos disponíveis no hotel (máximo 5): ");
            totalQuartos = scanner.nextInt();
            scanner.nextLine(); 

            if (totalQuartos > 0 && totalQuartos <= maxQuartos) {
                break;
            }
            System.out.println("Quantidade inválida! O hotel pode ter no máximo 5 quartos.");
        }

        boolean dadosQuartosCadastrados = false;
        boolean dadosCamasCadastrados = false;
        int opcao = 0;

        
        do {
            System.out.println("\n=== REDE DE HOTÉIS SUNSTAY ===");
            System.out.println("1 - Registrar número dos quartos");
            System.out.println("2 - Registrar quantidade de camas");
            System.out.println("3 - Reservar quarto");
            System.out.println("4 - Consultar reservas por quarto");
            System.out.println("5 - Consultar reservas por hóspede");
            System.out.println("6 - Encerrar sistema");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.println("\n--- REGISTRO DE NÚMERO DOS QUARTOS ---");
                    for (int i = 0; i < totalQuartos; i++) {
                        System.out.print("Informe o número do quarto " + (i + 1) + ": ");
                        numerosQuartos[i] = scanner.nextInt();
                    }
                    scanner.nextLine();
                    dadosQuartosCadastrados = true;
                    System.out.println("Números dos quartos registrados com sucesso!");
                    break;

                case 2:
                    if (!dadosQuartosCadastrados) {
                        System.out.println("Por favor, registre os números dos quartos primeiro (Opção 1).");
                        break;
                    }
                    System.out.println("\n--- REGISTRO DE CAMAS ---");
                    for (int i = 0; i < totalQuartos; i++) {
                        System.out.print("Informe a quantidade de camas no Quarto " + numerosQuartos[i] + ": ");
                        camasDisponiveis[i] = scanner.nextInt();
                    }
                    scanner.nextLine();
                    dadosCamasCadastrados = true;
                    System.out.println("Quantidade de camas registrada com sucesso!");
                    break;

                case 3:
                    if (!dadosQuartosCadastrados || !dadosCamasCadastrados) {
                        System.out.println("Cadastre os quartos (Opção 1) e camas (Opção 2) antes de fazer reservas.");
                        break;
                    }

                    if (totalReservas >= maxReservas) {
                        System.out.println("Limite global de 25 reservas atingido!");
                        break;
                    }

                    System.out.println("\n--- RESERVAR QUARTO ---");
                    System.out.print("Informe o número do quarto: ");
                    int numQuartoReserva = scanner.nextInt();
                    scanner.nextLine();

                    int indiceQuarto = -1;
                    for (int i = 0; i < totalQuartos; i++) {
                        if (numerosQuartos[i] == numQuartoReserva) {
                            indiceQuarto = i;
                            break;
                        }
                    }

                    if (indiceQuarto == -1) {
                        System.out.println("Este quarto não existe!");
                    } else if (camasDisponiveis[indiceQuarto] <= 0) {
                        System.out.println("Não há camas disponíveis neste quarto!");
                    } else {
                        System.out.print("Solicitar o nome do hóspede: ");
                        String nomeHospede = scanner.nextLine();

                       
                        reservaQuarto[totalReservas] = numQuartoReserva;
                        reservaHospede[totalReservas] = nomeHospede;
                        totalReservas++;

                        
                        camasDisponiveis[indiceQuarto]--;

                        System.out.println("Reserva realizada com sucesso!");
                    }
                    break;

                case 4:
                    if (!dadosQuartosCadastrados) {
                        System.out.println("Nenhum quarto cadastrado ainda.");
                        break;
                    }

                    System.out.println("\n--- CONSULTAR RESERVAS POR QUARTO ---");
                    System.out.print("Informe o número do quarto: ");
                    int numQuartoConsulta = scanner.nextInt();
                    scanner.nextLine();

                    boolean quartoExiste = false;
                    for (int i = 0; i < totalQuartos; i++) {
                        if (numerosQuartos[i] == numQuartoConsulta) {
                            quartoExiste = true;
                            break;
                        }
                    }

                    if (!quartoExiste) {
                        System.out.println("Este quarto não existe!");
                    } else {
                        boolean encontrouReserva = false;
                        System.out.println("Hóspedes com reserva no Quarto " + numQuartoConsulta + ":");
                        for (int i = 0; i < totalReservas; i++) {
                            if (reservaQuarto[i] == numQuartoConsulta) {
                                System.out.println("- " + reservaHospede[i]);
                                encontrouReserva = true;
                            }
                        }
                        if (!encontrouReserva) {
                            System.out.println("Não há reservas para este quarto!");
                        }
                    }
                    break;

                case 5:
                    System.out.println("\n--- CONSULTAR RESERVAS POR HÓSPEDE ---");
                    System.out.print("Informe o nome do hóspede: ");
                    String nomeConsulta = scanner.nextLine();

                    boolean encontrouHospede = false;
                    for (int i = 0; i < totalReservas; i++) {
                        if (reservaHospede[i].equalsIgnoreCase(nomeConsulta)) {
                            System.out.println("Reserva encontrada -> Quarto " + reservaQuarto[i]);
                            encontrouHospede = true;
                        }
                    }

                    if (!encontrouHospede) {
                        System.out.println("Não há reservas para este hóspede!");
                    }
                    break;

                case 6:
                    System.out.println("\nEncerrando o sistema... Obrigado por utilizar o SunStay!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }

        } while (opcao != 6);

        scanner.close();
    } 
} 