package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel{
    @Override
    public void saca(double valor){
        this.saldo -= (valor + 0.10);
    }

    public String getTipo(){
        return "conta corrente";
    }


    @Override
    public double getValorImposto() {
        return this.saldo * 0.01;
    }
}
