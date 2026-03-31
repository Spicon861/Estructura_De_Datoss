public class inventario {
    producto cabeza;

    public inventario() {
        this.cabeza = null;
    }

    public void agregarProducto(producto nuevoProducto) {
        if (cabeza == null || nuevoProducto.diasParaVencer < 3) {
            nuevoProducto.siguiente = cabeza;
            cabeza = nuevoProducto;
        } else {
            producto actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoProducto;
        }
    }

    public void imprimirProductosProximosAVencer() {
        producto actual = cabeza;
        while (actual != null) {
            if (actual.diasParaVencer < 5) {
                System.out.println("Producto: " + actual.nombre + ", Cantidad: " + actual.cantidad + ", Días para vencer: " + actual.diasParaVencer);
            }
            actual = actual.siguiente;
        }
    }
    
}
