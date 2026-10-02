package br.com.fiapdelivery.model;

public class Rota {
    private Pacote pacoteParaEnvio;
    private Veiculo veiculoDeEnvio;

    public Pacote getPacoteParaEnvio() {
        return pacoteParaEnvio;
    }

    public void setPacoteParaEnvio(Pacote pacoteParaEnvio) {
        this.pacoteParaEnvio = pacoteParaEnvio;
    }

    public Veiculo getVeiculoDeEnvio() {
        return veiculoDeEnvio;
    }

    public void setVeiculoDeEnvio(Veiculo veiculoDeEnvio) {
        this.veiculoDeEnvio = veiculoDeEnvio;
    }

    public void comecarEnvio(){
        this.pacoteParaEnvio.atualizarStatus("Em trânsito");
        System.out.println("O pacote " + this.getPacoteParaEnvio() + " está a caminho, a placa do veículo é " + this.getVeiculoDeEnvio());

    }
}
