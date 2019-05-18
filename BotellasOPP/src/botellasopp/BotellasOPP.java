
package botellasopp;

import java.util.Scanner;

public class BotellasOPP {

  static Scanner lee=new Scanner(System.in);
    
    public static void main(String[] args) { 
        
        botellaNormalClase botellaNormal = new botellaNormalClase();
        botellaGrabada botellaConGrabado = new botellaGrabada();
        estampaAnimada estampadoAnimada = new estampaAnimada();
        estampaDeporte estampadoDeporte = new estampaDeporte();
        estampaCultural estampadoCultural = new estampaCultural();
        
        
        do{
            
            String continuar;
            
            System.out.println("\nCALCULAR EL PRECIO DE LAS BOTELLAS");
            System.out.println("*ingrese (-999) para salir del programa* \n\n");
            
            System.out.println("Ingrese el precio del material de la botella");
            botellaNormal.setPrecioMaterial(lee.nextFloat());
            if(botellaNormal.getPrecioMaterial()== -999)
                break;
            
            System.out.println("Ingrese el precio de la mano de obra por botella");
            botellaNormal.setPrecioManoObra(lee.nextFloat());
            if(botellaNormal.getPrecioManoObra()== -999)
                break;
            
            botellaNormal.setCostoBotella();
            float precioBotellaNormal = botellaNormal.getCostoBotella();
            botellaConGrabado.setCostoBotellaExterno(precioBotellaNormal);
            estampadoAnimada.setCostoBotellaExterno(precioBotellaNormal);
            estampadoDeporte.setCostoBotellaExterno(precioBotellaNormal);
            estampadoCultural.setCostoBotellaExterno(precioBotellaNormal);
            botellaConGrabado.setPrecioBotella();
            
            
            System.out.println("Precio de la botella normal: "+botellaNormal.getCostoBotella());
            System.out.println("Precio de la botella con grabado: "+botellaConGrabado.getPrecioBotella());
            System.out.println("Precio de la botella estampada animada: "+estampadoAnimada.getPrecioEstampaAnimada());
            System.out.println("Precio de la botella estampa deportes: "+estampadoDeporte.getPrecioEstampaDeporte());
            System.out.println("Precio de la botella estampa cultural: "+estampadoCultural.getPrecioEstampaCultural());
            
            System.out.println("Ingrese cualquier tecla para reiniciar los datos");
            continuar = lee.next();
            
        }while(botellaNormal.getPrecioMaterial()!= -999 
                || botellaNormal.getPrecioManoObra()== -999 );
        
        
        
    }
    
    
}
