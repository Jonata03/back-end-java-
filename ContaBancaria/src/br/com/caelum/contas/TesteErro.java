package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;

import java.io.FileNotFoundException;

public class TesteErro {
    public static void main(String[] args) throws FileNotFoundException {
        Conta cc = new ContaCorrente();
        cc.deposita(10);

        Conta  cp = new ContaPoupanca();
        cp.deposita(100);


        cc.saca(5);
        System.out.println("sacou conta corrente");
        cp.saca(50);
        System.out.println("sacou conta poupanca");


//        try{
//              cp.saca(50);
//            System.out.println("sacou conta poupanca");
//        }catch(IllegalArgumentException e){
//            System.out.println(e.getMessage());
//        }


    }
}