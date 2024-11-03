package br.ejb;

import javax.ejb.Stateless;

@Stateless
public class EjbParalelepipedo implements EjbParalelepipedoLocal {

    @Override
    public double getAreaTotal(double a, double b, double c) {
        return 2 * (a * b + a * c + b * c);
    }

    @Override
    public double getVolume(double a, double b, double c) {
        return a * b * c;
    }
}
