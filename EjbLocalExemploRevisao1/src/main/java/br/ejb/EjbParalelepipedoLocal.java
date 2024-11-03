package br.ejb;

import javax.ejb.Local;

@Local
public interface EjbParalelepipedoLocal {

    double getAreaTotal(double a, double b, double c);

    double getVolume(double a, double b, double c);
}
