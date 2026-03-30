//Ejercicio 4 — Placa de un vehículo
//El RUNT almacena datos básicos de vehículos. Modela la información de un carro con:

//Placa (String)
//Año de fabricación (int)
//Cilindraje en cc (int)
//Precio de compra (double)
//Inicial del color (char)
//Si tiene SOAT vigente (boolean)
//Muestra todos los datos en consola.
public class Ejercicio4 {

   public static void main(String[] args) {
    String placaVehiculo = "ABC-123";
    int anoFabricacion = 2010;
    int cilidradaMotor = 2000;
    double precioVehiculo = 15000.00;
    char inicialColorVehiculo = 'R';
    boolean soatVigente = true;
    System.out.println("=== Detalles del Vehículo ===");
    System.out.println("Placa del Vehículo: " + placaVehiculo);
    System.out.println("Año de Fabricación: " + anoFabricacion);
    System.out.println("Cilindrada del Motor: " + cilidradaMotor + " cc");
    System.out.println("Precio del Vehículo: $" + precioVehiculo);
    System.out.println("Inicial del Color del Vehículo: " + inicialColorVehiculo);
    System.out.println("SOAT Vigente: " + soatVigente);
    
   } 
}
