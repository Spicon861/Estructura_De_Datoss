
//Ejercicio 6 — Turno en un banco
//Un cajero de banco trabaja con el número del turno actual. Se crea una variable turnoActual y se asigna a turnoEnPantalla.

//Demuestra con código que cambiar turnoEnPantalla no afecta a turnoActual (comportamiento por valor).
//Explica en un comentario por qué ocurre esto.
public class Ejercicio6 {
    
    public static void main(String[] args){
 
        int turnoActual = 5; // Variable que representa el turno actual en el banco
        int turnoEnPantalla = turnoActual; // Asignamos el valor de turnoActual
        System.out.println("Turno actual: " + turnoActual); // Imprime el turno actual
        System.out.println("Turno en pantalla: " + turnoEnPantalla); // Imprime el turno en pantalla

    }
    
}
