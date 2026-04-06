//5. Spotify Lite (Lista de Reproducción)
//Crea un reproductor de música simplificado que gestione una lista de canciones.

//La Clase Cancion (Nodo): Debe contener titulo (String), artista (String), duracionSegundos (int) y genero (String).
//El Problema: El usuario puede agregar canciones "A continuación" (insertar después de la actual) o "Al final de la cola".
//Reto: Implementa un método que sume la duración de todas las canciones y muestre el tiempo total de la lista en formato MM:SS.
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        ColaCancion cola = new ColaCancion();
        do {
            System.out.println("1. Agregar canción");
            System.out.println("2. Mostrar duración total de la lista");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el título de la canción: ");
                    String titulo = sc.nextLine();
                    System.out.print("Ingrese el artista: ");
                    String artista = sc.nextLine();
                    System.out.print("Ingrese la duración en segundos: ");
                    int duracionSegundos = sc.nextInt();
                    sc.nextLine(); // Limpiar el buffer
                    System.out.print("Ingrese el género: ");
                    String genero = sc.nextLine();

                    cola.agregarCancion(titulo, artista, duracionSegundos, genero);
                    break;
                case 2:
                    String duracionTotal = cola.obtenerDuracionTotal();
                    System.out.println("Duración total de la lista: " + duracionTotal);
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 3);
    }
    
}
