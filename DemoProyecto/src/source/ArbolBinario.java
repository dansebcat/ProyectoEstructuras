
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package source;

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
        raiz = new NodoArbol("N/A");
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
      public void imprimirNivel() {
        niveles = new String[5];

        imprimirNivel(raiz, 0);
        for (int i = 0; i < niveles.length; i++) {
            System.out.println(niveles[i] + " En nivel: " + i);
        }
    }

    private void imprimirNivel(NodoArbol pivote, int nivel2) {
        if (pivote != null) {
            niveles[nivel2] = pivote.nombreEquipo+ ", " + ((niveles[nivel2] != null) ? niveles[nivel2] : "");
            imprimirNivel(pivote.hijoDer, nivel2 + 1);
            imprimirNivel(pivote.hijoIzq, nivel2 + 1);
        }
    }
    
    public static void main(String[] args) {
        ArbolBinario ab = new ArbolBinario();
        ab.llenarArbol(ab.raiz, 0);
        ab.imprimirNivel();
        
    }
    
}
