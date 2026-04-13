package corte2.listas_enlazadas.Reto;
import java.util.Scanner;
//Reto 2: Contar los Nodos
//A diferencia de los arreglos, que tienen la propiedad .length,
//  en las listas enlazadas simples por lo general no sabemos
//  la cantidad de elementos a menos que la contemos, o que llevemos una variable contadora.

//Tu misión: Implementa el método public int contarNodos() 
// en tu clase ListaEnlazada. Este método debe recorrer toda la lista, 
// sumando 1 por cada nodo que visite, y retornar el total de elementos. 
// Pruébalo en tu método main insertando diferentes cantidades de elementos y mostrando el resultado por consola.
public class App {
    public static void main(String[] args) {
        
        Scanner scr = new Scanner(System.in);
        int opcion;

        ColaLista colaLista = new ColaLista();
        do {
            System.out.println("1. Agregar Lista");
            System.out.println("2. Imprimir Cantidad Total");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scr.nextInt();
            scr.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el Id de lista: ");
                    int id = scr.nextInt();
                    scr.nextLine(); // Limpiar el buffer
                    colaLista.agregarLista(id);;
                    ;
                    break;
                case 2:
                    System.out.println("Cantidad total: " + colaLista.calcularTotal());
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 3);
        scr.close();
    }
        
    }
    

