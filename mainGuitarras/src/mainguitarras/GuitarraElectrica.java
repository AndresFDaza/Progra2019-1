
package mainguitarras;

import java.util.Scanner;


public class GuitarraElectrica extends GuitarraBase{
    
    static Scanner lee=new Scanner(System.in);
    
    private final double precioBase;
    private final boolean motor;
    private double precioFinal;
    
    //-------------Constructor----------------------

    public GuitarraElectrica() {
        super();
        this.precioBase = 3800000;
        this.motor = true;
    }

    //------------Buy electric guitar----------------
    
    public void comprarGuitarraElectrica(){
        
        int optionMotor;
        
        
        System.out.println("Usted va a comprar una guitarra eléctrica");
        System.out.println("¿Con qué motor desea la guitarra?");
        System.out.println("1. Motor de 60 revoluciones o menos");
        System.out.println("2. Motor mayor a 60 revoluciones");
        optionMotor= lee.nextInt();
        
            
            switch(optionMotor){
                
                case 1:
                    this.calculaMotorMenorIgual60();
                    break;
                case 2:
                    this.calculaMotorMayor60();
                    break;
                default:
                    System.out.println("!!! Disculpe, no conozco esa opcion");
                    this.setPrecioFinal(0);
                    break;
            }
            
        
        System.out.println("El precio de su compra es de : "+this.precioFinal);
        System.out.println("Gracias por su compra\n__________________________________ ");
    }
    
    //--------------Calcular precio-----------------

    public void calculaMotorMenorIgual60(){
        this.precioFinal = (this.precioBase)+(this.precioBase*0.2);
    }
    public void calculaMotorMayor60(){
        this.precioFinal = (this.precioBase)+(this.precioBase*0.3);
    }
    
    //--------------getters and setters--------------
    
    public boolean isMotor() {
        return motor;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }
}
