package br.com.caelum.contas.modelo;

import lombok.*;
@Getter
@Setter
public class SeguroDeVida implements Tributavel{
    private double valor;
    private String titular;
    private int numeroApolice;


    @Override
    public double getValorImposto() {
        return 42 + (this.valor * 0.02);
    }
}
