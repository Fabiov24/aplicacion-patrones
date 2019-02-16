/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerPattern.Interfaces;

/**
 *
 * @author Fabio
 */
public interface Sujeto {
    public void registrarObservador();
    public void eliminarObservador();
    public void notificarObservador();
}
