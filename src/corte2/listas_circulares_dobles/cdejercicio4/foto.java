public class foto {
    String titulo;
    String fecha;
    Boolean esFavorita;

    foto cabeza;
    foto cola;

    public foto (String titulo, String fecha, Boolean esFavorita, foto cabeza, foto cola){
        this.titulo = titulo;
        this.fecha = fecha;
        this.esFavorita = esFavorita;
        this.cabeza = cabeza;
        this.cola = cola;
    }
    
}
