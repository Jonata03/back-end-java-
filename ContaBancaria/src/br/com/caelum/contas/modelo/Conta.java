package br.com.caelum.contas.modelo;

public class Conta {
    int numero;
    String agencia;
    String titular;
    double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }









     public boolean saca(double valor) {
        if (this.saldo < valor) {
            return false;
        } else {
            this.saldo = this.saldo - valor;
            return true;

        }
    }

    public void deposita(double quantidade) {
        this.saldo += quantidade;
    }

    /*boolean transfere(br.com.caelum.contas.modelo.Conta destino, double valor){
        boolean retirou = this.saca(valor);
        if (!retirou){
            return false;
        }else{
            destino.deposita(valor);
            return true;
        }
    }*/
}