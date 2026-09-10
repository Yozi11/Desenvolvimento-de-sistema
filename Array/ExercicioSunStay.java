import java.util.Scanner;

public class ExercicioSunStay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxQuartos = 0;
        while (maxQuartos <=0 || maxQuartos > 5){
            System.out.println("digite a quantiade de quartos disponiveis (maximo 5) : ");
            maxQuartos = sc.nextInt();
            if(maxQuartos <=0 || maxQuartos > 5){
                System.out.println("quantidade invalida o hotel pode possuir no maximo 5 quartos");
            }
        }

        int [] numerosQuartos = new int [maxQuartos];
        int [] camasQuartos =  new int[maxQuartos];
        boolean dadosQuartosRegistrados = false;
        boolean camasRegistradas = false;



        int maxReservas = 25;
        int [] reservaQuartoNum = new int[maxReservas];
        String [] reserverHospedeNome = new String[maxReservas];
        int totalReservasRealizadas = 0;

        int opcao = 0;


        do{
            System.out.println("------Menu-----");
            System.out.println("1-Registrar numero de quartos");
            System.out.println("2-Registrar quantidade de camas");
            System.out.println("3-Reserva quartos");
            System.out.println("4-consultar reservas por quarto");
            System.out.println("5-consultar reservas por hospedes");
            System.out.println("6-Encerrar");
            System.out.print("Escolha uma opção");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("---Registro  de quartos ---");
                    for (int i = 0; i <maxQuartos; i++){
                        System.out.print("informe o numero do "+(i+1)+"º quartos: ");
                        numerosQuartos[i] = sc.nextInt();
                    }
                    dadosQuartosRegistrados = true;
                    System.out.println("quartos registrados com sucesso");
                    break;
                case 2:
                    if(!dadosQuartosRegistrados){
                        System.out.println("\nAviso registre os numeros dos quartos");
                        break;
                    }
                    System.out.println("\n----Resgistro de camas---");
                    for(int i = 0; i < maxQuartos; i++ ){
                        System.out.print("quantidade de camas para o quartos" + numerosQuartos[i]+": ");
                        camasQuartos[i] = sc.nextInt();
                    }
                    camasRegistradas = true;
                    System.out.println("quantidade de camas registradas com sucesso!");
                    
                    break;
                case 3:
                    if (!camasRegistradas){
                        System.out.println("\nAviso: Registre as camas antes de fazaer  reservas!");
                        break;
                    }
                    if  (totalReservasRealizadas >= maxReservas){
                        System.out.println("\nLimite maximo de 25 reservas antingido para o sistema!");
                        break;
                    }
                    System.out.print("\ndigite o numeroo do quarto para reserva");
                    int quartoDesejado =  sc.nextInt();
                    sc.nextLine();


                    int indiceQuarto = -1;
                    for(int i = 0; i < maxQuartos; i++){
                        if (numerosQuartos[i] == quartoDesejado){
                            indiceQuarto = i;
                            break;
                        }
                    }

                    if(indiceQuarto == -1){
                        System.out.println("este quarto nao existe!");

                    }else if (camasQuartos[indiceQuarto] <= 0){
                        System.out.println("nao ha camas  disponiveis neste quarto!");

                    }else{
                        System.out.print("digite o nome do hospede: ");
                        String nomehospede = sc.nextLine();


                        reservaQuartoNum[totalReservasRealizadas] = quartoDesejado;
                        reserverHospedeNome [totalReservasRealizadas] = nomehospede;
                        totalReservasRealizadas++;

                        camasQuartos[indiceQuarto]--;
                        System.out.println("reservas realizada com sucesso!");

                    }
                    
                    break;
                case 4:
                    if (!dadosQuartosRegistrados){
                        System.out.println("\nNenhum quarto cadastrado");
                        break;
                    }
                    System.out.print("\nDigite o numero do quarto  para consulta: ");
                    int quartoConsulta = sc.nextInt();


                    boolean quartoExiste = false;
                    for (int q : numerosQuartos){
                        if (q== quartoConsulta){
                            quartoExiste=true;
                            break;
                        }
                    }
                    if (!quartoExiste){
                        System.out.println("este quarto nao existe!");
                    }else{
                        boolean encontrouReservaQuarto = false;
                        System.out.println("Hospedes no quarto"+quartoConsulta+":");
                        for (int i = 0; i < totalReservasRealizadas; i++){
                            if (reservaQuartoNum[i] == quartoConsulta){
                                System.out.println("-" +reserverHospedeNome[i]);
                                encontrouReservaQuarto = true;
                            }
                        }
                        if (!encontrouReservaQuarto){
                            System.out.println("nao ha reserva para este quarto!");
                        }
                    }
                    
                    break;
                case 5:
                    System.out.print("\nDigite o nome do hospede para  consulta: ");
                    String hospedeconsulta = sc.nextLine();
                    boolean encontrouReservaHospede = false;
                    
                    System.out.println("reserversa encontrada para o hospede" +hospedeconsulta +":");
                    for (int i = 0; i < totalReservasRealizadas; i++){
                        if(reserverHospedeNome[i].equalsIgnoreCase(hospedeconsulta)){
                            System.out.println("-Quarto"+reservaQuartoNum[i]);
                            encontrouReservaHospede =true;
                        }
                    }
                    if (!encontrouReservaHospede){
                        System.out.println("nao ha reseversas para este hospede");

                    }
                    
                    break;
                case 6:
                    System.out.println("\nEncerrando o sistema ");
                    
                    break;
            
                default:
                    System.out.println("\nopcao invalida escolha um numero 1 a 6 ");
                    break;
            }
        }while (opcao != 6); 
            
        sc.close();
    }

    
}
