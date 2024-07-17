package edu.dio.desafios.carrinho;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    public List<Item> carrinho;

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(Item item){
        carrinho.add(item);
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        for(Item i : carrinho){
            if(i.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            }
        }
        carrinho.removeAll(itensParaRemover);
    }

    public Double calcularValorTotal(){
        Double valorTotal = 0.0;
        for(Item i: carrinho){
            valorTotal += (i.getPreco() * i.getQuantidade());
        }
        return valorTotal;
    }

    public List exibirItens(){
        return carrinho;
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();


    }

}
