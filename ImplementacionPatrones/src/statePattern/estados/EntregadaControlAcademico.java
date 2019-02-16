
package statePattern.estados;

import statePattern.State;

/**
 *
 * @author Fabio
 */
public class EntregadaControlAcademico implements State{
    public void verNota(){
        System.out.println("Se tiene un registro de la nota, proceder.");
    }
    public void subirNota(){
        System.out.println("Se ha cargado una nota anteriormente, solicitar cambio a JD.");
    }

    public void modificarNota(){
        System.out.println("Se ha cargado una nota anteriormente, solicitar cambio a JD.");
    }
}
