package corte2.listas_soblemente_enlazadas.Ejercicio3;

public class colaPestana {
    pestana inicio;
    pestana fin;

    public colaPestana() {
        this.inicio = null;
        this.fin = null;
    }

    public void agregarPestana(String titulodepagina, String url, String horaApertura) {
        pestana nuevaPestana = new pestana(titulodepagina, url, horaApertura, null, null);
        if (inicio == null) {
            inicio = nuevaPestana;
            fin = nuevaPestana;
        } else {
            fin.siguiente = nuevaPestana;
            nuevaPestana.anterior = fin;
            fin = nuevaPestana;
        }
    }
    public void cerrarPestanaActual(String url){
        pestana actual = fin;
        while (actual != null) {
            if (actual.url.equals(url)) {
                if (actual == inicio && actual == fin) {
                    inicio = null;
                    fin = null;
                } else if (actual == inicio) {
                    inicio = actual.siguiente;
                    inicio.anterior = null;
                } else if (actual == fin) {
                    fin = actual.anterior;
                    fin.siguiente = null;
                } else {
                    actual.anterior.siguiente = actual.siguiente;
                    actual.siguiente.anterior = actual.anterior;
                }
                break; 
            }
            actual = actual.anterior; 
        }
    }
    public void mostrarPestanasEnOrden() {
        pestana actual = inicio;
        while (actual != null) {
            System.out.println("Título: " + actual.titulodepagina + ", URL: " + actual.url + ", Hora de Apertura: " + actual.horaApertura);
            actual = actual.siguiente;
        }
    }

    
}
