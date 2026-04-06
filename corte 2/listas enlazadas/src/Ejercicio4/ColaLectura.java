public class ColaLectura {
    Lectura cabeza;

    public ColaLectura() {
        this.cabeza = null;
    }

    public void agregarLectura(int idSensor, double temperatura, double presion, String hora) {
        Lectura nuevaLectura = new Lectura(idSensor, temperatura, presion, hora);
        nuevaLectura.siguiente = cabeza;
        cabeza = nuevaLectura;
    }

    public Lectura obtenerLecturaMasAlta() {
        if (cabeza == null) {
            return null; // No hay lecturas
        }
        Lectura lecturaMasAlta = cabeza;
        Lectura actual = cabeza.siguiente;
        while (actual != null) {
            if (actual.temperatura > lecturaMasAlta.temperatura) {
                lecturaMasAlta = actual;
            }
            actual = actual.siguiente;
        }
        return lecturaMasAlta;
    }
    
}
