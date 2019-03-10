
package dispensadora;

import java.util.Scanner;

public class DispensadoraMain {

    static Scanner lee = new Scanner(System.in);
    static DispensaClass maquinitaNeogranadina = new DispensaClass();
    
    public static void main(String[] args) {
        
        int optionMenu;
        
        do{
            System.out.println("   -----DISPENSADORA NEOGRANADINA-----  ");
            System.out.println("1. COMPRAR");
            System.out.println("2. INGRESAR SALDO");
            System.out.println("3. REABASTECER INVENTARIO\n");
            optionMenu = lee.nextInt();
            
            switch(optionMenu){
                case 1: 
                    maquinitaNeogranadina.opcionComprar();
                    break;
                case 2 :
                    maquinitaNeogranadina.opcionIngresarSaldo();
                    break;
                case 3 :
                    maquinitaNeogranadina.opcionAbastecerInventario();
                    break;
                default:
                    System.out.println("Por favor ingrese un código válido");
            }
            
        }while(optionMenu != 0);
    }
    
    
}