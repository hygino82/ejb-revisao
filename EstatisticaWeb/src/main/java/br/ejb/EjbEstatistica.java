package br.ejb;

import br.model.Campo;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Singleton;

@Singleton
public class EjbEstatistica implements bri.IDeterminarValores {

    private double media, desvioPadrao, variancia;
    
    private List<Campo> lista = new ArrayList<>();

    @Override
    public void inserirCampo(double quantidade, double valor) {
        lista.add(new Campo(quantidade, valor));
    }

    @Override
    public List<Campo> getCampos() {
        return lista;
    }

    @Override
    public void calcularValores() {
        //calculo da media
        double soma = 0.0;
        for (Campo c : lista) {
            soma += c.getValor() * c.getQuantidade();
        }

        media = soma / lista.size();
        //calculo da variancia
        double somaQuadDif = 0.0;

        for (Campo c : lista) {
            somaQuadDif += c.getQuantidade() * Math.pow(media - c.getValor(), 2);
        }
        variancia = somaQuadDif / lista.size();

        desvioPadrao = Math.sqrt(variancia);
    }

    @Override
    public double getMedia() {
        return media;
    }

    @Override
    public double getVariancia() {
        return variancia;
    }

    @Override
    public double getDesvioPadrao() {
        return desvioPadrao;
    }
}
