package br.com.fiapdelivery.model;

public class Moto extends Veiculo {
    private boolean temBau;

    public Moto(String placa, double capacidadeDeCarga) {
        super(placa, capacidadeDeCarga);
    }

    public boolean isTemBau() {
        return temBau;
    }

    public void setTemBau(boolean temBau) {
        this.temBau = temBau;
    }
}
