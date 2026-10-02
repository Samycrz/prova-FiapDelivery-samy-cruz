package br.com.fiapdelivery.model;

public class Caminhao extends Veiculo {
    private int eixos;

    public Caminhao(String placa, double capacidadeDeCarga) {
        super(placa, capacidadeDeCarga);
    }

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }


}
