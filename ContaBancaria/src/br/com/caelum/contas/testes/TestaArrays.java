package br.com.caelum.contas.testes;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

import java.util.ArrayList;

public class TestaArrays {
    public static void main(String[] args) {
        /*Conta[] contas = new Conta[10];
        for(int i = 0; i < contas.length; i++){
            Conta conta = new ContaCorrente();
            conta.deposita(i* 100);
            contas[i] = conta;
            System.out.println(contas[i].getSaldo());
        }


        double soma = 0;
        for(int i = 0;i < contas.length;i++){
            int saldo = (int) contas[i].getSaldo();
            soma += saldo;
            System.out.println(soma);
        }
        double media = soma/ contas.length;
        System.out.println(media);*/


        /*int[] n = new int[10];     // Defina o número de termos da sequência que deseja gerar
        n[1] = 0;
        n[2] = 1;

        System.out.println("Sequência de Fibonacci:");
        System.out.print(n[1] + " " + n[2]);

        for (int i = 0; i < n.length; i++) {
            int proximo = n[1] + n[2];
            System.out.print(" " + proximo);
            n[1] = n[2];
            n[2] = proximo;
        }*/
        /*
        int[] n = new int[10];
        int primeiro = 0;
        int segundo = 1;

        for (int i = 1 ;i< n.length;i++){
            n[i] = primeiro + segundo;
            System.out.println(" " + n[i]);

            primeiro = segundo;
            segundo = n[i];
        }
        System.out.println(n[9]);
*/

        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<String> carros = new ArrayList<>(100);
//        metodo trimToSize() libera o espaço em branco do ArrayList mantendo ele apenas no espaço que esta ocupando
        numeros.add(11);
        numeros.add(22);
        numeros.add(33);

        carros.add("HRV");
        carros.add("Polo");
        carros.add("Cruze");
        carros.add(1,"Argo");
        carros.add(1, "Fusion");

        carros.remove("fusion");
        carros.remove(2);
        //lembrando que como é um "array" o indice começa em 0, quando é adicionado em um indice que ja esta preenchido ele joga o elemento antigo pro indice posterior

//        System.out.println(carros.get(4));
//        retorna um indice desejado de dentro do array list

//pode ser usado tanto o for normal quanto o for each
        for (int i =0;i< carros.size();i++){
            System.out.println(carros.get(i));
        }

//        for(int e:numeros){
//            System.out.println(e);
//        }
//        for(String e:carros){
//            System.out.println(e);
//        }
    }


}
