
//1. El Podio de la Competencia
//Algoritmo obligatorio: Ordenamiento por Selección (Selection Sort)

//Contexto: Se ha realizado una carrera de 100 metros planos y el comité olímpico necesita determinar quiénes ganaron las medallas.
//Detalle del ejercicio: El programa debe solicitar primero cuántos corredores participaron (ej. 5 a 10). Luego, debe pedir el tiempo en segundos (con decimales) de cada corredor.
//Lógica de Selección: El algoritmo debe buscar el tiempo más bajo (el más rápido) en cada iteración y colocarlo al inicio.
//Resultado esperado: El programa debe imprimir el arreglo totalmente ordenado y, adicionalmente, mostrar un mensaje claro indicando quién obtuvo el Oro (1er lugar), Plata (2do lugar) y Bronce (3er lugar).
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner Scaner = new Scanner(System.in);
        Scaner.close();
        System.out.println("Ingrese el número de corredores (entre 5 y 10): ");
        int numCorredores = Scaner.nextInt();
        while(numCorredores < 5 || numCorredores > 10){
            System.out.println("Número de corredores inválido. Por favor, ingrese un número entre 5 y 10: ");
            numCorredores = Scaner.nextInt();
        }
        double[] tiempos = new double[numCorredores];
        for(int i=0; i < numCorredores; i++){
            System.out.println("Ingrese el tiempo del corredor " + (i+1) + " en segundos: ");
            tiempos[i] = Scaner.nextDouble();
        }
        //Ordenamiento por Selección
        for(int i=0; i < tiempos.length - 1; i++){
            int indiceMinimo = i;
            for(int j=i+1; j < tiempos.length; j++){
                if(tiempos[j] < tiempos[indiceMinimo]){
                    indiceMinimo = j;
                }
            }
            // Intercambiar el elemento mínimo con el primer elemento
            double temp = tiempos[i];
            tiempos[i] = tiempos[indiceMinimo];
            tiempos[indiceMinimo] = temp;
        }
        // Mostrar los tiempos ordenados
        System.out.println("Tiempos ordenados (de menor a mayor):");
        for(int i=0; i < tiempos.length; i++){
            System.out.println("Corredor " + (i+1) + ": " + tiempos[i] + " segundos");
        }
        // Mostrar los ganadores
        System.out.println("Ganadores del podio:");
        System.out.println("Oro: Corredor " + (1) + " con tiempo de " + tiempos[0] + " segundos");
        System.out.println("Plata: Corredor " + (2) + " con tiempo de " + tiempos[1] + " segundos");
        System.out.println("Bronce: Corredor " + (3) + " con tiempo de " + tiempos[2] + " segundos");
    }
}
