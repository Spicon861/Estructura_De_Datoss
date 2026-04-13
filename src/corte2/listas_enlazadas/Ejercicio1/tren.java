package corte2.listas_enlazadas.Ejercicio1;
public class tren {
    vagon cabeza;
    public tren(){
        this.cabeza = null;
    }
    public void agregarVagon(vagon nuevoVagon){
        if(cabeza == null){
            cabeza = nuevoVagon;
        } else {
            vagon actual = cabeza;
            while(actual.siguiente != null){
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoVagon;
        }
       
    }
    public double calcularPesoTotal(){
        double pesoTotal = 0;
        vagon actual = cabeza;
        while(actual != null){
            pesoTotal += actual.persoToneladas;
            actual = actual.siguiente;
        }
        return pesoTotal;
    }
}
