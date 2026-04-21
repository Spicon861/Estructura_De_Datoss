public class galeria {
    foto cabeza;
    foto cola;
    foto actual;

    public galeria(){
        this.cabeza = null;
        this.cola = null;
        this.actual = null;
    }
    public Boolean estaVacio(){
        return cabeza == null;
    }
    public void agregarFoto(String titulo, String fecha, Boolean esFavorita){
        foto nuevaFoto = new foto(titulo, fecha, esFavorita, null, null);
        if (estaVacio()){
            cabeza = nuevaFoto;
            cola = nuevaFoto;
            actual = nuevaFoto;
        } else {
            cola.cabeza = nuevaFoto;
            nuevaFoto.cola = cola;
            cola = nuevaFoto;
        }
    }
    public void avanzar(){
        if (actual != null){
            actual = actual.cabeza != null ? actual.cabeza : cabeza;
        }
    }
    public void retroceder(){
        if (actual != null){
            actual = actual.cola != null ? actual.cola : cola;
        }
    }
    public void marcarFavorita(){
        if (actual != null){
            actual.esFavorita = true;
        }
    }
    public void eliminarActual(){
        if (actual == null) return;
        if (actual == cabeza && actual == cola){
            cabeza = null;
            cola = null;
            actual = null;
        } else if (actual == cabeza){
            cabeza = cabeza.cabeza;
            cabeza.cola = null;
            actual = cabeza;
        } else if (actual == cola){
            cola = cola.cola;
            cola.cabeza = null;
            actual = cola;
        } else {
            actual.cola.cabeza = actual.cabeza;
            actual.cabeza.cola = actual.cola;
            actual = actual.cabeza;
        }
    }
    public void mostrarGaleria(){
        if (estaVacio()){
            System.out.println("La galería está vacía.");
            return;
        }
        foto temp = cabeza;
        while (temp != null){
            String marcador = temp == actual ? "[▶] " : temp.esFavorita ? "[★] " : "    ";
            System.out.println(marcador + temp.titulo + " (" + temp.fecha + ")");
            temp = temp.cabeza;
        }
    }
    
    
}
