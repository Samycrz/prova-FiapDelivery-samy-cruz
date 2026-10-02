package br.com.fiapdelivery.model;

public class Caminhao extends Veiculo {
    private int quantidadeDeEixos;

    public Caminhao(String placa, double capacidadeCarga, int quantidadeDeEixos) {
        super(placa, capacidadeCarga);
        this.setQuantidadeDeEixos(quantidadeDeEixos);
    }

    public int getQuantidadeDeEixos() {
        return quantidadeDeEixos;
    }

    public void setQuantidadeDeEixos(int quantidadeDeEixos) {
        this.quantidadeDeEixos = quantidadeDeEixos;
    }
}
