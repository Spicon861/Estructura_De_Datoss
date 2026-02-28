//Ejercicio 2 — Conversor de temperatura
//Pide al usuario una temperatura en Celsius y conviértela a Fahrenheit y Kelvin.

//Fórmulas

//F = (C × 9/5) + 32
//K = C + 273.15
//Dato de entrada: double temperatura en Celsius
public class InputEjercicio2 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Ingrese la temperatura en Celsius: ");
        double temperaturaCelsius = sc.nextDouble();

        double temperaturaFahrenheit = (temperaturaCelsius * 9/5) + 32; // Convertir a Fahrenheit
        double temperaturaKelvin = temperaturaCelsius + 273.15; // Convertir a Kelvin

        System.out.println("Temperatura en Celsius: " + temperaturaCelsius + "°C");
        System.out.println("Temperatura en Fahrenheit: " + temperaturaFahrenheit + "°F");
        System.out.println("Temperatura en Kelvin: " + temperaturaKelvin + "K");
    }
}
