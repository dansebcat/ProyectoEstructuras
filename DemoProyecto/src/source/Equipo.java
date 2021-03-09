package source;

/**
 *
 * @author bryan
 */
public class Equipo {

    String Nombre;
    private int puntaje;
    private int partidosJugados;
    private int patidosGanados;
    private int partidosPerdidos;
    private int partidosEmpatados;
    private int golesFavor;
    private int golesContra;
    private int diferenciagoles;
    private boolean isSelected;

    public Equipo(String Nombre) {
        this.Nombre = Nombre;
        this.puntaje = 0;
        this.partidosJugados = 0;
        this.patidosGanados = 0;
        this.partidosPerdidos = 0;
        this.partidosEmpatados = 0;
        this.golesFavor = 0;
        this.golesContra = 0;
        this.diferenciagoles = 0;
        isSelected = false;
    }

    public void Gano(int res1, int res2) {
        this.partidosJugados++;
        this.patidosGanados++;
        this.golesFavor += res1;
        this.golesContra += res2;
        this.diferenciagoles = (golesFavor - golesContra);
        this.puntaje += 3;
    }
    
    public void perdio(int res1, int res2){
        this.partidosJugados++;
        this.partidosPerdidos++;
        this.golesFavor+=res1;
        this.golesContra+=res2;
        this.diferenciagoles = (golesFavor-golesContra);
    }
    
    public void empato(int res1, int res2){
        this.partidosJugados++;
        this.partidosEmpatados++;
        this.golesFavor+=res1;
        this.golesContra+=res2;
        this.diferenciagoles = (golesFavor-golesContra);
        this.puntaje++;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getPuntajes() {
        return puntaje;
    }

    public void setPuntajes(int puntajes) {
        this.puntaje = puntajes;
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

    public boolean isIsSelected() {
        return isSelected;
    }

    public void setIsSelected(boolean isSelected) {
        this.isSelected = isSelected;
    }

    @Override
    public String toString() {
        String salida = Nombre + "\t" + puntaje + "\t" + partidosJugados + "\t" + patidosGanados + "\t" + partidosEmpatados + "\t"
                + partidosPerdidos + "\t" + diferenciagoles;
        return salida;
    }

}
