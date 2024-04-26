package br.com.caelum.contas.testes;

import br.com.caelum.contas.modelo.ContaCorrente;

import java.util.*;

import br.com.caelum.contas.modelo.Conta;

public class TestaPerformance {
    public static void main(String[] args) {
        Conta c1 = new ContaCorrente();
        c1.deposita(100000);

        Conta c2 = new ContaCorrente();
        c2.deposita(3000);

        Map<String, Conta> mapaDeContas = new HashMap();
        mapaDeContas.put("diretor",c1);
        mapaDeContas.put("Gerente",c2);

        Conta contaDoDiretor = (Conta) mapaDeContas.get("diretor");
        System.out.println(contaDoDiretor.getSaldo());


        /* System.out.println("iniciando...");

        Collection<Integer> teste = new HashSet<>();
        long inicio = System.currentTimeMillis();

        int total = 3000000;

        for (int i = 0; i < total; i++){
            teste.add(i);
        }
        for (int i =0 ;i < total; i++){
            teste.contains(i);
        }

        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        System.out.println("Tempo Gasto: "+ tempo);*/
    }
}
