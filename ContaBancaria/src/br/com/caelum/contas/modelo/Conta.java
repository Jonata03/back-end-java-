package br.com.caelum.contas.modelo;

import br.com.caelum.contas.SaldoInsuficienteException;
import lombok.*;

@Getter
@Setter
public abstract class Conta {
    int numero;
    String agencia;
    String titular;
    protected double saldo;

    public abstract String getTipo();

    public void saca(double valor){
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
    public String toString(){
        return "[titular = " + titular.toUpperCase() + ", numero=" + numero + ", agencia = " + agencia + "]";
    }
    public boolean equals (Object obj){
//        verifica se o object nao é nulo
        if (obj == null){
            return false;
        }

        Conta outraConta = (Conta) obj;
        return this.numero == outraConta.numero && this.agencia.equals(outraConta.agencia);
    }
}