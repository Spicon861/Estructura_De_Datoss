public class historial {
    comando cabeza;
    comando cola;
    comando cursor;
    public historial() {
        this.cabeza = null;
        this.cola = null;
        this.cursor = null;
    }
    public estaVacia() {
        return cabeza == null;
    }
    public void agregarComando(String texto, boolean exitoso, String directorio) {
        Comando nuevoComando = new Comando(texto, exitoso, directorio);
        if (estaVacia()) {
            cabeza = nuevoComando;
            cola = nuevoComando;
            cursor = nuevoComando;
        } else {
            cola.siguiente = nuevoComando;
            nuevoComando.anterior = cola;
            cola = nuevoComando;
        }
    }
    public void arriba() {
        if (cursor != null) {
            cursor = cursor.anterior != null ? cursor.anterior : cola;
        }
    }
    public void abajo() {
        if (cursor != null) {
            cursor = cursor.siguiente != null ? cursor.siguiente : cabeza;
        }
    }
    public void mostrarCursor() {
        if (cursor != null) {
            System.out.println("Comando actual: " + cursor.texto + " (Exitoso: " + cursor.exitoso + ", Directorio: " + cursor.directorio + ")");
        } else {
            System.out.println("No hay comandos en el historial.");
        }
    }
    public void eliminarActual() {
        if (cursor == null) return;
        if (cursor == cabeza && cursor == cola) {
            cabeza = null;
            cola = null;
            cursor = null;
        } else if (cursor == cabeza) {
            cabeza = cabeza.siguiente;
            cabeza.anterior = null;
            cursor = cabeza;
        } else if (cursor == cola) {
            cola = cola.anterior;
            cola.siguiente = null;
            cursor = cola;
        } else {
            cursor.anterior.siguiente = cursor.siguiente;
            cursor.siguiente.anterior = cursor.anterior;
            cursor = cursor.siguiente;
        }
    }



    
}
