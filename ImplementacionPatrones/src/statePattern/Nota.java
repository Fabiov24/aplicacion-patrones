
package statePattern;

/**
 *
 * @author Fabio
 */
public class Nota {
    private State estado;
    private String codigoCurso;
    private String periodoLectivo;
    private String anio;
    private String codigoEstudiante;
    private int Zona;
    private int examenFinal;
    
    
    //Getter y Setter del estado actual.
    public void setEstado(State estado){
        this.estado = estado; 
    }
    
    public State getEstado(){
        return this.estado;
    }
    
    // Acciones que se pueden hacer sobre una nota
    public void verNota(){
        estado.verNota();
    }
    public void subirNota(){
        estado.subirNota();
    }
    public void modificarNota(){
        estado.modificarNota();
    }

    //Getters y Setters del resto de atributos de nota
    public String getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getPeriodoLectivo() {
        return periodoLectivo;
    }

    public void setPeriodoLectivo(String periodoLectivo) {
        this.periodoLectivo = periodoLectivo;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(String codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public int getZona() {
        return Zona;
    }

    public void setZona(int Zona) {
        this.Zona = Zona;
    }

    public int getExamenFinal() {
        return examenFinal;
    }

    public void setExamenFinal(int examenFinal) {
        this.examenFinal = examenFinal;
    }
    
    
    
    
           
}
