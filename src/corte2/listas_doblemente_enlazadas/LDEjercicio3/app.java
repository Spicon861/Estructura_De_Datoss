package corte2.listas_soblemente_enlazadas.Ejercicio3;
//3. Navegación de Pestañas de Navegador
//Imagina un navegador donde puedes moverte entre pestañas abiertas.

import java.util.Scanner;

//La Clase Pestana (Nodo): Debe contener tituloPagina (String), url (String) y horaApertura (String).
//El Problema: Las pestañas se abren una tras otra. A veces el usuario quiere cerrar la pestaña actual y el foco debe pasar a la pestaña anterior.
//Reto: Implementar el método cerrarPestanaActual(String url) que busque la pestaña por URL, la elimine de la lista y reconecte el nodo anterior con el siguiente correctamente (¡Cuidado con la Cabeza y la Cola!).
public class app {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int opcion;

    colaPestana colaPestanas = new colaPestana();
    do {
        System.out.println("1. Agregar Pestaña");
        System.out.println("2. Cerrar Pestaña Actual");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
        opcion = sc.nextInt();
        sc.nextLine(); 

        switch (opcion) {
            case 1:
                System.out.print("Ingrese el título de la página: ");
                String tituloPagina = sc.nextLine();
                System.out.print("Ingrese la URL: ");
                String url = sc.nextLine();
                System.out.print("Ingrese la hora de apertura: ");
                String horaApertura = sc.nextLine();

                colaPestanas.agregarPestana(tituloPagina, url, horaApertura);
                break;
            case 2:
                System.out.print("Ingrese la URL de la pestaña a cerrar: ");
                String urlCerrar = sc.nextLine();
                colaPestanas.cerrarPestanaActual(urlCerrar);
                colaPestanas.mostrarPestanasEnOrden();
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