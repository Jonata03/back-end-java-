package br.com.caelum.contas.testeIO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class testes {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        PrintStream ps = new PrintStream("/home/jonata.araujo/Área de Trabalho/back-end(apostila-java)/ContaBancaria/src/br/com/caelum/contas/testeIO/saida.txt");
        while (s.hasNextLine()){
            ps.println(s.nextLine());
        };
    }
}
