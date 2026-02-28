//Ejercicio 5 — Calculadora de IMC
//Pide nombre, peso en kg y altura en metros. Calcula el IMC y clasifícalo.

//Fórmula: IMC = peso / (altura × altura)

//Clasificación:

//IMC < 18.5 → Bajo peso
//18.5 ≤ IMC < 25 → Normal
//25 ≤ IMC < 30 → Sobrepeso
//IMC ≥ 30 → Obesidad
//Datos de entrada: String nombre, double peso, double altura


public class InputEjercicio5 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su peso en kg: ");
        double peso = sc.nextDouble();
        System.out.println("Ingrese su altura en metros: ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura); // Calculamos el IMC
        System.out.println("Nombre: " + nombre);
        System.out.println("IMC: " + imc);

        if(imc < 18.5){
            System.out.println("Clasificación: Bajo peso");
        } else if(imc >= 18.5 && imc < 25){
            System.out.println("Clasificación: Normal");
        } else if(imc >= 25 && imc < 30){
            System.out.println("Clasificación: Sobrepeso");
        } else {
            System.out.println("Clasificación: Obesidad");
        }
    }
    
}
