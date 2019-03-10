package maintienda;
public class claseTienda {
    
    private String producto, proveedor;
    private int cantidad;
    private float precio;
    
    //constructor por defecto
 
    claseTienda(){
        this.precio=0;
        this.cantidad=0;
        this.producto="";
        this.proveedor="";
    }
    
    //constructor complejo
    
    claseTienda(String producto,String proveedor,int cantidad, int precio){
        this.precio=precio;
        this.cantidad=cantidad;
        this.producto=producto;
        this.proveedor=proveedor;
    }
    
    public void setProducto(String product){
        this.producto = product;
    }
    public String getProducto(){
        return producto;
    }
    
    public void setProveedor(String provider){
        this.proveedor = provider;
    }
    public String getProveedor(){
        return proveedor;
    }
    
    public void setCantidad(int quantify){
        this.cantidad = quantify;
    }
    public int getCantidad(){
        return cantidad;
    }
    
    public void setPrecio(float price){
        this.precio = price;
    }
    public float getPrecio(){
        return precio;
    }
}
