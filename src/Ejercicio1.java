package Ejercicios;
public class Ejercicio1 {
  //Ejercicio 1 — Ficha de un estudiante
//Un sistema universitario necesita registrar la información básica de un estudiante: nombre completo, código (número entero), semestre actual, promedio acumulado y si está matriculado o no.

//Declara las variables con los tipos de datos apropiados.
//Asigna valores de ejemplo.
//Imprime un reporte por consola con el siguiente formato:
//=== Ficha Del Estudiante ===
//
     public static void main(String[] args) {
       String nombreEstudiante = "Sebastian Picon Silva";
       int codigoEstudiante = 123456789;
       int semestreActual = 3;
       double promedioAcomulado = 4.5;
       boolean matriculado = true;
       System.out.println("=== Ficha Del Estudiante ===");
       System.out.println("Nombre: " + nombreEstudiante);
       System.out.println("Código: " + codigoEstudiante);
       System.out.println("Semestre Actual: " + semestreActual);
       System.out.println("Promedio Acumulado: " + promedioAcomulado);
       System.out.println("Matriculado: " + matriculado);
       
    }
}