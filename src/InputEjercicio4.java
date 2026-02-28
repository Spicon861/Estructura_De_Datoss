//Ejercicio 4 — Perfil de usuario
//Pide al usuario los datos de su perfil: 
// nombre, edad, ciudad, correo y si acepta términos y condiciones. 
// Muestra un resumen indicando el tipo de dato que se usó para cada campo.

//Datos de entrada: String, int, String, String, boolean
public class InputEjercicio4 {
    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea pendiente
        System.out.println("Ingrese su ciudad: ");
        String ciudad = sc.nextLine();
        System.out.println("Ingrese su correo: ");
        String correo = sc.nextLine();
        System.out.println("¿Acepta términos y condiciones? (true/false): ");
        boolean aceptaTerminos = sc.nextBoolean();

        System.out.println("\n=== Resumen del Perfil ===");
        System.out.println("Nombre: " + nombre + " (String)");
        System.out.println("Edad: " + edad + " (int)");
        System.out.println("Ciudad: " + ciudad + " (String)");
        System.out.println("Correo: " + correo + " (String)");
        System.out.println("Acepta Términos y Condiciones: " + aceptaTerminos + " (boolean)");
        
    }
}

