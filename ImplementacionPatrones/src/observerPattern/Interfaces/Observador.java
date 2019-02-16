
package observerPattern.Interfaces;

import java.util.ArrayList;
import statePattern.Nota;

/**
 *
 * @author Fabio
 */
public interface Observador {
    public void actualizarInformacion(ArrayList<Nota> notas);
}
