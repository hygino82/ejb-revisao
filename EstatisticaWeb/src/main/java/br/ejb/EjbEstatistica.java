package br.ejb;

import br.model.Campo;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Singleton;

@Singleton
public class EjbEstatistica implements bri.IDeterminarValores {

    private double media=0, desvioPadrao=0, variancia=0;

    private final List<Campo> lista = new ArrayList<>();

    @Override
    public void inserirCampo(double quantidade, double valor) {
        lista.add(new Campo(quantidade, valor));
    }

    @Override
    public List<Campo> getCampos() {
        return lista;
    }

    @Override
    public double getMedia() {
        //calculo da media
        double soma = 0.0;
        double somaQuantidade = 0.0;
        
        for (Campo c : lista) {
            soma += c.getValor() * c.getQuantidade();
            somaQuantidade += c.getQuantidade();
        }

        media = soma / somaQuantidade;
        return media;
    }

    @Override
    public double getVariancia() {
        //calculo da variancia
        final double media = getMedia();
        double somaQuadDif = 0.0;
        double somaQuantidade = 0.0;
        
        for (Campo c : lista) {
            somaQuadDif += c.getQuantidade() * Math.pow(media - c.getValor(), 2);
            somaQuantidade += c.getQuantidade();
        }
        variancia = somaQuadDif / somaQuantidade;

        return variancia;
    }

    @Override
    public double getDesvioPadrao() {
        desvioPadrao = Math.sqrt(getVariancia());
        return desvioPadrao;
    }
}
