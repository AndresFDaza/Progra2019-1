
package botellasopp;

public class botellaNormalClase {
    
    private float precioMaterial;
    private float precioManoObra;
    float costoBotella;
    
    
    public botellaNormalClase(){
        this.precioMaterial = 0;
        this.precioManoObra = 0;
        this.costoBotella =0;
    }
    
    // Setters y Getters
    
    public float getCostoBotella() {
        return costoBotella;
    }

    public void setCostoBotella() {
        this.costoBotella = (float)(this.precioMaterial+this.precioManoObra);
    }
    
    public void setCostoBotellaExterno(float valor) {
        this.costoBotella = valor;
    }
    
    public float getPrecioMaterial() {
        return precioMaterial;
    }

    public void setPrecioMaterial(float precioMaterial) {
        this.precioMaterial = precioMaterial;
    }

    public float getPrecioManoObra() {
        return precioManoObra;
    }

    public void setPrecioManoObra(float precioManoObra) {
        this.precioManoObra = precioManoObra;
    }
    
    
    
}