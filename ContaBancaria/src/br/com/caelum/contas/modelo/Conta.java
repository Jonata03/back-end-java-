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
        if(this.saldo < valor){
            throw new IllegalArgumentException("Saldo insuficiente!");
        } else if (valor < 0) {
            throw  new IllegalArgumentException("Digite um numero positivo!");
        } else{
            this.saldo -= valor;
        }
    }

    public void deposita(double quantidade) {
        if (quantidade < 0 ){
            throw new IllegalArgumentException("Digite um numero positivo!");
        }else{
            this.saldo += quantidade;
        }

    }

    public void transfere(double valor, Conta conta){
        this.saca(valor);
        conta.deposita(valor);
    }
}