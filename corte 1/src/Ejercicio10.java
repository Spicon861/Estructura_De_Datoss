//Ejercicio 10 — Copiando configuración
//Una app tiene un objeto int[] configuracion = {1920, 1080, 60} (resolución y FPS).

//Crea una copia real del arreglo (no una referencia) usando un nuevo arreglo y copiando elemento por elemento.
//Modifica la copia y demuestra que el original no cambia.
//Comenta la diferencia con la asignación directa.
public class Ejercicio10 {
    

public static void main(String[] args) {
    int[] configuracion = {1920, 1080, 60}; // Arreglo original con la configuración de la app
    int[] copiaConfiguracion = new int[configuracion.length]; // Creamos un nuevo arreglo para la copia

    // Copiamos elemento por elemento del arreglo original al nuevo arreglo
    for (int i = 0; i < configuracion.length; i++) {
        copiaConfiguracion[i] = configuracion[i];
    }

    // Modificamos la copia
    copiaConfiguracion[0] = 1280; // Cambiamos la resolución horizontal en la copia

    // Mostramos que el arreglo original no cambia
    System.out.println("Configuración original: ");
    for (int i = 0; i < configuracion.length; i++) {
        System.out.print(configuracion[i] + " ");
    }
    System.out.println();

    System.out.println("Copia de configuración: ");
    for (int i = 0; i < copiaConfiguracion.length; i++) {
        System.out.print(copiaConfiguracion[i] + " ");
    }
    System.out.println();

    // Diferencia con la asignación directa:
    // Si hubiéramos hecho int[] copiaConfiguracion = configuracion;, entonces ambos arreglos apuntarían al mismo objeto en memoria. Cualquier cambio en uno afectaría al otro, ya que ambos serían referencias al mismo arreglo. En cambio, al crear un nuevo arreglo y copiar los valores, tenemos dos objetos independientes en memoria, lo que permite modificar uno sin afectar al otro.
}
}
