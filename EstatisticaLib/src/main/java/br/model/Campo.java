package br.model;

import java.io.Serializable;

public class Campo implements Serializable {

    private final double valor;
    private final double quantidade;

    public Campo(double valor, double quantidade) {
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public double getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Valor: " + valor + ", quantidade=" + quantidade;
    }
}
