package edu.fatec.desafios.aparelhoTelefonico;

public class CallApp implements AparelhoTelefonico{


    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero + " pelo CallApp");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo pelo CallApp");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz pelo CallApp");

    }
}
