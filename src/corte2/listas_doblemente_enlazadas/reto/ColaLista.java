package corte2.listas_soblemente_enlazadas.reto;
public class ColaLista {
    Lista cabeza;

    public ColaLista() {
        this.cabeza = null;
    }

    public void agregarLista(int id) {
        Lista nuevaLista = new Lista(id);
        if (cabeza == null) {
            cabeza = nuevaLista;
        } else {
            Lista actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevaLista;
        }
    }

     public double calcularTotal(){
        double Total = 0;
        Lista actual = cabeza;
        while(actual != null){
            Total += 1;
            actual = actual.siguiente;
        }
        return Total;
    }
}
