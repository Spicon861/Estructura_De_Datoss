/*4. Galería de Fotos
Una app de galería muestra las fotos de un álbum de una en una. 
El usuario puede pasar a la foto siguiente, volver a la anterior, y marcar cualquier foto como favorita. 
Al eliminar una foto, la galería continúa desde la siguiente sin interrupciones.

La Clase Foto (Nodo): Debe contener titulo (String), fecha (String) y esFavorita (boolean).
El Problema: La galería mantiene un puntero actual a la foto que se está viendo. Navegar con "siguiente" o "anterior"
mueve ese puntero. Marcar como favorita simplemente alterna el campo esFavorita de la foto actual.
Eliminar la foto actual desconecta el nodo en O(1) y mueve actual a la siguiente.
Reto: Implementa los métodos siguiente(), anterior(), toggleFavorita(), eliminarActual() y mostrarGaleria(). 
mostrarGaleria() recorre todas las fotos marcando con [★] las favoritas y con [▶] la foto actual. 
Simula: carga 5 fotos, avanza dos veces, marca la actual como favorita, retrocede una, 
elimina esa foto y muestra el estado final de la galería. */

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner sc = new Scanner(null);
        Metro metro = new Metro();
        int opcion;
        do {
            System.out.println("\n==============================================");
            System.out.println("   Galería de Fotos — Menú Principal");
            System.out.println("==============================================");
            System.out.println("1. Agregar foto");
            System.out.println("2. Siguiente foto");
            System.out.println("3. Foto anterior");
            System.out.println("4. Alternar favorita en foto actual");
            System.out.println("5. Eliminar foto actual");
            System.out.println("6. Mostrar galería completa");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (opcion) {
                case 1:
                    System.out.println("--- Agregar Nueva Foto ---");
                    System.out.print("Título de la foto: ");
                    String titulo = sc.nextLine();
                    System.out.print("Fecha (dd/mm/yyyy): ");
                    String fecha = sc.nextLine();
                    metro.agregarFoto(titulo, fecha);
                    System.out.println("Foto '" + titulo + "' agregada.");
                    break;
                case 2:
                    metro.siguiente();
                    System.out.println("Mostrando siguiente foto.");
                    break;
                case 3:
                    metro.anterior();
                    System.out.println("Mostrando foto anterior.");
                    break;
                case 4:
                    metro.toggleFavorita();
                    System.out.println("Favorita de foto actual alternada.");
                    break;
                case 5:
                    metro.eliminarActual();
                    System.out.println("Foto actual eliminada.");
                    break;
                case 6:
                    metro.mostrarGaleria();
                    break;
                case 0:
                    System.out.println("¡Saliendo del módulo de Listas Dobles!");
                    break;
               
            }
        } while (opcion != 0);
        sc.close();

    }
    
}
