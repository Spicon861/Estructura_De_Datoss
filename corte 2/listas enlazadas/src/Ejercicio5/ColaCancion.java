public class ColaCancion {
    Cancion cabeza;

    public ColaCancion() {
        this.cabeza = null;
    }

    public void agregarCancion(String titulo, String artista, int duracionSegundos, String genero) {
        Cancion nuevaCancion = new Cancion(titulo, artista, duracionSegundos, genero);
        if (cabeza == null) {
            cabeza = nuevaCancion;
        } else {
            Cancion actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevaCancion;
        }
    }

    public String obtenerDuracionTotal() {
        int duracionTotalSegundos = 0;
        Cancion actual = cabeza;
        while (actual != null) {
            duracionTotalSegundos += actual.duracionSegundos;
            actual = actual.siguiente;
        }
        int minutos = duracionTotalSegundos / 60;
        int segundos = duracionTotalSegundos % 60;
        return String.format("%02d:%02d", minutos, segundos);
    }
    
}
