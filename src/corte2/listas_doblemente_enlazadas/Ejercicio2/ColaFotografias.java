
public class ColaFotografias {
    Fotografia actual;
    Fotografia inicio;
    Fotografia fin;

    public ColaFotografias() {
        this.actual = null;
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

    public void reproducirGaleriaDelante() {
        Fotografia actual = inicio;
        while (actual != null) {
            System.out.println("Nombre: " + actual.nombreArchivo + ", Tamaño: " + actual.tamanoMB + "MB, Resolución: " + actual.resolucion);
            actual = actual.siguiente;
        }
    }
    public void reproducirGaleriaAtras() {
        Fotografia actual = fin;
        while (actual != null) {
            System.out.println("Nombre: " + actual.nombreArchivo + ", Tamaño: " + actual.tamanoMB + "MB, Resolución: " + actual.resolucion);
            actual = actual.anterior;
        }
    }

    
    
    
}
