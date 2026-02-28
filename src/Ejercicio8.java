//Ejercicio 8 — Historial de mensajes
//Un chat guarda el último mensaje enviado. Se usan dos variables String:

//ultimoMensaje = "Hola"
//copiaTexto = ultimoMensaje
//Luego copiaTexto se cambia a "¿Cómo estás?"
//Muestra ambas variables y explica en un comentario por qué ultimoMensaje no cambió (inmutabilidad de String).

public class Ejercicio8 {
public static void main(String[] args) {
        String ultimoMensaje = "Hola";
        String copiaTexto = ultimoMensaje;
        copiaTexto = "¿Cómo estás?";
        System.out.println("ultimoMensaje: " + ultimoMensaje);
        System.out.println("copiaTexto: " + copiaTexto);
        //no cambia por que crea un nuevo objeto en memoria con el nuevo valor, mientras que ultimoMensaje sigue apuntando al objeto original "Hola". Esto se debe a la inmutabilidad de los objetos String en Java, lo que significa que una vez creado un String, su valor no puede ser cambiado.
    }
}