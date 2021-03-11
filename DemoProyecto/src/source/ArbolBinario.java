
package source;

import java.util.StringTokenizer;

/**
 
 *                   *
 *      *                      *
 *    *   *                 *    *
 */
public class ArbolBinario {
    NodoArbol raiz;
    String niveles[];
//constructor del arbol para octavos
    public ArbolBinario() {
        raiz = new NodoArbol("N/A11");
    }
    
    void llenarArbol(NodoArbol nodo,int cont){
        
        if(cont<4 ){
            nodo.insertarHijos("N/A");
            cont++;
            llenarArbol(nodo.hijoIzq,cont);
            llenarArbol(nodo.hijoDer,cont);
            
        }   
    }
    
    void imprimir(){
        recorrer(raiz);
    }
    
    void recorrer(NodoArbol nodo){
        if(nodo!=null){
            System.out.println(nodo.nombreEquipo);
            recorrer(nodo.hijoIzq);
            recorrer(nodo.hijoDer);
        } 
    }
    
    void crearString(){
        
    }
      public String[] imprimirNivel() {
        niveles = new String[5]; // equipo1 equipo2 equipo3 
        // brazil finlandia equipo3 equioi4
        String arbol="";
        imprimirNivel(raiz, 0);
        
          for (int i = 0; i < 5; i++) {
              arbol+=niveles[i];
          }
          System.out.println(arbol);
          StringTokenizer token = new StringTokenizer(arbol," ", false);
          String [] octavosString = new String[31];
          for (int i = 0; i < 31; i++) {
              octavosString[i]=token.nextToken();
          }
          
        return octavosString;
    }
    
    private void imprimirNivel(NodoArbol pivote, int nivel2) {
        if (pivote != null) {
            niveles[nivel2] = pivote.nombreEquipo+ " " + ((niveles[nivel2] != null) ? niveles[nivel2] : "");
            imprimirNivel(pivote.hijoDer, nivel2 + 1);
            imprimirNivel(pivote.hijoIzq, nivel2 + 1);
        }
    }
    private void LlenarArbol(NodoArbol pivote, int nivel2) {
        if (pivote != null) {
            niveles[nivel2] = pivote.nombreEquipo+ " " + ((niveles[nivel2] != null) ? niveles[nivel2] : "");
            imprimirNivel(pivote.hijoDer, nivel2 + 1);
            imprimirNivel(pivote.hijoIzq, nivel2 + 1);
        }
    }
    
    public void insertar(NodoArbol nodo){
        
    }
    
    public static void main(String[] args) {
        ArbolBinario ab = new ArbolBinario();
        ab.llenarArbol(ab.raiz, 0);
        ab.imprimirNivel();
        
    }
    
}
