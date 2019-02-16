
package observerPattern.Visores;

import observerPattern.Interfaces.ElementoVisor;
import observerPattern.Interfaces.Observador;
import observerPattern.Interfaces.Sujeto;

/**
 *
 * @author Fabio
 */
public class PortalCatedraticos implements Observador, ElementoVisor {

    private String codigoCurso;
    private String periodoLectivo;
    private String anio;
    private String codigoEstudiante;
    private int zona;
    private int examenFinal;
    private Sujeto RegistroNotas;
    
    public PortalCatedraticos(Sujeto registronotas){
        this.RegistroNotas = registronotas;
        this.RegistroNotas.registrarObservador(this);
    }
    public void actualizarInformacion(String codigoCurso, String periodoLectivo, String anio, String codigoEstudiante, int Zona, int examenFinal) {
        this.codigoCurso = codigoCurso;
        this.periodoLectivo = periodoLectivo;
        this.anio = anio;
        this.codigoEstudiante = codigoEstudiante;
        this.zona = zona;
        this.examenFinal = examenFinal;
    }

    
    public void mostrarInformacion() {
        System.out.println("NOTA COMO VISTA COMO CATEDRÁTICO: ");
        System.out.println("Zona "+ zona + " final: " + this.examenFinal);
        
    }
    
}