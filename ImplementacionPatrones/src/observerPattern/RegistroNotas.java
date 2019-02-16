
package observerPattern;
import java.util.ArrayList;
import observerPattern.Interfaces.Sujeto;
import observerPattern.Interfaces.Observador;
import statePattern.Nota;

/**
 *
 * @author Fabio
 */
public class RegistroNotas implements Sujeto {
    
    private ArrayList <Observador> observadores;
    private ArrayList <Nota> notas;
    
    public RegistroNotas(){
        this.observadores = new ArrayList<Observador>();
        this.notas = new ArrayList<Nota>();
    }
    
    public void getNotasDeBaseDatos(){
        
        ArrayList<Nota> notasObtenidas = new ArrayList<Nota>();
        //Proceso de búsqueda de nota en la BD
        for(Nota n : notasObtenidas){
            this.setNota(n);
        }
        
    }
    
    
    //Implementación de los métodos de la interfaz, para comportarse como se desea
    public void registrarObservador(Observador observer) {
        observadores.add(observer);
    }
   
    public void eliminarObservador(Observador observer) {
        int posicionObservador = observadores.indexOf(observer); 
        if(posicionObservador>=0){
            observadores.remove(posicionObservador);
        }        
    }
    
    public void notificarObservador(){
        for(Observador o : this.observadores){
            o.actualizarInformacion(notas);
        }
    }
    
    //métodos para el comportamiento
    public void notaCambiada(){
        notificarObservador();
    }
    
    public void setNota(Nota n){
        Nota nota = new Nota();
        nota.setCodigoCurso(n.getCodigoCurso());
        nota.setPeriodoLectivo(n.getPeriodoLectivo());
        nota.setAnio(n.getAnio());
        nota.setCodigoEstudiante(n.getCodigoEstudiante());
        nota.setZona(n.getZona());
        nota.setExamenFinal(n.getExamenFinal());
        this.notas.add(nota);
                
    }

}
