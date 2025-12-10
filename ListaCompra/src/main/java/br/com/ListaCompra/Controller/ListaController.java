package br.com.ListaCompra.Controller;

import br.com.ListaCompra.Entity.Lista;

import java.util.ArrayList;
import java.util.List;

public class ListaController {
    List<Lista> lista = new ArrayList<>();
    private double totalLista = 0;

    public void adicionarLista(double limite, String descricao, double preco) {
        totalLista+=preco;

        if(totalLista > limite){
            System.out.println("\nLimite de Compra atingido ou ultrapassado!!");
            totalLista-=preco;
        } else{
            Lista listaInfo = new Lista(limite, descricao, preco);
            lista.add(listaInfo);
        }
    }

    public void exibirLista(){
        double total = 0;
        System.out.println("\n=============LISTA DE COMPRA=============");
        for(Lista listaInfo : lista){
            System.out.println("Descrição: "+listaInfo.getDescricao() + " | Preço: "+listaInfo.getPreco());
            total+=listaInfo.getPreco();
        }
        System.out.println("Valor total de compra: "+total);
    }
}
