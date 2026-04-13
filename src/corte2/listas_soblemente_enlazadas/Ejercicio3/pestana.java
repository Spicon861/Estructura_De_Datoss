package corte2.listas_soblemente_enlazadas.Ejercicio3;
///
public class pestana {
    String titulodepagina;
    String url;
    String horaApertura;
    pestana siguiente;
    pestana anterior;

    public pestana(String titulodepagina, String url, String horaApertura, pestana siguiente, pestana anterior){
        this.titulodepagina = titulodepagina;
        this.url = url;
        this.horaApertura = horaApertura;
        this.siguiente = siguiente;
        this.anterior = anterior;
    }
    
}
