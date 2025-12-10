package br.com.ListaCompra;

import br.com.ListaCompra.Controller.ListaController;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaController listaController =  new ListaController();

        System.out.print("Digite o valor limete das compras: ");
        double limite = sc.nextDouble();

        while (true) {

            sc.nextLine();
            System.out.print("Digite a compra: ");
            String descricao = sc.nextLine();
            System.out.print("Digite o valor: ");
            double preco = sc.nextDouble();

            listaController.adicionarLista(limite, descricao, preco);

            System.out.println("\nDeseja sair?\n1- Sim\n2- Não");
            int opc  = sc.nextInt();

            if (opc == 1) {
                listaController.exibirLista();
                break;
            }
        }
    }
}