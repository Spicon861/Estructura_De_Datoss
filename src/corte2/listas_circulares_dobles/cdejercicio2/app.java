package corte2.listas_circulares_dobles.cdejercicio2;
//2. Historial de Comandos de Terminal
//Los terminales guardan un historial de comandos. Al presionar flecha arriba el usuario retrocede al comando anterior; flecha abajo avanza al más reciente. El historial es circular: después del más antiguo vuelve al más nuevo.

//La Clase Comando (Nodo): Debe contener texto (String), exitoso (boolean — si ejecutó sin errores) y directorio (String — el path desde donde se ejecutó).
//El Problema: El historial mantiene un puntero cursor al comando que se está consultando. Navegar con "arriba" mueve el cursor al anterior (anterior); "abajo" lo mueve al siguiente (siguiente). El usuario puede eliminar el comando actual (para borrar contraseñas escritas por error), y el cursor pasa automáticamente al siguiente.
//Reto: Implementa los métodos arriba(), abajo(), mostrarCursor() y eliminarActual(). Simula: agrega 5 comandos, navega 3 veces hacia arriba, elimina el comando actual, navega una vez hacia abajo y muestra el historial completo con el cursor marcado.
public class app {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metro metro = new Metro();
        int opcion;

        do {
            System.out.println("\n==============================================");
            System.out.println("   Historial Comandos Terminal — Menú Principal");
            System.out.println("==============================================");
            System.out.println("1. Agregar comandos");
            System.out.println("2. Navegar Arriba");
            System.out.println("3. Navegar Abajo");
            System.out.println("4. Eliminar Comando Actual");
            System.out.println("5. Mostrar Cursor Actual");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (opcion) {
                case 1:
                    System.out.println("--- Agregar Comandos al Historial ---");
                    System.out.print("Texto del comando: ");
                    String texto = sc.nextLine();
                    System.out.print("¿Fue exitoso? (true/false): ");
                    boolean exitoso = sc.nextBoolean();
                    sc.nextLine(); // Consumir el salto de línea
                    System.out.print("Directorio: ");
                    String directorio = sc.nextLine();
                    metro.agregarComando(texto, exitoso, directorio);
                    System.out.println("Comando agregado al historial.");
                    break;

                case 2:
                    metro.arriba();
                    System.out.println("Cursor movido hacia arriba.");
                    break;

                case 3:
                    metro.abajo();
                    System.out.println("Cursor movido hacia abajo.");
                    break;

                case 4:
                    metro.eliminarActual();
                    System.out.println("Comando actual eliminado.");
                    break;

                case 5:
                    metro.mostrarCursor();
                    break;
                
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        sc.close();
    
    }

    
}
