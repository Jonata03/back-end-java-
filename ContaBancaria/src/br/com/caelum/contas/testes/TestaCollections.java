package br.com.caelum.contas.testes;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

import java.sql.SQLOutput;
import java.util.*;

public class TestaCollections {
    public static void main(String[] args) {
   /*     ContaCorrente c1 = new ContaCorrente();
        c1.deposita(100);

        ContaCorrente c2 = new ContaCorrente();
        c2.deposita(200);

        ContaCorrente c3 = new ContaCorrente();
        c3.deposita(300);*/
/*
        List contas = new ArrayList();
        contas.add(c1);
        contas.add(c2);
        contas.add(c3);
        for (int i = 0; i < contas.size(); i++) {
//            System.out.println(contas.get(i));
            ContaCorrente cc = (ContaCorrente) contas.get(i);
            System.out.println(cc.getSaldo());
        }

        for (Object obj : contas) {
                ContaCorrente cc = (ContaCorrente) obj;
                System.out.println(cc.getSaldo());
        }*/

//        List <ContaCorrente> contas = new ArrayList<ContaCorrente>();
/*        List <ContaCorrente> contas = new ArrayList<>();
//        perceba que como o list ja esta recebendo o tipo do objeto  nao é necessario passar novamente no ArrayList basta passar um operador em diamante ArrayList<>()
        contas.add(c1);
        contas.add(c2);
        contas.add(c3);
        for(ContaCorrente obj: contas){
            ContaCorrente cc = obj;
//            nesse caso nao é necessario fazer o casting
            System.out.println(cc.getSaldo());
        }*/
        /*Set<String> conjunto = new HashSet<>();

        conjunto.add("item 1");
        conjunto.add("item 2");
        conjunto.add("item 3");

        Iterator<String> i = conjunto.iterator();
        while (i.hasNext()){
            String palavra = i.next();
            System.out.println(palavra);
        }*/
        ContaCorrente c1 = new ContaCorrente();
        c1.deposita(1000);

        ContaCorrente c2 = new ContaCorrente();
        c2.deposita(5000);

        Map<String,ContaCorrente> mapaDeContas = new HashMap<>();

        mapaDeContas.put("diretor",c1);
        mapaDeContas.put("gerente", c2);
        mapaDeContas.put("diretor", c2);


        ContaCorrente contaDoDiretor = mapaDeContas.get("diretor");
        System.out.println(contaDoDiretor.getSaldo());
    }
}
