package corte1.arrays_y_ordenamiento;
//3. El Salto de Shell (Optimización de Datos)
//Algoritmo obligatorio: Ordenamiento Shell (Shell Sort)

//Contexto: Una empresa de logística maneja paquetes con diferentes pesos y necesita ordenarlos de forma más eficiente que el método de burbuja o inserción simple.
//Detalle del ejercicio: Solicita al usuario el peso de N paquetes (se recomienda probar con al menos 10 para notar el efecto).
//Lógica de Shell: Implementa el algoritmo usando el salto (gap) inicial de 
//N
///
//2
//. El estudiante debe explicar en comentarios por qué este método es generalmente más rápido que la inserción simple al trabajar con elementos que están muy lejos de su posición final.
//Resultado esperado: Mostrar el arreglo original y el arreglo final ordenado después de aplicar todas las fases de reducción de saltos.
import java.util.Scanner;

public class Ejercicio3Ordenar {
    public static void ordenar(double[] pesos) {
        int n = pesos.length;
        // Empezar con una brecha grande y reducirla
        for (int brecha = n / 2; brecha > 0; brecha /= 2)
             {
        // Realizar un ordenamiento por inserción para esta brecha
    for (int i = brecha; i < n; i++) {
    double temp = pesos[i];
    int j;
    for (j = i; j >= brecha && pesos[j - brecha] > temp; j -= brecha)
         {
    pesos[j] = pesos[j - brecha];
         }
    pesos[j] = temp;
    }
         }
 }

public static void main(String[] args) {
        Scanner Scaner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de paquetes: ");
        int numPaquetes = Scaner.nextInt();
        double[] pesos = new double[numPaquetes];
        for(int i=0; i < numPaquetes; i++){
            System.out.println("Ingrese el peso del paquete " + (i+1) + ": ");
            pesos[i] = Scaner.nextDouble();
        }
        Scaner.close();
        // Mostrar el arreglo original
        System.out.println("Arreglo original de pesos:");
        for(int i=0; i < pesos.length; i++){
            System.out.print(pesos[i] + " ");
        }
        System.out.println();
        
        ordenar(pesos);
        // Mostrar el arreglo ordenado
        System.out.println("Arreglo ordenado de pesos:");
        for(int i=0; i < pesos.length; i++){
            System.out.print(pesos[i] + " ");
        }
        System.out.println();
    }
}

