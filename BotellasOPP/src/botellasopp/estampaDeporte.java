
package botellasopp;

public class estampaDeporte extends botellaEstampada{
    
    float precioEstampaDeporte;

    
    
    public float getPrecioEstampaDeporte() {
        return precioEstampaDeporte;
    }

    public void setPrecioEstampaDeporte() {
        
        this.precioEstampaDeporte = ((this.getCostoBotella())+(800));
    }
    
    
}
