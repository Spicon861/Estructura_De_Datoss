package corte1.arrays_y_ordenamiento;
public class Parcial1 {
    public static void InsertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    public static int busquedaLineal(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; 
            }
        }
        return -1; 
    }
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int[] puntajes = new int[6];
        System.out.println("Ingrese los puntajes de 6 estudiantes:");
        for (int i = 0; i < puntajes.length; i++) {
            System.out.println("Puntaje del estudiante " + (i + 1) + ":");
            puntajes[i] = scanner.nextInt();
        }
        
        InsertionSort(puntajes);
        System.out.println("Puntajes ordenados de menor a mayor:");
        for (int puntaje : puntajes) {
            System.out.println(puntaje);
        }
        System.out.println("Ingrese el puntaje a buscar:");
        int target = scanner.nextInt();
        scanner.close();
        int index = busquedaLineal(puntajes, target);
        if (index != -1) {
            System.out.println("El puntaje " + target + " se encuentra en el índice: " + index);
        } else {
            System.out.println("El puntaje " + target + " no se encuentra en el arreglo.");
        }

    }
    
}
