package corte2.listas_circulares.CEjercicio2;
public class anuncio {
    String titulo;
    int duracionSegundos;
    int repeticiones;
    String categoria;
    
    
    anuncio siguiente;


    public anuncio(String titulo, int duracionSegundos, String categoria) {
        this.titulo = titulo;
        this.duracionSegundos = duracionSegundos;
        this.categoria = categoria;
        this.repeticiones = 0;
        this.siguiente = null;
    }
}
