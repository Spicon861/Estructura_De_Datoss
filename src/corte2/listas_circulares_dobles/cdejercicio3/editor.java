public class editor {
    capa cabeza;
    capa cola;
    capa capaActiva;
    public editor() {
        this.cabeza = null;
        this.cola = null;
        this.capaActiva = null;
    }
    public boolean estaVacio() {
        return cabeza == null;
    }
    public void agregarCapa(String visible, Boolean estado, String tipo) {
        capa nuevaCapa = new capa(visible, estado, tipo);
        if (estaVacio()) {
            cabeza = nuevaCapa;
            cola = nuevaCapa;
            capaActiva = nuevaCapa;
        } else {
            cola.cabeza = nuevaCapa;
            nuevaCapa.cola = cola;
            cola = nuevaCapa;
        }
    }
    public void subirCapa() {
        if (capaActiva != null) {
            capaActiva = capaActiva.cabeza != null ? capaActiva.cabeza : cabeza;
        }
    }
    public void bajarCapa() {
        if (capaActiva != null) {
            capaActiva = capaActiva.cola != null ? capaActiva.cola : cola;
        }
    }
    public void toggleVisibilidad() {
        if (capaActiva != null) {
            capaActiva.estado = !capaActiva.estado;
        }
    }
    public void eliminarActiva() {
        if (capaActiva == null) return;
        if (capaActiva == cabeza && capaActiva == cola) {
            cabeza = null;
            cola = null;
            capaActiva = null;
        } else if (capaActiva == cabeza) {
            cabeza = cabeza.cabeza;
            cabeza.cola = null;
            capaActiva = cabeza;
        } else if (capaActiva == cola) {
            cola = cola.cola;
            cola.cabeza = null;
            capaActiva = cola;
        } else {
            capaActiva.cola.cabeza = capaActiva.cabeza;
            capaActiva.cabeza.cola = capaActiva.cola;
            capaActiva = capaActiva.cabeza;
        }
    }
    public void mostrarCapas() {
        if (estaVacio()) {
            System.out.println("No hay capas en el editor.");
            return;
        }
        System.out.println("=== Capas del Editor ===");
        capa actual = cabeza;
        do {
            String activaMarker = (actual == capaActiva) ? "[✓] " : "    ";
            String visibilidad = actual.estado ? "Visible" : "Oculta";
            System.out.println(activaMarker + actual.visible + " (" + actual.tipo + ") - " + visibilidad);
            actual = actual.cabeza;
        } while (actual != null);
    }
    
}
