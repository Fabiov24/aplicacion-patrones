
package statePattern;

/**
 *
 * @author Fabio
 */
public class Nota {
    private State estado;
    
    public void setEstado(State estado){
        this.estado = estado; 
    }
    
    public State getEstado(){
        return this.estado;
    }
    
    public void verNota(){
        estado.verNota();
    }
    public void subirNota(){
        estado.subirNota();
    }
    public void modificarNota(){
        estado.modificarNota();
    }
           
}
