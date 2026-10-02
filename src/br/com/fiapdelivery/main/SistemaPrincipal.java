package br.com.fiapdelivery.main;

import br.com.fiapdelivery.model.Caminhao;
import br.com.fiapdelivery.model.Moto;
import br.com.fiapdelivery.model.Pacote;
import br.com.fiapdelivery.model.Rota;

public class SistemaPrincipal {
    public static void main(String[] args) {
        // Instanciando com construtor
        Caminhao caminhao1 = new Caminhao("ABCD1234", 5000.0, 3);
        Pacote pacote1 = new Pacote("BR12345", 0.5);
        Rota rotaCaminhao = new Rota(pacote1, caminhao1);
        rotaCaminhao.comecarEnvio();
        System.out.println("Status: " + pacote1.getStatus());

        Moto moto1 = new Moto("ZYXW9854", 35, true);
        Pacote pacote2 = new Pacote("BR9876", 0.5);
        pacote2.getStatus();
        Rota rotaMoto = new Rota(pacote2, moto1);
        rotaMoto.comecarEnvio();
        System.out.println("Status: " + pacote2.getStatus());


    }
}
