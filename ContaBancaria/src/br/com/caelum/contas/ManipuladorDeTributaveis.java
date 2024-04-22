package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Tributavel;
import br.com.caelum.javafx.api.util.Evento;
import lombok.*;

import java.util.Optional;

@Getter

public class ManipuladorDeTributaveis {
    private double total;
    public void calculaImpostos(Evento evento){
        for (int i = 0; i < evento.getTamanhoDaLista("listaTributaveis"); i++) {
            Tributavel tributavel = evento.getTributavel("listaTributaveis", i);
            this.total = tributavel.getValorImposto();
        }
    }
}
