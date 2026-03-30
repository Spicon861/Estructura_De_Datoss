import java.util.Scanner;

public class Parcial2 {
    public static void SelectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    public static int busquedabinaria(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid; 
            }
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; 
    }
    public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    java.util.List<mascota> mascotas = new java.util.ArrayList<>();
    System.out.println("Ingrese la información de 5 mascotas:");
    for (int i = 0; i < 5; i++) {
        mascota mascota = new mascota();
        System.out.println("Mascota " + (i + 1) + ":");
        System.out.print("Historial: ");
        mascota.historial = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Nombre: ");
        mascota.nombre = scanner.nextLine();
        System.out.print("Edad: ");
        mascota.edad = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        mascotas.add(mascota);
        System.out.println("------------------Registrado------------------");
    }
    System.out.println("----------------------------------------------------");
    for (mascota m : mascotas) {
        System.out.println("Historial: " + m.historial);
        System.out.println("Nombre: " + m.nombre);
        System.out.println("Edad: " + m.edad);

    }
    System.out.println("----------------------------------------------------");
    System.out.println("Ingrese el historial de la mascota a buscar:");
    int historialBusqueda = scanner.nextInt();
    int indice = busquedabinaria(mascotas.stream().mapToInt(m -> m.historial).toArray(), historialBusqueda);
    if (indice != -1) {
        mascota encontrada = mascotas.get(indice);
        System.out.println("Mascota encontrada:");
        System.out.println("Historial: " + encontrada.historial);
        System.out.println("Nombre: " + encontrada.nombre);
        System.out.println("Edad: " + encontrada.edad);
    } else {
        System.out.println("Mascota no encontrada.");
    }
    System.out.println("----------------------------------------------------");
    System.out.println("promedio de edad de las mascotas:");
    double sumaEdades = mascotas.stream().mapToInt(m -> m.edad).sum();
    double promedio = sumaEdades / mascotas.size();
    System.out.println(promedio);
}
}
