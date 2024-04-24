package br.com.caelum.contas;

public class SaldoInsuficienteException extends Exception{
    public SaldoInsuficienteException(double valor){
        super("Valor insuficiente para sacar o calor de: " + valor);
    }
}
