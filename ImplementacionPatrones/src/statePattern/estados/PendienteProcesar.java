
package statePattern.estados;

import statePattern.State;

/**
 *
 * @author Fabio
 */
public class PendienteProcesar implements State{
    public void verNota(){
        System.out.println("No se ha cargado una nota para el curso.");
    }
    public void subirNota(){
        System.out.println("Estado correcto para publicar nota.");
    }

    public void modificarNota(){
        System.out.println("No se ha cargado una nota para el curso.");
    }
}
