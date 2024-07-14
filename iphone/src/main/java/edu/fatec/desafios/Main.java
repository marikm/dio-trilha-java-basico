package edu.fatec.desafios;

import edu.fatec.desafios.aparelhoTelefonico.AparelhoTelefonico;
import edu.fatec.desafios.aparelhoTelefonico.CallApp;
import edu.fatec.desafios.navegador.NavegadorInternet;
import edu.fatec.desafios.navegador.Safari;
import edu.fatec.desafios.reprodutorMusical.ReprodutorMusical;
import edu.fatec.desafios.smartphone.Smartphone;

public class Main {
    public static void main(String[] args) {

        Smartphone iphone = new Smartphone();

        iphone.atender();

        AparelhoTelefonico appLigar = iphone;
        NavegadorInternet navegador = iphone;
        ReprodutorMusical player = iphone;

        appLigar.ligar("123");
        navegador.exibirPagina("abc.com");
        player.pausar();

        Safari nav = new Safari();
        NavegadorInternet navegadorGenerico = nav;
        navegadorGenerico.adicionarAba();
    }
}