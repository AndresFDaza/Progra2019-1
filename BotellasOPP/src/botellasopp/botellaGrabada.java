
package botellasopp;


public class botellaGrabada extends botellaNormalClase {
    
    private float precioBotella;
    
    
    
    public botellaGrabada(){
        super();
    }
    
    public float getPrecioBotella() {
        return precioBotella;
    }

    public void setPrecioBotella() {
        float precioPorcentaje = (float) ((this.getCostoBotella())*(0.15));
        float precioBotellaGrabada = this.getCostoBotella() + precioPorcentaje;
        this.precioBotella = precioBotellaGrabada;
    }
    
    
    
    
    
}
