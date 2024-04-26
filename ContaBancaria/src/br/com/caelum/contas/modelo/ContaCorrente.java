package br.com.caelum.contas.modelo;

import br.com.caelum.contas.SaldoInsuficienteException;

public class ContaCorrente extends Conta implements Tributavel{
    // Implementação da classe


    public ContaCorrente() {
        super();
    }

    public ContaCorrente(int numero, String agencia, String titular, double saldo) {
        super(numero,agencia,titular,saldo);
    }

    @Override
    public void saca(double valor){
        if(this.saldo < valor){
                throw new IllegalArgumentException("Saldo insuficiente!");
        } else if (valor < 0) {
                throw new IllegalArgumentException("Digite um numero positivo!");
        } else{
            this.saldo -= valor;
        }
    }

    public String getTipo(){
        return "conta corrente";
    }


    @Override
    public double getValorImposto() {
        return this.saldo * 0.01;
    }

}
