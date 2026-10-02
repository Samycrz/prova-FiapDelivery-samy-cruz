package br.com.fiapdelivery.main;

import br.com.fiapdelivery.model.Caminhao;
import br.com.fiapdelivery.model.Moto;
import br.com.fiapdelivery.model.Pacote;
import br.com.fiapdelivery.model.Rota;

public class SistemaPrincipal {
    public static void main(String[] args) {
        Caminhao caminhao1 = new Caminhao();

        caminhao1.setPlaca("ABCD1234");
        caminhao1.setEixos(3);
        caminhao1.setCapacidadeDeCarga(5000.0);

        Pacote pacote1 = new Pacote();
        pacote1.setCodigo("BR12345");
        pacote1.setPeso(0.5);

        Rota rotaCaminhao = new Rota();
        rotaCaminhao.setPacoteParaEnvio(pacote1);
        rotaCaminhao.setVeiculoDeEnvio(caminhao1);

        rotaCaminhao.comecarEnvio();
        System.out.println("Status: " + pacote1.getStatus());

        // Entrega com moto
        Moto moto1 = new Moto();
        moto1.setPlaca("ZYXEW9876");
        moto1.setCapacidadeDeCarga(30.0);
        moto1.setTemBau(true);

        Pacote pacote2 = new Pacote();
        pacote2.setCodigo("BR9876");
        pacote2.setPeso(0.5);
        pacote2.getStatus();

        Rota rotaMoto = new Rota();
        rotaMoto.setPacoteParaEnvio(pacote2);
        rotaMoto.setVeiculoDeEnvio(moto1);

        rotaMoto.comecarEnvio();
        System.out.println("Status: " + pacote2.getStatus());


    }
}
