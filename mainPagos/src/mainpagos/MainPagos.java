
package mainpagos;

import java.util.Scanner;

public class MainPagos {

    static Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args) {
     
                int userOption;
                PagosClass sistema = new PagosClass();
        
        do{
        
        System.out.println("\t SISTEMA DE PAGOS PARA PREDIAL\n Seleccione una opcion.");
        System.out.println("1. Pagar monto total");
        System.out.println("2. Pagar por cuotas");
        System.out.println("3. Pagar con cuota inicial");
        System.out.println("4. VER DATOS REGISTRADOS (ADMINISTRADOR)");
        System.out.println("999. Salir\n");
        userOption = leer.nextInt();
        
        switch (userOption) {
            case 1:
                sistema.pagaMontoTotal();
                break;
            case 2:
                sistema.pagaCuotas();
                break;
            case 3:
                sistema.pagaCuotaInicial();
                break;
            case 4:
                sistema.muestraDatos();
                break;
            default:
                System.out.println("Por favor ingrese un número válido\n");
                break;
        }
        
        }while(userOption!=999);
            
        System.out.println("Finalizando programa");
        
    }
}
