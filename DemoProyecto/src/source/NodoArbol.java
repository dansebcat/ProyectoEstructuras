

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source;

/**
 *
 * @author danie
 */
public class NodoArbol {
    String nombreEquipo;
    int resultadoPartido;
    int resultadoPenales;
    NodoArbol padre;
    NodoArbol hijoIzq;
    NodoArbol hijoDer;

    public NodoArbol(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
        resultadoPartido=0;
        resultadoPenales=0;
        padre=null;
        hijoDer=null;
        hijoIzq=null;
    }
    void insertarHijos(String str){
        NodoArbol nodo1 = new NodoArbol(str);
        NodoArbol nodo2 = new NodoArbol(str);
        
        hijoIzq = nodo1;
        hijoDer = nodo2;
        
    }
    
    
    
}

