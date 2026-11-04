package br.com.example.view;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.text.html.StyleSheet;

import br.com.example.controle.EletrodomesticoControle;
import br.com.example.modelo.Eletrodomestico;

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

        System.out.println("nome: ");
        String nome = sc.nextLine();
        System.out.println("marca");
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
                Sys
            }
        }
     }

    
}
