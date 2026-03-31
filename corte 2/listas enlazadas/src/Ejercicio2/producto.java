public class producto {
    String nombre;
    int cantidad;
    int diasParaVencer;
    
    producto siguiente;

    public producto(String nombre, int cantidad, int diasParaVencer) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.diasParaVencer = diasParaVencer;
        this.siguiente = null;
    }
    
}
