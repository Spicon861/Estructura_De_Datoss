/*3. Editor de Capas (Diseño Gráfico)
Los editores gráficos organizan el diseño en capas. 
El usuario navega a la capa superior (siguiente) o inferior (anterior) y
puede ocultar o mostrar cada capa. La estructura es circular: después de la capa más alta vuelve a la más baja.

La Clase Capa (Nodo): Debe contener nombre (String), visible (boolean) y tipo (String — "fondo", "objeto", "texto").
El Problema: El editor mantiene un puntero capaActiva a la capa seleccionada. El usuario puede moverse entre capas,
alternar la visibilidad de la activa y eliminarla (el foco pasa a la siguiente).
Reto: Implementa los métodos subirCapa(), bajarCapa(), toggleVisibilidad(), eliminarActiva() y mostrarCapas(). 
mostrarCapas() imprime todas las capas marcando la activa con [✓] e indicando si cada una es visible. Simula: crea 4 capas,
activa la del medio, sube una vez, oculta la activa, elimínala y muestra el estado final.  */

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metro metro = new Metro();
        int opcion;

        do {
            System.out.println("\n==============================================");
            System.out.println("   Editor de Capas — Menú Principal");
            System.out.println("==============================================");
            System.out.println("1. Agregar capa");
            System.out.println("2. Subir capa");
            System.out.println("3. Bajar capa");
            System.out.println("4. Alternar visibilidad de capa activa");
            System.out.println("5. Eliminar capa activa");
            System.out.println("6. Mostrar capas");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (opcion) {
                case 1:
                    System.out.println("--- Agregar Nueva Capa ---");
                    System.out.print("Nombre de la capa: ");    
                    String nombre = sc.nextLine();
                    System.out.print("¿Es visible? (true/false): ");
                    boolean visible = sc.nextBoolean();
                    sc.nextLine(); // Consumir el salto de línea
                    System.out.print("Tipo de capa (fondo/objeto/texto): ");
                    String tipo = sc.nextLine();
                    metro.agregarCapa(nombre, visible, tipo);
                    System.out.println("Capa '" + nombre + "' agregada.");
                    break;
                case 2:
                    metro.subirCapa();
                    System.out.println("Capa activa movida hacia arriba.");
                    break;
                case 3:
                    metro.bajarCapa();
                    System.out.println("Capa activa movida hacia abajo.");
                    break;
                case 4:
                    metro.toggleVisibilidad();
                    System.out.println("Visibilidad de capa activa alternada.");
                    break;
                case 5:
                    metro.eliminarActiva();
                    System.out.println("Capa activa eliminada.");
                    break;
                case 6:
                    metro.mostrarCapas();
                    break;
                case 0:
                    System.out.println("¡Saliendo del módulo de Listas Dobles!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
        }
sc.close();
     }
    }

    
}
