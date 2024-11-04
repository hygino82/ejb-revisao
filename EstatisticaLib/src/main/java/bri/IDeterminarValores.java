package bri;

import br.model.Campo;
import java.util.List;
import javax.ejb.Remote;

@Remote
public interface IDeterminarValores {

    void inserirCampo(double quantidade, double valor);

    List<Campo> getCampos();

    double getMedia();

    double getVariancia();

    double getDesvioPadrao();
}
