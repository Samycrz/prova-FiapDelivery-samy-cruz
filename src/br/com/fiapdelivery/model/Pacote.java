package br.com.fiapdelivery.model;

public class Pacote {
    private String codigo;
    private double peso;
    private String status;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void atualizarStatus(String novoStatus){
        this.status = novoStatus;
    }

    @Override
    public String toString() {
        return this.codigo;
    }
}
