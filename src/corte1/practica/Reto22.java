  package corte1.practica;
public class Reto22 {
    public static void main(String[] args) {
        int[] vip = {1001};
        double[] montos = {0,0,0,0,0};
        int[] numerosCuenta = {0,0,0,0,0};
        

        
        java.util.Scanner sc = new java.util.Scanner(System.in);
        for(int i=0; i < montos.length; i++){
            System.out.println("Ingrese el monto de la transacción " + (i+1) + ": ");
            montos[i] = sc.nextDouble();
            System.out.println("Ingrese el número de cuenta de la transacción " + (i+1) + ": ");
            numerosCuenta[i] = sc.nextInt();
            
        }
        sc.close();
        int montoMayor = 0;
        int inicio = 0;
        int fin = vip.length - 1;
        boolean accesoPermitido = false;
        for(int i=0; i < montos.length; i++){
            if(montos[i] > montoMayor){
                montoMayor = (int) montos[i];
                

                    
                }
            }
            
        if(montoMayor > 5000){
            while(inicio <= fin) {
                int medio = (inicio + fin) / 2;
                        if(numerosCuenta[medio] == vip[0]){
                            System.out.println("La cuenta es VIP, no se requiere advertencia.");
                            accesoPermitido = true;
                            break;
                        } else if (medio < montoMayor) {
                            inicio = medio + 1;
                        } else {
                            fin = medio - 1;
                        }
                    }
                    if(!accesoPermitido){
                        System.out.println("La cuenta no es VIP, se requiere advertencia.");
                    }
        }
       
        
            
        
    }
    
}

    

