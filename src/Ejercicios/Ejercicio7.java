package Ejercicios;
public class Ejercicio7 {
//Ejercicio 7 — Inventario compartido
//Un almacén tiene un arreglo con el stock de 5 productos. El sistema de ventas y el sistema de reportes apuntan al mismo arreglo.

//Crea el arreglo stockAlmacen con valores iniciales.
//Asigna stockReportes = stockAlmacen.
//Simula una venta reduciendo el stock de un producto desde stockReportes.
//Muestra que stockAlmacen también cambió y explica en comentarios por qué.
    public static void main(String[] args) {
        int[] stockAlmacen = {10, 20, 15, 30, 25}; // Valores iniciales del stock del almacén
        int[] stockReportes = stockAlmacen; // Asignamos el mismo arreglo a stockReportes

        System.out.println("Stock inicial del almacén: ");
        for (int i = 0; i < stockAlmacen.length; i++) {
            System.out.print(stockAlmacen[i] + " ");
        }
        System.out.println();

        // Simulamos una venta reduciendo el stock de un producto desde stockReportes
        stockReportes[2] = stockReportes[2] - 5; // Reducimos el stock del producto en la posición 2

        System.out.println("Stock del almacén después de la venta: ");
        for (int i = 0; i < stockAlmacen.length; i++) {
            System.out.print(stockAlmacen[i] + " ");
        }
        System.out.println();

    }
}