package corte2.listas_enlazadas.Ejercicio4;
//4. Monitoreo Industrial (Sensores en Tiempo Real)
//Una planta química registra lecturas de sus tanques cada hora en una lista enlazada para auditoría.

//La Clase Lectura (Nodo): Debe contener idSensor (int), temperatura (double), presion (double) y hora (String).
//El Problema: Las lecturas se van agregando al inicio para que la más reciente sea siempre la primera que vea el supervisor.
//Reto: Implementa un método que busque y muestre la lectura con la temperatura más alta registrada en el historial.

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        ColaLectura cola = new ColaLectura();
        do {
            System.out.println("1. Agregar lectura");
            System.out.println("2. Mostrar lectura con temperatura más alta");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el ID del sensor: ");
                    int idSensor = sc.nextInt();
                    System.out.print("Ingrese la temperatura: ");
                    double temperatura = sc.nextDouble();
                    System.out.print("Ingrese la presión: ");
                    double presion = sc.nextDouble();
                    sc.nextLine(); // Limpiar el buffer
                    System.out.print("Ingrese la hora (HH:mm): ");
                    String hora = sc.nextLine();
                    sc.close();
                    cola.agregarLectura(idSensor, temperatura, presion, hora);
                    break;
                case 2:
                    Lectura lecturaMasAlta = cola.obtenerLecturaMasAlta();
                    if (lecturaMasAlta != null) {
                        System.out.println("Lectura con temperatura más alta:");
                        System.out.println("ID Sensor: " + lecturaMasAlta.idSensor);
                        System.out.println("Temperatura: " + lecturaMasAlta.temperatura);
                        System.out.println("Presión: " + lecturaMasAlta.presion);
                        System.out.println("Hora: " + lecturaMasAlta.hora);
                    } else {
                        System.out.println("No hay lecturas registradas.");
                    }
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 3);
       sc.close();
    }
    
}
