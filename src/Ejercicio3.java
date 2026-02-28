    //Ejercicio 3 — Sensor de temperatura
//Un sensor industrial registra temperaturas. El sistema recibe:

//Temperatura actual en Celsius (double)
//Nombre del sensor (String)
//Número de lectura (int)
//Si la temperatura supera el límite de 80°C, una variable boolean llamada enAlarma debe ser true.
//Imprime el estado del sensor con todos sus datos.
public class Ejercicio3 {

public static void main(String[] args) {
        double temperaturaActual = 90;
        String nombreSensor = "Sensor de Temperatura";
        int numeroLectura = 1;
        boolean enAlarma = false;
        if(temperaturaActual > 80) {
            enAlarma = true;
        }
        System.out.println("=== Lectura del Sensor ===");
        System.out.println("Nombre del Sensor: " + nombreSensor);
        System.out.println("Número de Lectura: " + numeroLectura);
        System.out.println("Temperatura Actual: " + temperaturaActual + "°C");
        System.out.println("En Alarma: " + enAlarma);
        
    }
}
