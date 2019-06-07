
package palatabla;

import java.util.ArrayList;


public class PalaTabla {

   static ArrayList datos = new ArrayList();
   static String producto,precio,cantidad;
   
   public static void grabar(){
       datos.add(producto);
       datos.add(precio);
       datos.add(cantidad);
   }
    
    public static void main(String[] args) {
        
    }
    
}
