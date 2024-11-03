package br.jsf;

import br.ejb.EjbParalelepipedoLocal;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import lombok.*;

@Named(value = "jsfParelelepipedo")
@RequestScoped
public class JsfParelelepipedo {

    @EJB
    private EjbParalelepipedoLocal ejbParalelepipedo;

    public JsfParelelepipedo() {
    }

    @Getter
    @Setter
    private double comprimento;

    @Getter
    @Setter
    private double largura;

    @Getter
    @Setter
    private double altura;

    @Getter
    private double areaTotal;

    @Getter
    private double volume;

    public void calcularValores() {
        areaTotal = ejbParalelepipedo.getAreaTotal(altura, largura, comprimento);
        volume = ejbParalelepipedo.getVolume(altura, largura, comprimento);
    }
}
