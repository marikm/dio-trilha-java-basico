package edu.fatec.banco;

import edu.fatec.banco.financeiro.ContaTerminal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        System.out.println("Por favor, digite o número da conta: ");
        Integer numero = Integer.parseInt(entrada.nextLine());
        System.out.println("Por favor, digite o número da agencia: ");
        String agencia = entrada.nextLine();
        System.out.println("Por favor, digite o nome do cliente: ");
        String nome = entrada.nextLine();
        System.out.println("Por favor, digite o valor do saldo: ");
        Float saldo = Float.parseFloat(entrada.nextLine());

        ContaTerminal cliente = new ContaTerminal(numero, agencia, nome, saldo);
        System.out.println(cliente.toString());


    }
}