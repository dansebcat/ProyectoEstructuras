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
public class crearGrupos {

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
        grupoA.crearAzar();
        grupoB.crearAzar();
        grupoC.crearAzar();
        grupoD.crearAzar();
        grupoE.crearAzar();
        grupoF.crearAzar();
        grupoG.crearAzar();
        grupoH.crearAzar();
    }
}
