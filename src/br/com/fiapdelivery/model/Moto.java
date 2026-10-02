package br.com.fiapdelivery.model;

public class Moto extends Veiculo {
    private boolean temBau;

    public Moto(String placa, double capacidadeDeCarga, boolean temBau) {
        super(placa, capacidadeDeCarga);
        this.setTemBau(temBau);
    }

    public boolean isTemBau() {
        return temBau;
    }

    public void setTemBau(boolean temBau) {
        this.temBau = temBau;
    }
}
