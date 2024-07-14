package edu.fatec.desafios.reprodutorMusical;

public class MusicPlayer implements ReprodutorMusical{
    @Override
    public void tocar() {
        System.out.println("Tocando musica no Music Player");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica no Music Player");

    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando musica: " + musica + " no Music Player");

    }
}
