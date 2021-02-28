/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source;

/**
 *
 * @author bryan
 */
public class Nodo {
    
    private Nodo siguiente;
    private Nodo anterior;
    private Equipo equipo;

    public Nodo(Equipo equipo) {
        this.equipo = equipo;
        siguiente=null;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
    

    public void setEnlace(Nodo enlace) {
        this.siguiente = enlace;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return getEquipo().toString();
    }
    
    
}
