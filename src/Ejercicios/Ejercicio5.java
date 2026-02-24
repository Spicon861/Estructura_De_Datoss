package Ejercicios;
public class Ejercicio5 {
    //Ejercicio 5 — Conversor de unidades
//Una aplicación de cocina necesita convertir unidades:

//Declara una variable tazas (double) con la cantidad de tazas de un ingrediente.
//Convierte a mililitros (1 taza = 236.588 ml) y guarda el resultado en otra variable.
//Convierte también a litros.
//Muestra las tres medidas por consola.
    public static void main(String[] args) {
        double tazasIngrediente = 10;
        double CONSTANTE_CONVERSION = 236.588; // 1 taza = 236.588 mililitros
        double cantidadLitros  = (tazasIngrediente * CONSTANTE_CONVERSION) / 1000; // Convertir a litros
        double cantidadMililitros = tazasIngrediente * CONSTANTE_CONVERSION;
        System.out.println("Cantidad de tazas: " + tazasIngrediente);
        System.out.println("Cantidad en litros: " + cantidadLitros);
        System.out.println("Cantidad en mililitros: " + cantidadMililitros);
        
    }
}
