package corte2.listas_circulares.CEjercicio3;
public class proceso {
    String nombre;
    int pid;
    int tiempoRestante;
    int prioridad;

    proceso siguiente;
    public proceso(String nombre, int pid, int tiempoRestante, int prioridad) {
        this.nombre = nombre;
        this.pid = pid;
        this.tiempoRestante = tiempoRestante;
        this.prioridad = prioridad;
        this.siguiente = null;
    }
    
}
