package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class TesteErro {
    public static void main(String[] args) {
//        PrintStream saida = System.out;
//        saida.println("ola");
        //        Conta cc = new ContaCorrente();
//        cc.deposita(10);
//
//        Conta  cp = new ContaPoupanca();
//        cp.deposita(100);


//        cc.saca(5);
//        System.out.println("sacou conta corrente");
//        cp.saca(50);
//        System.out.println("sacou conta poupanca");


//        try{
//              cp.saca(50);
//            System.out.println("sacou conta poupanca");
//        }catch(IllegalArgumentException e){
//            System.out.println(e.getMessage());
//        }

        /*String b= "5";
        String a = "5";
//        Se forem iguais, é devolvido 0; se for anterior à String do argumento, um inteiro negativo; e, se for posterior, um inteiro positivo.
        System.out.println(a.compareTo(b));*/

//        String palavra = "    fj11    ";
//        palavra = palavra.toUpperCase().replace("1","2");
//        System.out.println(palavra);
//        System.out.println(palavra.trim());

//        forma de declarar um array
//      double[] saldosDasContas;

//      objeto array
//        saldoDasContas = new double[10]
//        O que fizemos foi criar uma array de double de dez posições e atribuir o endereço no qual ela foi criada. Podemos ainda acessar as posições da array:
//        saldosDasContas[5] = conta5.getSaldo();
        /*int n =10;
        int[] numerosDoBilhete = new int[n];
        for(int i = 0;i < n;i++ ){
            System.out.println(numerosDoBilhete[i]);
        }*/

/*        ContaCorrente[] minhasContas;
        minhasContas = new ContaCorrente[10];
        ContaCorrente contaNova = new ContaCorrente();
        contaNova.deposita(1000);
        minhasContas[0] = contaNova;
//        System.out.println(minhasContas[0]);
        minhasContas[1] = new ContaCorrente();
        minhasContas[1].deposita(3200);
        System.out.println(minhasContas[1].getSaldo());
        System.out.println(minhasContas[0].getSaldo());*/

        //assim ele guardara apenas contas corrente pq a criçao que o array esta tendo nao é generalizado e consta apenas para um tipo de conta
        // para abranger todos os tipo de contas devemos inicializar um array de um tipo mais abrangente como por exemplo o tipo conta(), que é um tipo abstrato

        /*Conta[] minhasContas = new Conta[10];
        minhasContas[0] = new ContaCorrente();
        minhasContas[1] = new ContaPoupanca();*/

//      List<Conta> numero = new ArrayList();



    }
}