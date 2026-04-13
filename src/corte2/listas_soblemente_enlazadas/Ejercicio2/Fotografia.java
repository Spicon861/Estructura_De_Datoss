package corte2.listas_soblemente_enlazadas.Ejercicio2;
public class Fotografia {
    String nombreArchivo;
    double tamanoMB;
    String resolucion;
    Fotografia siguiente;
    Fotografia anterior;

    public Fotografia(String nombreArchivo, double tamanoMB, String resolucion) {
        this.nombreArchivo = nombreArchivo;
        this.tamanoMB = tamanoMB;
        this.resolucion = resolucion;
        this.siguiente = null;
        this.anterior = null;
    }
    
}
