package br.com.caelum.contas.testeIO;

import java.io.*;

public class TesteEntrada {
    public static void main(String[] args) throws IOException {
        /*InputStream is = new FileInputStream("/home/jonata.araujo/Área de Trabalho/back-end(apostila-java)/ContaBancaria/src/br/com/caelum/contas/testeIO/arquivo.txt");
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();

        while (s != null){
            System.out.println(s);
            s = br.readLine();
        }
        br.close();

//        no caso o inputStream le o byte, o inputStreamReader le o char e o BufferedReader le a string
        //inputStream = byte
        //InputStreamReader = char
        //BufferedReader = String*/

        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();

        while(s!=null){
            System.out.println(s);
            s = br.readLine();
        }
    }
}
