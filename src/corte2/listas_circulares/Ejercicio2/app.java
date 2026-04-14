package corte2.listas_circulares.Ejercicio2;
//2. Carrusel de Anuncios (Pantalla Digital)
//Una tienda tiene una pantalla que muestra anuncios en rotación continua. Cuando termina el
//último anuncio, vuelve automáticamente al primero.
//La Clase Anuncio (Nodo): Debe contener titulo (String), duracionSegundos (int),
//vecesRepetido (int) y categoria (String - ej: “Oferta”, “Marca”, “Evento”).
//El Problema: La pantalla necesita saber cuánto tiempo total lleva encendida y cuál es el
//anuncio que más veces se ha repetido.
//Reto: Implementa el método reproducir(int ciclos) que simule ciclos pasadas
//completas por todos los anuncios, incrementando vecesRepetido en cada paso e
//imprimiendo qué anuncio está en pantalla. Al finalizar, muestra el anuncio más repetido y el
//tiempo total acumulado en pantalla.
public class app {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        anuncio anuncio = new anuncio();
        colaAnuncio colaAnuncio = null;

        do {
            System.out.println("\n==============================================");
            System.out.println("   Carrusel de Anuncios — Menú Principal");
            System.out.println("==============================================");
            System.out.println("  [1] Agregar Anuncio");
            System.out.println("  [2] Reproducir Anuncios");
            System.out.println("  [3] Mostrar Anuncio Más Repetido y Tiempo Total");
            System.out.println();
            System.out.println("  [0] Salir");
            System.out.println("==============================================");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    System.out.println("--- Agregar Nuevo Anuncio ---");
                    System.out.print("Ingrese el título del anuncio: ");
                    sc.nextLine(); // Consumir el salto de línea
                    String titulo = sc.nextLine();
                    System.out.print("Ingrese la duración en segundos: ");
                    int duracion = sc.nextInt();
                    System.out.print("Ingrese la categoría del anuncio: ");
                    sc.nextLine(); // Consumir el salto de línea
                    String categoria = sc.nextLine();
                    anuncio nuevoAnuncio = new anuncio(titulo, duracion, categoria);
                    colaAnuncio.agregarAnuncio(nuevoAnuncio);
                    break;

                case 2:
                    System.out.println("--- Reproduciendo Anuncios ---");
                    colaAnuncio.reproducirAnuncios();
                    break;

                case 3:
                    colaAnuncio.mostrarAnuncioMasRepetidoYTiempoTotal();
                    break;

                case 0:
                    System.out.println("¡Saliendo del módulo de Listas Dobles!");
                    break;
               
            }

        } while (opcion != 0);

        sc.close();
    }
    
}
