package edu.fatec.desafios.reprodutorMusical;

public class VlcPlayer implements ReprodutorMusical{
    @Override
    public void tocar() {
        System.out.println("Tocando musica no VLC Player");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica no VLC Player");

    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando musica: " + musica + " no VLC Player");

    }
}
