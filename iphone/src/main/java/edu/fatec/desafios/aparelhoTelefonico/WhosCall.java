package edu.fatec.desafios.aparelhoTelefonico;

public class WhosCall implements AparelhoTelefonico{
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero + " pelo WhosCall");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo pelo WhosCall");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz pelo WhosCall");

    }
}
