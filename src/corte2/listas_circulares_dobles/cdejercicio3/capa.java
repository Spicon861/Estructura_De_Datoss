public class capa {
    String visible;
    Boolean estado;
    String tipo;

    capa cabeza;
    capa cola;
    public capa(String visible, Boolean estado, String tipo) {
        this.visible = visible;
        this.estado = estado;
        this.tipo = tipo;
        this.cabeza = null;
        this.cola = null;
    }
  
}
