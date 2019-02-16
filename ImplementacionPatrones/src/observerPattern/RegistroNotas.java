
package observerPattern;
import java.util.ArrayList;
import observerPattern.Interfaces.Sujeto;
import observerPattern.Interfaces.Observador;

/**
 *
 * @author Fabio
 */
public class RegistroNotas implements Sujeto {
    
    private ArrayList <Observador> observadores;
    private String codigoCurso;
    private String periodoLectivo;
    private String anio;
    private String codigoEstudiante;
    private int zona;
    private int examenFinal;
    
    public RegistroNotas(){
        observadores = new ArrayList<Observador>();
    }
    
    public void getNota(){
        //Proceso de búsqueda de nota en la BD
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
            o.actualizarInformacion(codigoCurso, periodoLectivo, anio, codigoEstudiante, zona, examenFinal);
        }
    }
    
    //métodos para el comportamiento
    public void notaCambiada(){
        notificarObservador();
    }
    
    public void setNota(String codigoCurso,String periodoLectivo,String anio,
            String codigoEstudiante,int zona,int examenFinal){
        this.codigoCurso = codigoCurso;
        this.periodoLectivo = periodoLectivo;
        this.anio = anio;
        this.codigoEstudiante = codigoEstudiante;
        this.zona = zona;
        this.examenFinal = examenFinal;
                
    }

}
