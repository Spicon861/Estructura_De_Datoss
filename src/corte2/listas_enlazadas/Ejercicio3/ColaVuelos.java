package corte2.listas_enlazadas.Ejercicio3;
public class ColaVuelos {
    vuelo cabeza;

    public ColaVuelos() {
        this.cabeza = null;
    }

    public void agregarVuelo(vuelo nuevoVuelo) {
        if (cabeza == null || nuevoVuelo.combustibleRestante < 10) {
            nuevoVuelo.siguiente = cabeza;
            cabeza = nuevoVuelo;
        } else {
            vuelo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoVuelo;
        }
    }

    public void reportarEmergencia(String numeroVuelo) {
        if (cabeza == null) return;

        if (cabeza.numeroVuelo.equals(numeroVuelo)) return; // Ya está en la cabeza

        vuelo anterior = null;
        vuelo actual = cabeza;

        while (actual != null && !actual.numeroVuelo.equals(numeroVuelo)) {
            anterior = actual;
            actual = actual.siguiente;
        }

        if (actual != null) { // Vuelo encontrado
            if (anterior != null) {
                anterior.siguiente = actual.siguiente; // Desconectar el vuelo de su posición actual
                actual.siguiente = cabeza; // Mover el vuelo a la cabeza
                cabeza = actual; // Actualizar la cabeza
            }
        }
    }
    
}
