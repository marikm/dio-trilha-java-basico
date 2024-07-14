package edu.fatec.desafios.navegador;

public class Firefox implements NavegadorInternet{
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina pelo firefox: " + url);
    }

    @Override
    public void adicionarAba() {
        System.out.println("Adicionando aba do firefox");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina do firefox");
    }
}
