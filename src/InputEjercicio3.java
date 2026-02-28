//Ejercicio 3 — Promedio de notas
//Pide al usuario su nombre y 4 notas de un curso. 
// Calcula el promedio y determina si aprobó (promedio >= 3.0).

//Datos de entrada

//String nombre
//double nota1, nota2, nota3, nota4
public class InputEjercicio3 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        double sumaNotas = 0;
        for(int i=1; i <= 4; i++){
        System.out.println("Ingrese la nota " + i + ": ");
        double nota = sc.nextDouble();
        sumaNotas = sumaNotas + nota;

    }
    double promedio = sumaNotas / 4;
    System.out.println("Nombre: " + nombre);
    System.out.println("Promedio: " + promedio);
    if(promedio >= 3.0){
        System.out.println("Aprobado");
    } else {
        System.out.println("Reprobado");
    }
    
    };
}
