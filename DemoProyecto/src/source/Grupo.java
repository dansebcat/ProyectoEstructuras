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
public abstract class Grupo {
    
    Nodo primero;
    
    public int calcularPuntaje(Nodo nodo){
        int puntajeTotal;
        puntajeTotal=nodo.getEquipo().getPatidosGanados()*3+nodo.getEquipo().getPartidosEmpatados();
        return puntajeTotal;
        
    }
    
    public void ordenarGrupo(Nodo nodo){
        for(Nodo q=nodo;q.getSiguiente()!=null;q=q.getSiguiente()){
            for(Nodo p=q.getSiguiente();p!=null;p=p.getSiguiente()){
                if(q.getEquipo().getPuntajes()<p.getEquipo().getPuntajes()){
                   //Intercambiar Lista Doblemente Enlazada. 
                }
            }
        }
    }
    
    public void Intercambiar(Nodo nodo1, Nodo nodo2){
        
        
    }
}
