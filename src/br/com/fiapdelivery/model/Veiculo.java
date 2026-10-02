package br.com.fiapdelivery.model;

public class Veiculo {
    private String placa;
    private double capacidadeDeCarga;

    public double getCapacidadeDeCarga() {
        return capacidadeDeCarga;
    }

    public void setCapacidadeDeCarga(double capacidadeDeCarga) {
        if(capacidadeDeCarga > 0){
            this.capacidadeDeCarga = capacidadeDeCarga;
        } else{
            this.capacidadeDeCarga = 0;
            System.out.println("É necessário ter capacidade de carga para fazer entregas");
        }
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return this.placa;
    }
}

