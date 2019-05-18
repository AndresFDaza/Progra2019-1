
package mainguitarras;

import java.util.Scanner;


public class GuitarraAcustica extends GuitarraBase{
    
    static Scanner lee=new Scanner(System.in);
    
    private final double precioBase;
    private final boolean traste;
    private double precioFinal;

    //-------------Constructor----------------------
    
    public GuitarraAcustica() {
        super();
        this.precioBase = 2000000;
        this.traste = true;
    }

    //------------Buy acustic guitar----------------
    
    public void comprarGuitarraAcustica(){
        
        int optionMusico;
        
        System.out.println("Usted va a comprar una guitarra acústica");
        System.out.println("¿Es usted músico?");
        System.out.println("1. Si, soy músico");
        System.out.println("2. No, no soy músico");
        
        optionMusico= lee.nextInt();
        
            
            switch(optionMusico){
                
                case 1:
                    System.out.println("Entendido, por ser músico su guitarra tendrá descuento");
                    this.setPrecioFinal(1200000);
                    break;
                case 2:
                    System.out.println("Entendido, usted no es músico");
                    this.setPrecioFinal(precioBase);
                    break;
                default:
                    System.out.println(" !!!Disculpe, necesito saber si es usted músico");
                    this.setPrecioFinal(0);
                    break;
            }
            
        System.out.println("El precio de su compra es de : "+this.precioFinal);
        System.out.println("Gracias por su compra\n__________________________________ ");
    }
    
    //--------------getters and setters--------------
    
    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioTotal) {
        this.precioFinal = precioTotal;
    }
    
    
    
}
