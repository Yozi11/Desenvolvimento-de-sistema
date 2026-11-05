package br.com.example.view;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.html.StyleSheet;

import br.com.example.controle.EletrodomesticoControle;
import br.com.example.modelo.Eletrodomestico;

@SuppressWarnings("unused")
public class Eletrodomesticoview {
    private Scanner sc = new Scanner(System.in);

    private EletrodomesticoControle controle = new EletrodomesticoControle();
     private int opcao;

     public void menu(){
        do{
            System.out.println("\n=======Sistema de Eletrodomestico=====");
            System.out.println("1-Cadastrar");
            System.out.println("2-listar");
            System.out.println("3-buscar");
            System.out.println("4-alterar");
            System.out.println("5-remover");
            System.out.println("0- sair");
            System.out.println("Escolha a opção");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:cadastrar();break;
                case 2:listar();break;
                case 3:buscar();break;
                case 4:alterar();break;
                case 5:remover();break;
                case 0:System.out.println("Sistema encerrado");break;
                default:System.out.println("opcao ivalida");

                    
                    
            
            }
        }while (opcao!=0);
        sc.close(); 
            
        
     }
     private void cadastrar(){
        System.out.println("\n--Cadastrar");
        System.out.println("\n-id: ");
        int id = sc.nextInt();
        sc.nextLine();
        
        System.out.println("\n--nome: ");
        String nome = sc.nextLine();
        System.out.println("\n-marca: ");
        String marca = sc.nextLine();
        System.out.println("voltagem: ");
        String voltagem = sc.nextLine();
        System.out.println("preço");
        double preco = sc.nextDouble();

        if (controle.cadastrar(id, nome, marca, voltagem, preco)) {
            System.out.println("Produto cadastrado com sucesso");
            
        }else{
            System.out.println("nao foi possivel cadastrar");
        }
     }
     
     private void listar(){
        System.out.println("\n---Eletrodomesticos--");
        ArrayList<Eletrodomestico>eletrodomesticos = controle.listar();
        if (eletrodomesticos.isEmpty()) {
            System.out.println("nenhum produto cadastrado");
            
        }else{
            for(Eletrodomestico eletrodomestico:eletrodomesticos){
                System.out.println("id: "+eletrodomestico.getId());
                System.out.println("Nome: "+eletrodomestico.getNome());
                System.out.println("Marca: "+eletrodomestico.getMarca());
                System.out.println("Voltagem: "+eletrodomestico.getVoltagem());
                System.out.println("preco: "+eletrodomestico.getPreco());
                System.out.println("--------------------------------------");
            }
        }
     }
     private void buscar(){
        System.out.println("digite o id");
        int id = sc.nextInt();
        Eletrodomestico eletrodomestico = controle.buscar(id);


        if (eletrodomestico !=null) {
            System.out.println("Id: "+eletrodomestico.getId());
            System.out.println("Nome: "+eletrodomestico.getNome());
            System.out.println("Marca: "+eletrodomestico.getMarca());
            System.out.println("Voltagem: "+eletrodomestico.getVoltagem());
            System.out.println("preco: "+eletrodomestico.getPreco());
            
        }else{
            System.out.println("Produto nao encontrado");
        }
     }
     private void alterar(){
        System.out.println("id do eletrodomestico");
        int id =  sc.nextInt();
        sc.nextLine();

        Eletrodomestico eletrodomestico = controle.buscar(id);

        if (eletrodomestico==null) {
            System.out.println("eletrodomestico nao encontrado ");
            return ;
            
        }
        System.out.println("Novo nome:  ");
        String nome = sc.nextLine();
        System.out.println("Nova Marca");
        String marca = sc.nextLine();
        System.out.println("voltagem: ");
        String voltagem = sc.nextLine();
        System.out.println("novo preço");
        double preco = sc.nextDouble();

        if (controle.alterar(id, nome, marca, voltagem, preco)) {
            System.out.println("Eletrodomestico alterado");
        }else{
            System.out.println("nao foi possivel alterar");
        }

        
     }
     private  void remover(){
        System.out.println("id do eletrodomestico ");
        int id = sc.nextInt();

        if (controle.remover(id)) {
            System.out.println("Eletrodomestico removido");
            
        }else{
            System.out.println("produto nao encontrado ");
     }

    }  


    
}
