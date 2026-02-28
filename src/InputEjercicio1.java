//Ejercicio 1 — Recibo de compra
//Pide al usuario el nombre de un producto, 
// la cantidad comprada y el precio unitario.
//  Calcula el subtotal, aplica un IVA del 19% 
// y muestra el recibo con el total a pagar.Datos de entrada:

//String nombre del producto
//int cantidad
//double precio unitario
public class InputEjercicio1 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Ingrese el nombre del producto: ");
        String nombreProducto = sc.nextLine();
        System.out.println("Ingrese la cantidad comprada: ");
        int cantidadComprada = sc.nextInt();
        System.out.println("Ingrese el precio unitario: ");
        double precioUnitario = sc.nextDouble();

        double subtotal = cantidadComprada * precioUnitario;
        double iva = subtotal * 0.19; // 19% de IVA
        double totalPagar = subtotal + iva;

        System.out.println("=== Recibo de Compra ===");
        System.out.println("Producto: " + nombreProducto);
        System.out.println("Cantidad: " + cantidadComprada);
        System.out.println("Precio Unitario: $" + precioUnitario);
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("IVA (19%): $" + iva);
        System.out.println("Total a Pagar: $" + totalPagar);
    }
    
}
