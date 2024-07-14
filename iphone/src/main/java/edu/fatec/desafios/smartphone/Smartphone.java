package edu.fatec.desafios.smartphone;

import edu.fatec.desafios.aparelhoTelefonico.AparelhoTelefonico;
import edu.fatec.desafios.navegador.NavegadorInternet;
import edu.fatec.desafios.reprodutorMusical.ReprodutorMusical;

public class Smartphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {


    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + " pelo smartphone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo pelo smartphone");

    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz pelo smartphone");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina do url: " + url+ " pelo smartphone");

    }

    @Override
    public void adicionarAba() {
        System.out.println("Adicionando aba pelo smartphone");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar pagina pelo smartphone");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando smartphone");

    }

    @Override
    public void pausar() {
        System.out.println("Pausando smartphone");

    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a musica : " + musica + " pelo smartphone");

    }
}
