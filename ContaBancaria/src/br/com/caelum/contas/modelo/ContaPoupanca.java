package br.com.caelum.contas.modelo;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(int numero, String agencia, String titular, double saldo) {
        super();
    }

    public String getTipo(){
        return "Conta Poupanca";
    }
}
