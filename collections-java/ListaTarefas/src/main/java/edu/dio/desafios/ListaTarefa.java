package edu.dio.desafios;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> lista;

    public ListaTarefa() {
        this.lista = new ArrayList<>(); // criando arraylist vazio
    }

    public void adicionarTarefa(String descricao){
        lista.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : lista){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }

        lista.removeAll(tarefasParaRemover);
    }

    public Integer obterNumeroTotalTarefas(){

        return lista.size();
    }

    public void obterDescricoesTarefas(){

        System.out.println(lista);
    }

    @Override
    public String toString() {
        return "ListaTarefa{" +
                "lista=" + lista +
                '}';
    }
}
