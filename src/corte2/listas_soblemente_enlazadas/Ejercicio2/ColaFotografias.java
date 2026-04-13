package corte2.listas_soblemente_enlazadas.Ejercicio2;
public class ColaFotografias {
    Fotografia inicio;
    Fotografia fin;

    public ColaFotografias() {
        this.inicio = null;
        this.fin = null;
    }

    public void agregarFotografia(String nombreArchivo, double tamanoMB, String resolucion) {
        Fotografia nuevaFotografia = new Fotografia(nombreArchivo, tamanoMB, resolucion);
        if (inicio == null) {
            inicio = nuevaFotografia;
            fin = nuevaFotografia;
        } else {
            fin.siguiente = nuevaFotografia;
            nuevaFotografia.anterior = fin;
            fin = nuevaFotografia;
        }
    }

    public void reproducirGaleria() {
        System.out.println("Reproduciendo galería hacia adelante:");
        Fotografia actual = inicio;
        while (actual != null) {
            System.out.println("Nombre Archivo: " + actual.nombreArchivo);
            System.out.println("Tamaño (MB): " + actual.tamanoMB);
            System.out.println("Resolución: " + actual.resolucion);
            System.out.println("-------------------------");
            actual = actual.siguiente;
        }

        System.out.println("Reproduciendo galería hacia atrás:");
        actual = fin;
        while (actual != null) {
            System.out.println("Nombre Archivo: " + actual.nombreArchivo);
            System.out.println("Tamaño (MB): " + actual.tamanoMB);
            System.out.println("Resolución: " + actual.resolucion);
            System.out.println("-------------------------");
            actual = actual.anterior;
        }
    }
    
}
