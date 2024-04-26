package br.com.caelum.contas.testeIO;

import java.io.*;

public class TesteSaida {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("/home/jonata.araujo/Área de Trabalho/back-end(apostila-java)/ContaBancaria/src/br/com/caelum/contas/testeIO/saida.txt");
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("caelum");
        System.out.println(bw);
        bw.close();
    }
}
