
package mainguitarras;

import java.util.Scanner;

public class MainGuitarras {

    static Scanner lee=new Scanner(System.in);
   
    public static void main(String[] args) {
        
        int optionMain;
        
        do{
        
        System.out.println("BIENVENIDO A LA VENTA DE GUITARRAS \n");
        System.out.println("Escoja el tipo de guitarra: ");
        System.out.println("1. Acústica");
        System.out.println("2. Eléctrica");
        System.out.println("3. Dejar de compar \n");
        
        optionMain = lee.nextInt();
        
        
           
            switch(optionMain){
                
                case 1:
                    GuitarraAcustica opcionAcustica = new GuitarraAcustica();
                    opcionAcustica.comprarGuitarraAcustica();
                    break;
                case 2:
                    GuitarraElectrica opcionElectrica = new GuitarraElectrica();
                    opcionElectrica.comprarGuitarraElectrica();
                    break;
                case 3: 
                    System.out.println("Gracias por visitarnos, vuelva pronto");
                    break;
                default:
                    System.out.println("!!! Lo lamento, no conozco esa opción, por favor intente de nuevo \n");
                    break;
        } 
        }while(optionMain!=3);
        
    }
    
}
