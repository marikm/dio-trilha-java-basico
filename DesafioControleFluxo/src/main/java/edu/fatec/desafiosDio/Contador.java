package edu.fatec.desafiosDio;

import java.util.Scanner;

public class Contador {

    public static void checarParametros(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if(parametroDois < parametroUm){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    public static void contar(int parametroUm, int parametroDois) {
        try{
            checarParametros(parametroUm, parametroDois);
            for(int i = 1; i <= parametroDois - parametroUm; i++){
                System.out.println("Imprimindo o numero " + i);
            }
        } catch (ParametrosInvalidosException e){
            System.out.println("O segundo parametro deve ser maior que o primeiro");
        }

    }

}
