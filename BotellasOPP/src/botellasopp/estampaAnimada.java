
package botellasopp;


public class estampaAnimada extends botellaEstampada {
    
    float precioEstampaAnimada;

public estampaAnimada(){
    super();
}
    
    
    public float getPrecioEstampaAnimada() {
        return precioEstampaAnimada;
    }

    public void setPrecioEstampaAnimada() {
        
        this.precioEstampaAnimada = (float)((this.getCostoBotella())+(500));
    }
    
}
