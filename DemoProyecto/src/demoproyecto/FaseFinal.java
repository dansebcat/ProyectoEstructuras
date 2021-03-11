/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoproyecto;

import source.*;

/**
 *
 * @author danie
 */
public class FaseFinal {

    static String[] octavos = new String[16];
    static String[] cuartos = new String[8];
    static String[] semifinal = new String[4];
    static String[] Granfinal = new String[2];
    static String[] campeon = new String[1];

    static void verClasificados() {
        String[] auxA = EquiposFaseGrupos.grupoA.crearString();
        String[] auxB = EquiposFaseGrupos.grupoB.crearString();
        String[] auxC = EquiposFaseGrupos.grupoC.crearString();
        String[] auxD = EquiposFaseGrupos.grupoD.crearString();
        String[] auxE = EquiposFaseGrupos.grupoE.crearString();
        String[] auxF = EquiposFaseGrupos.grupoF.crearString();
        String[] auxG = EquiposFaseGrupos.grupoG.crearString();
        String[] auxH = EquiposFaseGrupos.grupoH.crearString();
        octavos[0] = auxA[0];
        octavos[1] = auxA[1];
        octavos[2] = auxB[0];
        octavos[3] = auxB[1];
        octavos[4] = auxC[0];
        octavos[5] = auxC[1];
        octavos[6] = auxD[0];
        octavos[7] = auxD[1];
        octavos[8] = auxE[0];
        octavos[9] = auxE[1];
        octavos[10] = auxF[0];
        octavos[11] = auxF[1];
        octavos[12] = auxG[0];
        octavos[13] = auxG[1];
        octavos[14] = auxH[0];
        octavos[15] = auxH[1];

    }

    static void generarResultadosOctavosAleatoriamente100realNoFakeUnLink() {
        String salida = "";
        int resultados[] = new int[16];
        for (int i = 0; i < 16; i++) {
            resultados[i] = (int) (Math.random() * 6);
        }

        cuartos[0] = ((resultados[0] > resultados[1]) ? octavos[0] : octavos[1]);
        cuartos[1] = ((resultados[2] > resultados[3]) ? octavos[2] : octavos[3]);
        cuartos[2] = ((resultados[4] > resultados[5]) ? octavos[4] : octavos[5]);
        cuartos[3] = ((resultados[6] > resultados[7]) ? octavos[6] : octavos[7]);
        cuartos[4] = ((resultados[8] > resultados[9]) ? octavos[8] : octavos[9]);
        cuartos[5] = ((resultados[10] > resultados[11]) ? octavos[10] : octavos[11]);
        cuartos[6] = ((resultados[12] > resultados[13]) ? octavos[12] : octavos[13]);
        cuartos[7] = ((resultados[14] > resultados[15]) ? octavos[14] : octavos[15]);

    }

    static void generarResultadosCuartosFinal() {
        int resultados[] = new int[8];
        for (int i = 0; i < 8; i++) {
            resultados[i] = (int) (Math.random() * 6);
        }

        semifinal[0] = ((resultados[0] > resultados[1]) ? cuartos[0] : cuartos[1]);
        semifinal[1] = ((resultados[2] > resultados[3]) ? cuartos[2] : cuartos[3]);
        semifinal[2] = ((resultados[4] > resultados[5]) ? cuartos[4] : cuartos[5]);
        semifinal[3] = ((resultados[6] > resultados[7]) ? cuartos[6] : cuartos[7]);
    }

    static void generarResultadosSeminifal() {
        int resultados[] = new int[4];
        for (int i = 0; i < 4; i++) {
            resultados[i] = (int) (Math.random() * 6);
        }
        Granfinal[0] = ((resultados[0] > resultados[1]) ? semifinal[0] : semifinal[1]);
        Granfinal[1] = ((resultados[2] > resultados[3]) ? semifinal[2] : semifinal[3]);

    }

    static void generarResultadosGranFinal() {
        int resultados[] = new int[4];
        for (int i = 0; i < 2; i++) {
            resultados[i] = (int) (Math.random() * 6);
        }
        campeon[0] = ((resultados[0] > resultados[1]) ? Granfinal[0] : Granfinal[1]);
    }
    
    
    
    

}
