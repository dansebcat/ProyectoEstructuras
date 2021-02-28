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
   static Grupo grupoB;
   static Grupo grupoC;
   static Grupo grupoD;
   static Grupo grupoE;
   static Grupo grupoF;
   static Grupo grupoG;
   static Grupo grupoH;
   
   public static void iniciarCrearGrupos(){
       grupoA = new Grupo('A');
        grupoA.crearAzar();
         grupoB = new Grupo('B');
        grupoB.crearAzar();
        grupoC = new Grupo('C');
        grupoC.crearAzar();
        grupoD = new Grupo('D');
        grupoD.crearAzar();
        grupoE = new Grupo('E');
        grupoE.crearAzar();
        grupoF = new Grupo('F');
        grupoF.crearAzar();
         grupoG = new Grupo('G');
        grupoG.crearAzar();
        grupoH = new Grupo('H');
        grupoH.crearAzar();
   }
}
