package edu.fatec.banco.financeiro;

public class ContaTerminal {

    private final Integer numero;
    private final String agencia;
    private final String nomeCliente;
    private final Float saldo;

    public ContaTerminal(Integer numero, String agencia, String nomeCliente, Float saldo) {

        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public Float getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";


    }
}
