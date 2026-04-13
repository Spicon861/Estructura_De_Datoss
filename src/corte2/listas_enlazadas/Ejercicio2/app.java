package corte2.listas_enlazadas.Ejercicio2;
import java.util.Scanner;
//2. Inventario de Alimentos (Control de Caducidad)
//Un supermercado necesita gestionar su estante de lácteos. Los productos que vencen más pronto deben colocarse al principio para ser vendidos primero.

//La Clase Producto (Nodo): Debe contener nombre (String), cantidad (int) y diasParaVencer (int).
//El Problema: Si llega un producto que vence en menos de 3 días, debe insertarse al inicio de la lista (prioridad de venta). Si vence en más tiempo, se pone al final.
//Reto: Crea un método que imprima solo los productos que tienen menos de 5 días para vencer.
public class app {

    public static void main(String[] args) {

        Scanner scc = new Scanner(System.in);
        int opcion;

        inventario inventario = new inventario();
        do {
            System.out.println("1. Agregar producto");
            System.out.println("2. Imprimir productos próximos a vencer");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scc.nextInt();
            scc.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = scc.nextLine();
                    System.out.print("Ingrese la cantidad: ");
                    int cantidad = scc.nextInt();
                    System.out.print("Ingrese los días para vencer: ");
                    int diasParaVencer = scc.nextInt();
                    scc.nextLine(); // Limpiar el buffer

                    producto nuevoProducto = new producto(nombre, cantidad, diasParaVencer);
                    inventario.agregarProducto(nuevoProducto);
                    break;
                case 2:
                    inventario.imprimirProductosProximosAVencer();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 3);
        scc.close();
    }

    
}
