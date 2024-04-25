package br.com.caelum.contas.testes;

import javafx.scene.chart.BubbleChart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Agencia {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("Sergio");
        lista.add("Paulo");
        lista.add("Guilherme");

        System.out.println(lista);
        Collections.sort(lista);
//      manipula a lista e deixa ordanado
        System.out.println(lista);
    }
}




