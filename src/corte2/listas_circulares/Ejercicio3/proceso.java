package corte2.listas_circulares.Ejercicio3;
public class proceso {
    String nombre;
    int pid;
    int tiempoRestante;
    int prioridad;

    proceso siguiente;
    proceso anterior;
    public proceso(String nombre, int pid, int tiempoRestante, int prioridad) {
        this.nombre = nombre;
        this.pid = pid;
        this.tiempoRestante = tiempoRestante;
        this.prioridad = prioridad;
        this.siguiente = null;
        this.anterior = null;
    }
    
}
