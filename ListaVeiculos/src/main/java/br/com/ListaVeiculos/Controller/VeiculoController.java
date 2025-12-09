package br.com.ListaVeiculos.Controller;

import br.com.ListaVeiculos.Entity.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class VeiculoController {
    List<Veiculo> veiculoList = new ArrayList<Veiculo>();

    public void adicionarVeiculo(String placa, String marca, String modelo, int anoLancamento){

        if (placaExiste(placa)) {
            System.out.println("Erro: já existe um veículo com essa placa cadastrada.");
            return;
        }

        Veiculo veiculo = new Veiculo(placa, marca, modelo, anoLancamento);
        veiculoList.add(veiculo);
    }

    public void exibirVeiculo(){
        long i = 1;
        System.out.println("\n==========VEÍCULOS==========");
        for (Veiculo veiculo : veiculoList) {
            System.out.println("Veículo " + i + ": Placa: " + veiculo.getPlaca() + " Marca: "+ veiculo.getMarca() + " Modelo: " + veiculo.getModelo() + " Ano de Lançamento: " + veiculo.getAnoLançamento());
            i++;
        }
        System.out.println();
    }

    public boolean placaExiste(String placa) {
        for (Veiculo veiculo : veiculoList) {
            if (veiculo.getPlaca().equalsIgnoreCase(placa)) {
                return true;
            }
        }
        return false;
    }

}
