
package statePattern.estados;

import statePattern.State;

/**
 *
 * @author Fabio
 */
public class IngresoWeb implements State{
    public void verNota(){
        System.out.println("Se tiene un registro de la nota, proceder.");
    }
    public void subirNota(){
        System.out.println("Ya se ha cargado una nota previamente.");
    }

    public void modificarNota(){
        System.out.println("Estado correcto para modificar nota, proceder.");
    }
    
}
