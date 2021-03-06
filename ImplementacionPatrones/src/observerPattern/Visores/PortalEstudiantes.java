
package observerPattern.Visores;

import java.util.ArrayList;
import observerPattern.Interfaces.ElementoVisor;
import observerPattern.Interfaces.Observador;
import observerPattern.Interfaces.Sujeto;
import statePattern.Nota;

/**
 *
 * @author Fabio
 */
public class PortalEstudiantes implements Observador, ElementoVisor {

    private ArrayList <Nota> notas;
    private Sujeto RegistroNotas;

    public PortalEstudiantes(Sujeto registronotas){
        this.RegistroNotas = registronotas;
        this.RegistroNotas.registrarObservador(this);
    }

    public void actualizarInformacion(ArrayList<Nota> notasObtenidas) {
        //Se limpia las notas para poder mantener la inforamción actualizada al 100%
        this.notas.clear();
        for(Nota n : notasObtenidas){
            this.notas.add(n);
        }
    }

    public void mostrarInformacion() {
        System.out.println("NOTA VISTA COMO ESTUDIANTE: ");
        for(Nota n : this.notas){
            System.out.println("Zona "+ n.getZona() + " final: " + n.getExamenFinal());
        }


    }


}
