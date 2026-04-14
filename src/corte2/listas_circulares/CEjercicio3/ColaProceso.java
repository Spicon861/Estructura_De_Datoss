package corte2.listas_circulares.CEjercicio3;
import java.util.List;

public class ColaProceso {
    proceso cabeza;
    proceso cola;

    int quantum = 2; //en segundos

    List<proceso> ordenTerminacion;

    public ColaProceso() {
        this.cabeza = null;
        this.cola = null;
        this.ordenTerminacion = new ArrayList<>();
    }

    public void agregarProceso(proceso nuevoProceso) {
        if (cabeza == null) {
            cabeza = nuevoProceso;
            cola = nuevoProceso;
            nuevoProceso.siguiente = nuevoProceso; 
        } else {
            nuevoProceso.siguiente = cabeza; 
            cola.siguiente = nuevoProceso; 
            cola = nuevoProceso; 
        }
    }

    public void ejecutar(){
        if (cabeza == null) {
            System.out.println("No hay procesos para ejecutar.");
            return;
        }
        proceso actual = cabeza;
        while (actual != null) {
            if (actual.tiempoRestante > 0) {
                int tiempoEjecutar = Math.min(quantum, actual.tiempoRestante);
                System.out.println("Ejecutando: " + actual.nombre + " (PID: " + actual.pid + ", Prioridad: " + actual.prioridad + ") por " + tiempoEjecutar + " segundos.");
                actual.tiempoRestante -= tiempoEjecutar;

                if (actual.tiempoRestante <= 0) {
                    System.out.println("Proceso terminado: " + actual.nombre + " (PID: " + actual.pid + ")");
                    ordenTerminacion.add(actual);
                }
            }
            actual = actual.siguiente;
            if (actual == cabeza) break; 
        }
    }
    public void mostrarOrdenTerminacion() {
        if (ordenTerminacion.isEmpty()) {
            System.out.println("No hay procesos terminados para mostrar.");
            return;
        }
        System.out.println("Orden de terminación de procesos:");
        for (proceso p : ordenTerminacion) {
            System.out.println("- " + p.nombre + " (PID: " + p.pid + ", Prioridad: " + p.prioridad + ")");
        }
    }

    
}
