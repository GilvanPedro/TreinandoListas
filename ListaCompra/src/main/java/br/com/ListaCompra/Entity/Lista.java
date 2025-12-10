package br.com.ListaCompra.Entity;

public class Lista {
    private double preco;
    private String descricao;
    private double limite;

    public Lista(double limite, String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
        this.limite = limite;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
