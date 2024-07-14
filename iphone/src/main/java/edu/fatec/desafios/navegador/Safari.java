package edu.fatec.desafios.navegador;

public class Safari implements NavegadorInternet{

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo pagina pelo safari: " + url);
    }

    @Override
    public void adicionarAba() {
        System.out.println("Adicionando aba do Safari");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina do Safari");
    }
}
