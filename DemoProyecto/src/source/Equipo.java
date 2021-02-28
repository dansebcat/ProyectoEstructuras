
package source;

/**
 *
 * @author bryan
 */
public class Equipo {
    
    String Nombre;
    private int puntajes;
    private int partidosJugados;
    private int patidosGanados;
    private int partidosPerdidos;
    private int partidosEmpatados;
    private int golesFavor;
    private int golesContra;
    private int diferenciagoles;

    public Equipo(String Nombre) {
        this.Nombre = Nombre;
        this.puntajes = 0;
        this.partidosJugados = 0;
        this.patidosGanados = 0;
        this.partidosPerdidos = 0;
        this.partidosEmpatados = 0;
        this.golesFavor = 0;
        this.golesContra = 0;
        this.diferenciagoles = 0;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getPuntajes() {
        return puntajes;
    }

    public void setPuntajes(int puntajes) {
        this.puntajes = puntajes;
    }

    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    public int getPatidosGanados() {
        return patidosGanados;
    }

    public void setPatidosGanados(int patidosGanados) {
        this.patidosGanados = patidosGanados;
    }

    public int getPartidosPerdidos() {
        return partidosPerdidos;
    }

    public void setPartidosPerdidos(int partidosPerdidos) {
        this.partidosPerdidos = partidosPerdidos;
    }

    public int getPartidosEmpatados() {
        return partidosEmpatados;
    }

    public void setPartidosEmpatados(int partidosEmpatados) {
        this.partidosEmpatados = partidosEmpatados;
    }

    public int getGolesFavor() {
        return golesFavor;
    }

    public void setGolesFavor(int golesFavor) {
        this.golesFavor = golesFavor;
    }

    public int getGolesContra() {
        return golesContra;
    }

    public void setGolesContra(int golesContra) {
        this.golesContra = golesContra;
    }

    public int getDiferenciagoles() {
        return diferenciagoles;
    }

    public void setDiferenciagoles(int diferenciagoles) {
        this.diferenciagoles = diferenciagoles;
    }

    @Override
    public String toString() {
        String salida=Nombre+"\t"+puntajes+"\t"+partidosJugados+"\t"+patidosGanados+"\t"+partidosEmpatados+"\t"+
                partidosPerdidos+"\t"+diferenciagoles;
        return salida;
    }
    
    

    
    
    
}

