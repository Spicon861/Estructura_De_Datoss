package Ejercicios;
public class Ejercicio2 {
    //Ejercicio 2 — Calculadora de una tienda
//Una tienda de barrio vende productos al por menor. El cajero necesita calcular:

//Precio unitario de un producto (double)
//Cantidad comprada (int)
//Descuento aplicado en porcentaje (double)
//Total a pagar después del descuento
//Declara las variables, realiza el cálculo y muestra el resultado por consola.


    public static void main(String[] args) {
        double precioUnitarioProducto = 1.99;
        int cantidadComprada = 5;
        double descuentoAplicado = 0.10; // 10% de descuento
        double totalConDescuento = precioUnitarioProducto * cantidadComprada * (descuentoAplicado);
        System.out.println("=== Detalles de la Compra ===");
        System.out.println("Precio Unitario: $" + precioUnitarioProducto);
        System.out.println("Cantidad Comprada: " + cantidadComprada);
        System.out.println("Descuento Aplicado: " + (descuentoAplicado * 100) + "%");
        System.out.println("Total con Descuento: $" + totalConDescuento);
    
    }
}
