package br.com.caelum.contas.modelo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Conta implements Comparable<Conta>{
    int numero;
    String agencia;
    String titular;
    protected double saldo;

    public Conta(int numero, String agencia, String titular,double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.titular = titular;
        this.saldo = saldo;
    }
    public Conta(){

    }

    public String getTipo() {
        return null;
    }

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

    @Override
    public int compareTo(Conta outraConta) {
        return this.titular.compareTo(outraConta.titular);
    }
}