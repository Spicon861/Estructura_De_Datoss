package corte2.listas_circulares.Ejercicio2;
public class colaAnuncio {
    anuncio cabeza;
    anuncio cola;

    public colaAnuncio() {
        this.cabeza = null;
        this.cola = null;
    }

    public void agregarAnuncio(anuncio nuevoAnuncio) {
        if (cabeza == null) {
            cabeza = nuevoAnuncio;
            cola = nuevoAnuncio;
            nuevoAnuncio.siguiente = nuevoAnuncio; 

        } else {
            cola.siguiente = nuevoAnuncio;
            nuevoAnuncio.siguiente = cabeza; 
            cola = nuevoAnuncio; 
        }
    }
    public void reproducirAnuncios() {
        if (cabeza == null) {
            System.out.println("No hay anuncios para reproducir.");
            return;
        }
        anuncio actual = cabeza;
        do {
            System.out.println("Reproduciendo: " + actual.titulo);
            actual.repeticiones++;
            actual = actual.siguiente;
        } while (actual != cabeza);
    }
   public void mostrarAnuncioMasRepetidoYTiempoTotal() {
        if (cabeza == null) {
            System.out.println("No hay anuncios para analizar.");
            return;
        }
        anuncio actual = cabeza;
        anuncio anuncioMasRepetido = cabeza;
        int tiempoTotal = 0;

        do {
            tiempoTotal += actual.duracionSegundos * actual.repeticiones;
            if (actual.repeticiones > anuncioMasRepetido.repeticiones) {
                anuncioMasRepetido = actual;
            }
            actual = actual.siguiente;
        } while (actual != cabeza);

        System.out.println("Anuncio más repetido: " + anuncioMasRepetido.titulo + " con " + anuncioMasRepetido.repeticiones + " repeticiones.");
        System.out.println("Tiempo total de reproducción: " + tiempoTotal + " segundos.");
    }
    
}
