package corte2.listas_enlazadas.Ejercicio3;
import java.util.Scanner;
//3. Torre de Control (Aterrizajes de Emergencia)
//Simula la cola de aviones esperando para aterrizar en un aeropuerto congestionado.

//La Clase Vuelo (Nodo): Debe contener numeroVuelo (String), aerolinea (String), combustibleRestante (int) y pasajeros (int).
//El Problema: Normalmente los vuelos se forman al final de la cola. Sin embargo, si un vuelo reporta menos de 10 unidades de combustible, debe ser movido inmediatamente al inicio de la lista (Cabeza).
//Reto: Implementar el método reportarEmergencia(String numeroVuelo) que busque un vuelo en la cola y lo mueva al principio.
public class App {
    public static void main(String[] args) {
        Scanner ssc = new Scanner(System.in);
        int opcion;

        ColaVuelos colaVuelos = new ColaVuelos();
        do {
            System.out.println("1. Agregar vuelo");
            System.out.println("2. Reportar emergencia");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = ssc.nextInt();
            ssc.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el número de vuelo: ");
                    String numeroVuelo = ssc.nextLine();
                    System.out.print("Ingrese la aerolínea: ");
                    String aerolinea = ssc.nextLine();
                    System.out.print("Ingrese el combustible restante: ");
                    int combustibleRestante = ssc.nextInt();
                    System.out.print("Ingrese el número de pasajeros: ");
                    int pasajeros = ssc.nextInt();
                    ssc.nextLine(); // Limpiar el buffer

                    vuelo nuevoVuelo = new vuelo(numeroVuelo, aerolinea, combustibleRestante, pasajeros);
                    colaVuelos.agregarVuelo(nuevoVuelo);
                    break;
                case 2:
                    System.out.print("Ingrese el número de vuelo para reportar emergencia: ");
                    String numeroVueloEmergencia = ssc.nextLine();
                    colaVuelos.reportarEmergencia(numeroVueloEmergencia);
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 3);
        ssc.close();
    }


    
}
