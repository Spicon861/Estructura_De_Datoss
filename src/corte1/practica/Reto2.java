  package corte1.practica;
public class Reto2 {
    //24/02/2026
    //el usuario debe ingresar los montos y los numeros de cuenta de las ultimas 5 transacciones del cajero automatico
    public static void main(String[] args) {
        double[] montos = {0,0,0,0,0};

        java.util.Map<Integer, Boolean> diccionarioCuentas = new java.util.HashMap<>();
        diccionarioCuentas.put(0, true);
        diccionarioCuentas.put(0, false);
        diccionarioCuentas.put(0, false);
        diccionarioCuentas.put(0, false);
        diccionarioCuentas.put(0, false);
        

        
        java.util.Scanner sc = new java.util.Scanner(System.in);
        for(int i=0; i < montos.length; i++){
            System.out.println("Ingrese el monto de la transacción " + (i+1) + ": ");
            montos[i] = sc.nextDouble();
            System.out.println("Ingrese el número de cuenta de la transacción " + (i+1) + ": ");
            int numeroCuenta = sc.nextInt();
            diccionarioCuentas.put(numeroCuenta, false); 
        }
        sc.close();
        int montoMayor = 0;
        int inicio = 0;
        int fin = diccionarioCuentas.size() - 1;
        boolean accesoPermitido = false;
        for(int i=0; i < montos.length; i++){
            if(montos[i] > montoMayor){
                montoMayor = (int) montos[i];
                if(montoMayor > 50000){
                    while(inicio <= fin) {
                        int medio = (inicio + fin) / 2;
                        if(diccionarioCuentas.get(medio) == true){
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
       
        
            
        
    }
    
}
