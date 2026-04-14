package corte2.listas_circulares.Ejercicio3;
import java.util.Scanner;
//3. Planificador de CPU (Algoritmo Round Robin)
//Los sistemas operativos usan el algoritmo Round Robin para repartir el tiempo del procesador
//entre varios procesos de forma justa: cada proceso recibe un pequeño intervalo de tiempo
//llamado quantum. Si no termina, espera su siguiente turno.
//La Clase Proceso (Nodo): Debe contener nombre (String), pid (int), tiempoRestante (int) y
//prioridad (int - del 1 al 3).
//El Problema: El planificador debe recorrer la lista circular en bucle. En cada turno, descuenta
//el quantum del tiempoRestante del proceso actual. Cuando tiempoRestante <= 0 , el
//proceso termina y se elimina de la lista.
//Reto: Implementa el método ejecutar(int quantum) que simule el planificador. Imprime en
//cada turno cuál proceso se está ejecutando, cuánto tiempo le queda y si terminó. El ciclo
//debe terminar cuando la lista quede vacía. Al final, imprime el orden en que terminaron los
//procesos.

public class app {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int opcion;
            Proceso proceso = new Proceso();
            ColaProcesos colaProcesos = null;
    
            do {
                System.out.println("\n==============================================");
                System.out.println("   Planificador de CPU — Menú Principal");
                System.out.println("==============================================");
                System.out.println("  [1] Agregar Proceso");
                System.out.println("  [2] Ejecutar Planificador");
                System.out.println("  [3] Mostrar Orden de Terminación");
                System.out.println();
                System.out.println("  [0] Salir");
                System.out.println("==============================================");
                System.out.print("Elige una opción: ");
    
                opcion = sc.nextInt();
                System.out.println();
    
                switch (opcion) {
                    case 1:
                        System.out.println("--- Agregar Nuevo Proceso ---");
                        System.out.print("Ingrese el nombre del proceso: ");
                        sc.nextLine(); // Consumir el salto de línea
                        String nombre = sc.nextLine();
                        System.out.print("Ingrese el PID del proceso: ");
                        int pid = sc.nextInt();
                        System.out.print("Ingrese el tiempo restante en segundos: ");
                        int tiempoRestante = sc.nextInt();
                        System.out.print("Ingrese la prioridad del proceso (1-3): ");
                        int prioridad = sc.nextInt();
                        Proceso nuevoProceso = new Proceso(nombre, pid, tiempoRestante, prioridad);
                        colaProcesos.agregarProceso(nuevoProceso);
                        break;
    
                    case 2:
                        System.out.println("--- Ejecutando Planificador ---");
                        colaProcesos.ejecutar(quantum);
                        break;
    
                    case 3:
                        colaProcesos.mostrarOrdenTerminacion();
                        break;
    
                    case 0:
                        System.out.println("¡Saliendo del módulo de Listas Dobles!");
                        break;
    
                    default:
                        System.out.println("Opción no válida. Intente nuevamente.");
                }
            } while (opcion != 0);
            sc.close();
    }
    
}
