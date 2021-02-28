
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
public class Grupo {
    static char Id;
    static Nodo primero;

    public Grupo(char id) {
        this.Id=id;
        primero=null;
    }
    
    public static void addEquipo(Nodo nodo){
        if(primero==null){
            primero=nodo;
        }else{
           Nodo q = primero;
           while(q.getSiguiente()!=null){
               q=q.getSiguiente();
           }
           nodo.setAnterior(q);
           nodo.setSiguiente(null);
        }
    }
    
    public static void crearAzar(){
        
        for (int i = 0; i < 4; i++) {
            int random = (int) (Math.random() * 33);
            
            while (ListaEquipos.listaEquipos[random].isIsSelected()) {
                random = (int) (Math.random() * 33);
            }
            addEquipo(new Nodo(ListaEquipos.listaEquipos[random]));
            ListaEquipos.listaEquipos[random].setIsSelected(true);
        }
    }
    
    public static int calcularPuntaje(Nodo nodo){
        int puntajeTotal;
        puntajeTotal=nodo.getEquipo().getPatidosGanados()*3+nodo.getEquipo().getPartidosEmpatados();
        return puntajeTotal;
        
    }
    
    public static void ordenarGrupo(Nodo nodo){
        for(Nodo q=nodo;q.getSiguiente()!=null;q=q.getSiguiente()){
            for(Nodo p=q.getSiguiente();p!=null;p=p.getSiguiente()){
                if(q.getEquipo().getPuntajes()<p.getEquipo().getPuntajes()){
                   //Intercambiar Lista Doblemente Enlazada. 
                }
            }
        }
    }
    
    public static void Intercambiar(Nodo nodo1, Nodo nodo2){
        
        
    }

    @Override
    public String toString() {
        String salida="Equipo\tPtos\tPJ\tPG\tPE\tPP\tDG\n";
        for (Nodo q = this.primero; q!=null ; q=q.getSiguiente()) {
            salida+=q.toString()+"\n";
        }
        return salida;
    }
    
    
}
