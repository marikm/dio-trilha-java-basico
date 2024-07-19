package edu.dio.desafios.pesquisa;

public class Livro {
    private final String titulo;
    private final String autor;
    private final Integer anoPublicacao;

    public Livro(String titulo, String autor, Integer anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }
}
