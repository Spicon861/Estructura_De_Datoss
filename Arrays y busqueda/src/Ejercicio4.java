//4. Control de Acceso (Gimnasio)
//Un gimnasio tiene una lista de códigos de acceso de los socios 
// que pagaron la mensualidad. La lista está ordenada de menor a mayor.

//El Problema: Cuando un socio digita su código, el sistema debe 
// validar si el código está en la lista de "pagos al día".
//  Si no está, se le niega la entrada.
//Algoritmo a usar: Búsqueda Binaria. Es eficiente 
// para buscar códigos numéricos en una lista que ya está organizada.
//
public class Ejercicio4 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[] codigosAcceso = {1001, 1002, 1003, 1004, 1005, 1006, 1007, 1008, 1009, 1010};
        System.out.println("Por favor, ingrese su código de acceso:");
        int codigoIngresado = sc.nextInt();
        int inicio = 0;
        int fin = codigosAcceso.length - 1;
        boolean accesoPermitido = false;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;

            if (codigosAcceso[medio] == codigoIngresado) {
                System.out.println("Acceso permitido. Bienvenido al gimnasio.");
                accesoPermitido = true;
                break;
            } else if (codigosAcceso[medio] < codigoIngresado) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }

        if (!accesoPermitido) {
            System.out.println("Acceso denegado. Código de acceso no válido.");
        }
    }
    
}
