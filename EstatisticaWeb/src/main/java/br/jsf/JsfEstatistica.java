package br.jsf;

import bri.IDeterminarValores;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import lombok.*;

@Named(value = "jsfEstatistica")
@RequestScoped
public class JsfEstatistica {

    @EJB
    private IDeterminarValores ejbEstatistica;

    public JsfEstatistica() {
    }

    @Getter
    @Setter
    private double quantidade;

    @Getter
    @Setter
    private double valor;

    @Getter
    private double media;

    @Getter
    private double variancia;

    @Getter
    private double desvioPadrao;

    public void cadastrarValores() {
        ejbEstatistica.calcularValores();
        media = ejbEstatistica.getMedia();
        variancia = ejbEstatistica.getVariancia();
        desvioPadrao = ejbEstatistica.getDesvioPadrao();
    }
}
