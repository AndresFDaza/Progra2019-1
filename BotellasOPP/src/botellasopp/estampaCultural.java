
package botellasopp;


public class estampaCultural extends botellaEstampada{
    
    float precioEstampaCultural;

    
    
    public float getPrecioEstampaCultural() {
        return precioEstampaCultural;
    }

    public void setPrecioEstampaCultural() {
        
        this.precioEstampaCultural = ((this.getCostoBotella())+(1000));
    }
    
    
}
