
//2. Organización de Biblioteca Dinámica
//Algoritmo obligatorio: Ordenamiento por Inserción (Insertion Sort)

//Contexto: Un bibliotecario recibe una caja de libros y los va colocando uno a uno en el estante en su posición correcta.
//Detalle del ejercicio: El usuario debe ingresar la cantidad de libros y luego el código ISBN (número entero) de cada uno.
//Lógica de Inserción: A medida que el usuario ingresa un número, o una vez llenado el arreglo, el algoritmo debe simular el proceso de "insertar" el elemento comparándolo con los que ya están a su izquierda.
//Visualización Paso a Paso: En cada ciclo del ordenamiento, el programa debe imprimir cómo va quedando el arreglo (ej: [10, 25, 5, 30] -> [5, 10, 25, 30]). Esto permite al estudiante ver cómo los elementos se desplazan para abrir espacio al nuevo valor.

import java.util.Scanner;

public class Ejercicio2Ordenar {
    public static void main(String[] args) {
        Scanner Scaner = new Scanner(System.in);
        Scaner.close();
        System.out.println("Ingrese la cantidad de libros: ");
        int numLibros = Scaner.nextInt();
        int[] codigosISBN = new int[numLibros];
        for(int i=0; i < numLibros; i++){
            System.out.println("Ingrese el código ISBN del libro " + (i+1) + ": ");
            codigosISBN[i] = Scaner.nextInt();
        }
        //Ordenamiento por Inserción
        for(int i=1; i < codigosISBN.length; i++){
            int clave = codigosISBN[i];
            int j = i - 1;
            // Mover los elementos que son mayores que la clave a una posición adelante
            while(j >= 0 && codigosISBN[j] > clave){
                codigosISBN[j + 1] = codigosISBN[j];
                j--;
            }
            codigosISBN[j + 1] = clave;
            // Mostrar el arreglo después de cada inserción
            System.out.print("Arreglo después de insertar el libro " + (i+1) + ": ");
            for(int k=0; k < codigosISBN.length; k++){
                System.out.print(codigosISBN[k] + " ");
            }
            System.out.println();
        }
    }
    
}
