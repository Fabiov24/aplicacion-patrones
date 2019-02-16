
package statePattern.estados;

import statePattern.State;

/**
 *
 * @author Fabio
 */
public class EnviadaEscuela implements State{
    public void verNota(){
        System.out.println("Se ha cargado la nota correctamente.");
    }
    public void subirNota(){
        System.out.println("Ya se ha cargado una nota previamente.");
    }

    public void modificarNota(){
        System.out.println("Se ha cargado una nota anteriormente, solicitar cambio a JD.");
    }
}
