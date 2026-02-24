package Ejercicios;

public class Reto1 {
    //24/02/2026
    public static void main(String[] args) {
        double[] precios ={0,0,0,0,0};
        java.util.Scanner sc = new java.util.Scanner(System.in);
        for(int i=0; i < precios.length; i++){
            System.out.println("Ingrese el precio del producto " + (i+1) + ": ");
            precios[i] = sc.nextDouble();
        }
         double preciosTotal= 0;
        for(int i=0; i < precios.length; i++){
          preciosTotal = preciosTotal + precios[i];
        }
        System.out.println("El precio total de los productos es: " + preciosTotal);
        if(preciosTotal>20000){
            System.out.println("El cliente tiene derecho a un descuento del 2000");
            System.out.println("El precio total con descuento es: " + (preciosTotal - 2000));
        }
            else{
                System.out.println("El cliente no tiene derecho a un descuento");
                System.out.println("El precio total es: " + preciosTotal);
            }


           
        

    }
    
}
