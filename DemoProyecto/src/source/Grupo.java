
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

    char Id;
    Nodo primero;

    public Grupo(char id) {
        this.Id = id;
        primero = null;
    }

    public void addEquipo(Nodo nodo) {
        if (primero == null) {
            primero = nodo;
        } else {
            Nodo q = primero;
            while (q.getSiguiente() != null) {
                q = q.getSiguiente();
            }
            nodo.setAnterior(q);
            q.setSiguiente(nodo);
            nodo.setSiguiente(null);
        }
    }

    public String[] crearString() {
        int cont = 0;
        String[] salida = new String[4];
        for (Nodo i = primero; i != null; i = i.getSiguiente()) {
            salida[cont] = i.getEquipo().getNombre();
            cont++;
        }
        return salida;
    }

    public void crearAzar() {

        for (int i = 0; i < 4; i++) {
            boolean run = true;
            int random = (int) (Math.random() * 32);
            while (run) {
                if (ListaEquipos.listaEquipos[random].isIsSelected() == false) {
                    addEquipo(new Nodo(ListaEquipos.listaEquipos[random]));
                    ListaEquipos.listaEquipos[random].setIsSelected(true);
                    run = false;
                } else {
                    random = (int) (Math.random() * 32);
                }
            }
        }
    }

    public int calcularPuntaje(Nodo nodo) {
        int puntajeTotal;
        puntajeTotal = nodo.getEquipo().getPatidosGanados() * 3 + nodo.getEquipo().getPartidosEmpatados();
        return puntajeTotal;

    }

    public void ingresarResultados(int res1, int res2, String nombre1, String nombre2) {
        Nodo equipo1 = buscar(nombre1);
        Nodo equipo2 = buscar(nombre2);
        if (res1 > res2) {
            //Equipo1Gano
            equipo1.getEquipo().Gano(res1, res2);
            equipo1.getEquipo().Perdio(res2, res1);
        } else if (res1 < res2) {
            //Equipo1 perdio
            equipo1.getEquipo().Perdio(res1, res2);
            equipo2.getEquipo().Gano(res2, res1);
        } else {
            //empataron
            equipo1.getEquipo().empato(res1, res2);
            equipo2.getEquipo().empato(res2, res1);
        }
    }

    public Nodo buscar(String nombre) {
        Nodo nodo;
        for (Nodo i = primero; i != null; i = i.getSiguiente()) {
            if (i.getEquipo().getNombre().equals(nombre)) {
                return i;
            }
        }
        return null;

    }
//CORREGIRR!!!
    public void ordenarGrupo() {
        for (Nodo q = primero; q.getSiguiente() != null; q = q.getSiguiente()) {
            for (Nodo p = q.getSiguiente(); p != null; p = p.getSiguiente()) {
                if (q.getEquipo().getPuntajes() < p.getEquipo().getPuntajes()) {
                    //Intercambiar Lista Doblemente Enlazada. 
                    
                        Nodo aux1, aux2;
                        aux1 = p.getSiguiente();
                        aux2 = p.getAnterior();
                        q.getAnterior().setSiguiente(p);
                        q.getSiguiente().setAnterior(p);
                        p.setSiguiente(q.getSiguiente());
                        p.setAnterior(q.getAnterior());
                        q.setSiguiente(aux1);
                        q.setAnterior(aux2);
                    

                }
            }
        }
    }

    public void Intercambiar(Nodo nodo1, Nodo nodo2) {

    }

    @Override
    public String toString() {
        String salida = "Equipo\tPtos\tPJ\tPG\tPE\tPP\tDG\n";
        for (Nodo q = this.primero; q != null; q = q.getSiguiente()) {
            salida += q.toString() + "\n";
        }
        return salida;
    }

    public void limpiarGrupo() {
        primero = null;
    }
}
