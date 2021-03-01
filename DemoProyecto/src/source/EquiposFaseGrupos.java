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
public class EquiposFaseGrupos {

    public static Grupo grupoA;
    public static Grupo grupoB;
    public static Grupo grupoC;
    public static Grupo grupoD;
    public static Grupo grupoE;
    public static Grupo grupoF;
    public static Grupo grupoG;
    public static Grupo grupoH;

    public static void iniciarCrearGrupos() {
        grupoA = new Grupo('A');

        grupoB = new Grupo('B');

        grupoC = new Grupo('C');

        grupoD = new Grupo('D');

        grupoE = new Grupo('E');

        grupoF = new Grupo('F');

        grupoG = new Grupo('G');

        grupoH = new Grupo('H');

    }

    public static void crearGruposAlAzar() {
        ListaEquipos.marcarNoSeleccionado();
        grupoA.crearAzar();
        grupoB.crearAzar();
        grupoC.crearAzar();
        grupoD.crearAzar();
        grupoE.crearAzar();
        grupoF.crearAzar();
        grupoG.crearAzar();
        grupoH.crearAzar();
    }
    
    public static void ordenarGrupos(){
        grupoA.ordenarGrupo();
        grupoB.ordenarGrupo();
        grupoC.ordenarGrupo();
        grupoD.ordenarGrupo();
        grupoE.ordenarGrupo();
        grupoF.ordenarGrupo();
        grupoG.ordenarGrupo();
        grupoH.ordenarGrupo();
    }
    
    public static String imprimirGrupos(){
        String salida="";
        salida+=grupoA.toString();
        salida+=grupoB.toString();
        salida+=grupoC.toString();
        salida+=grupoD.toString();
        salida+=grupoE.toString();
        salida+=grupoF.toString();
        salida+=grupoG.toString();
        salida+=grupoH.toString();
        return salida;
        
    }
}
