package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.ContaPoupanca;
import br.com.caelum.javafx.api.util.Evento;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class ManipuladorDeContas{
    private Conta conta;
    public void criaConta(Evento evento){
        String tipo = evento.getSelecionadoNoRadio("tipo");
        String agencia = evento.getString("agencia");
        String titular = evento.getString("titular");
        int numero = Integer.parseInt(evento.getString("numero"));
        double saldo = 0;
        if(tipo.equals("Conta Corrente")){
            this.conta = new ContaCorrente(numero,agencia,titular,saldo);
        }
        else if (tipo.equals("Conta Poupança")) {
            this.conta = new ContaPoupanca(numero,agencia,titular,saldo);
        }

        this.conta.setAgencia(evento.getString("agencia"));
        this.conta.setNumero(evento.getInt("numero"));
        this.conta.setTitular(evento.getString("titular"));
    }
    public void salvaDados(Evento evento) throws IOException {
        System.out.println(evento.getLista("listaContas"));

        List<Conta> conta = evento.getLista("listaContas");
        RepositorioDeContas repositorio = new RepositorioDeContas();
        repositorio.salva(conta);
    }
    public List<Conta> carregaDados(){
        RepositorioDeContas repositorio = new RepositorioDeContas();
        return repositorio.carrega();
    }

    public void deposita(Evento evento){
        double valor = evento.getDouble("valorOperacao");
        this.conta.deposita(valor);
    }

    public void saca(Evento evento){
        double valor = evento.getDouble("valorOperacao");
        this.conta.saca(valor);
    }
    public void transfere(Evento evento){
        Conta destino = (Conta) evento.getSelecionadoNoCombo("destino");
        conta.transfere(evento.getDouble("valorTransferencia"), destino);
    }

    public void ordenaLista(Evento evento){
        List<Conta> contas = evento.getLista("destino");
        Collections.reverse(contas);
    }
}
