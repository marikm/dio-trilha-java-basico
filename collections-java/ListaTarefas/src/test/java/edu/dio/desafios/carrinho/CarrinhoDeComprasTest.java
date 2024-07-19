package edu.dio.desafios.carrinho;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
class CarrinhoDeComprasTest {

    Item livro = new Item("livro", 7.00, 1);
    Item cafe =  new Item("cafe", 5.00, 1);
    Item arroz = new Item("arroz", 5.00, 2);
    CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

    @Test
    void calcularValorTotal(){
        carrinho.adicionarItem(livro);
        carrinho.adicionarItem(cafe);
        assertEquals(12.00 , carrinho.calcularValorTotal());
        carrinho.adicionarItem(arroz);
        assertEquals(22, carrinho.calcularValorTotal());
    }

    @Test
    void exibirItens(){
        carrinho.adicionarItem(livro);
        carrinho.adicionarItem(cafe);
        ArrayList<Item> listaTeste = new ArrayList<>();
        listaTeste.add(livro);
        listaTeste.add(cafe);
        System.out.println(carrinho.exibirItens());
        assertEquals(listaTeste, carrinho.exibirItens());

    }

}