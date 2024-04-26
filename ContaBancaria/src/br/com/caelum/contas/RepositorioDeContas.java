package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepositorioDeContas {
    Scanner scanner = new Scanner(System.in);

    public void salva(List<Conta> contas) throws IOException {
        PrintStream stream = new PrintStream("/home/jonata.araujo/Área de Trabalho/back-end(apostila-java)/ContaBancaria/src/br/com/caelum/contas/contas.txt");
        for (Conta conta : contas) {
            stream.println(
                    conta.getTipo() + ", "
                            + conta.getNumero() + ", "
                            + conta.getAgencia() + ", "
                            + conta.getTitular() + ", "
                            + conta.getSaldo()
            );
        }
    }

    private List<Conta> carrega() {
        List<Conta> contas = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("contas.txt"))) {
            while (scanner.hasNextLine()) {
                Conta conta;
                String linha = scanner.nextLine();
                String[] valores = linha.split(",");
                String tipo = valores[0];
                int numero = Integer.parseInt(valores[1]);
                String agencia = valores[2];
                String titular = valores[3];
                double saldo = Double.parseDouble(valores[4]);

                if (tipo.equals("Conta Corrente")){
                    conta = new ContaCorrente(numero, agencia, titular, saldo);
                }else{
                    conta = new ContaPoupanca(numero, agencia, titular,saldo);
                }
                contas.add(conta);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Nao tem arquivo ainda");
        }
        return contas;
    }
}
