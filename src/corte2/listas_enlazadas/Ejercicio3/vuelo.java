package corte2.listas_enlazadas.Ejercicio3;
public class vuelo {
    String numeroVuelo;
    String aerolinea;
    int combustibleRestante;
    int pasajeros;
    
    vuelo siguiente;

    public vuelo(String numeroVuelo, String aerolinea, int combustibleRestante, int pasajeros) {
        this.numeroVuelo = numeroVuelo;
        this.aerolinea = aerolinea;
        this.combustibleRestante = combustibleRestante;
        this.pasajeros = pasajeros;
        this.siguiente = null;
    }
    
}
