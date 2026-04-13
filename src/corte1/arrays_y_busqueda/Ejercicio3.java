package corte1.arrays_y_busqueda;
//3. Sensor de Temperatura (Control de Calidad)
//Una máquina industrial registra la temperatura cada 10 minutos y 
// guarda los datos en un arreglo.

//El Problema: Al final del día, el supervisor quiere saber cuál
//fue la temperatura más alta registrada para asegurarse de que la máquina no se recalentó.
//Algoritmo a usar: Búsqueda Lineal de Máximo. 
//Debes recorrer todo el arreglo comparando cada valor para encontrar el mayor de todos.
//
public class Ejercicio3 {
    public static void main(String[] args) {
        double[] temperaturas = {75.5, 80.2, 78.9, 82.1, 79.0, 81.3};
        double temperaturaMaxima = temperaturas[0];

        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] > temperaturaMaxima) {
                temperaturaMaxima = temperaturas[i];
            }
        }

        System.out.println("La temperatura más alta registrada es: " + temperaturaMaxima);
    }
    
}
