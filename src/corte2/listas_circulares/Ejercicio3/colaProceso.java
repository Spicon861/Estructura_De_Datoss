package corte2.listas_circulares.Ejercicio3;
import java.util.List;

public class colaProceso {
    proceso cabeza;
    proceso cola;

    int quantum = 2; //en segundos

    List<proceso> ordenTerminacion;

    public colaProceso() {
        this.cabeza = null;
        this.cola = null;
        this.ordenTerminacion = new ArrayList<>();
    }

    public void agregarProceso(proceso nuevoProceso) {
        if (cabeza == null) {
            cabeza = nuevoProceso;
            cola = nuevoProceso;
            nuevoProceso.siguiente = nuevoProceso; 
            nuevoProceso.anterior = nuevoProceso; 
        } else {
            nuevoProceso.anterior = cola; 
            nuevoProceso.siguiente = cabeza; 
            cola.siguiente = nuevoProceso; 
            cabeza.anterior = nuevoProceso; 
            cola = nuevoProceso; 
        }
    }

    public void ejecutar(){
        if(cabeza == null) {
            System.out.println("No hay procesos para ejecutar.");
            return;
        }
        proceso actual = cabeza;
        do{
            System.out.println("Ejecutando proceso: " + actual.nombre + " (PID: " + actual.pid + ", Prioridad: " + actual.prioridad + ")");
            if(actual.tiempoRestante > quantum) {
                actual.tiempoRestante -= quantum;
                System.out.println("Tiempo restante del proceso " + actual.nombre + ": " + actual.tiempoRestante + " segundos.");
            } else {
                ordenTerminacion.add(actual);
                System.out.println("Proceso " + actual.nombre + " ha terminado.");
                if (actual == cabeza && actual == cola) {
                    cabeza = null;
                    cola = null;
                } else {
                    actual.anterior.siguiente = actual.siguiente;
                    actual.siguiente.anterior = actual.anterior;
                    if (actual == cabeza) {
                        cabeza = actual.siguiente;
                    }
                    if (actual == cola) {
                        cola = actual.anterior;
                    }
                }
            }
            actual = actual.siguiente;
        }
        while(cabeza != null);
        
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
