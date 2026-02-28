package Ejercicios;

public class Ejercicio9 {
//Ejercicio 9 — Notas de un curso
//Un profesor tiene las notas de 4 estudiantes en un arreglo. El coordinador recibe una referencia al mismo arreglo para revisarlas.

//El coordinador corrige la nota del estudiante 2 (índice 1) de 2.5 a 3.0.
//Muestra que el arreglo del profesor también refleja el cambio.
//Añade comentarios explicando el concepto de referencia en memoria.
public static void main(String[] args) {
    double [] notasProfesor = {3.5, 2.5, 4.0, 3.0}; // Arreglo con las notas de los estudiantes
    double [] notasCoordinador = notasProfesor; 
    notasCoordinador[1] = 3.0; // El coordinador corrige la nota del estudiante 2 (índice 1) de 2.5 a 3.0
    System.out.println("Notas del profesor: " + notasProfesor[1]); // Muestra que el arreglo del profesor también refleja el cambio
}
    
}
