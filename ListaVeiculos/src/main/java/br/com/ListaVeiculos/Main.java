package br.com.ListaVeiculos;

import br.com.ListaVeiculos.Controller.VeiculoController;
import br.com.ListaVeiculos.Entity.Veiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VeiculoController veiculoController = new VeiculoController();

        while(true){
            System.out.println("\n1- Adicionar Veículo\n2- Exibir Veículos\n3- Sair");
            int opc = sc.nextInt();

            if (opc == 1) {
                sc.nextLine();

                System.out.print("Placa: ");
                String placa = sc.nextLine().toUpperCase();

                // Validação da placa Mercosul
                String regexMercosul = "^[A-Z]{3}[0-9][A-Z][0-9]{2}$";

                if (!placa.matches(regexMercosul)) {
                    System.out.println("Placa inválida! Formato esperado: LLLNLNN (ex: ABC1D23)");
                    continue;
                }

                System.out.print("Marca: ");
                String marca = sc.nextLine();
                System.out.print("Modelo: ");
                String modelo = sc.nextLine();
                System.out.print("Ano Lancamento: ");
                int anoLancamento = sc.nextInt();

                veiculoController.adicionarVeiculo(placa, marca, modelo, anoLancamento);
            } else if(opc == 2){
                veiculoController.exibirVeiculo();
            } else{
                break;
            }
        }

    }
}