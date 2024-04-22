package br.com.caelum.contas.modelo;

import lombok.*;

@Getter
@Setter
public abstract class Conta {
    int numero;
    String agencia;
    String titular;
    protected double saldo;

    public abstract String getTipo();

    public void saca(double valor) {
        this.saldo = this.saldo - valor;
    }

    public void deposita(double quantidade) {
        this.saldo += quantidade;
    }

    public void transfere(double valor, Conta conta){
        this.saca(valor);
        conta.deposita(valor);
    }
}