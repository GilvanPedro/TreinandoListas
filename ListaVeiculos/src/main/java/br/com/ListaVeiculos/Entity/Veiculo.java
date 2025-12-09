package br.com.ListaVeiculos.Entity;

public class Veiculo {
    private String placa;
    private String marca;
    private String modelo;
    private int anoLançamento;

    public Veiculo(String placa, String marca, String modelo, int anoLançamento) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anoLançamento = anoLançamento;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoLançamento() {
        return anoLançamento;
    }

    public void setAnoLançamento(int anoLançamento) {
        this.anoLançamento = anoLançamento;
    }

    @Override
    public String toString() {
        return "Veiculo: " + "placa='" + placa + '\'' + ", marca='" + marca + '\'' + ", modelo='" + modelo + '\'' + ", anoLançamento=" + anoLançamento;
    }
}
