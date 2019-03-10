
package maintienda;

import java.util.Scanner;

public class MainTienda {

    static Scanner lee=new Scanner(System.in);
    static claseTienda granadina = new claseTienda("Mocasin","El cid",10,95560);
    
    public static void main(String[] args) {
        
        int op;
        
        do{
            System.out.println("1. Listar datos individuales");
            System.out.println("2. Ingresar datos individuales, con set");
            System.out.println("3. Mostrar datos ingresados");
            System.out.println("");
            System.out.println("9999. Terminar");
            
            op=lee.nextInt();
            
            switch(op){
                case 1:
                    System.out.println("Zapatos   : "+granadina.getProducto());
                    System.out.println("Proveedor : "+granadina.getProveedor());
                    System.out.println("Cantidad  : "+granadina.getCantidad());
                    System.out.println("Precio    : "+granadina.getPrecio());
                    System.out.println("");
                    break;
                    
                case 2:
                    System.out.println("Zapatos   ");
                    granadina.setProducto(lee.next());
                    System.out.println("Proveedor ");
                    granadina.setProveedor(lee.next());
                    System.out.println("Cantidad  ");
                    granadina.setCantidad(lee.nextInt());
                    System.out.println("Precio    ");
                    granadina.setPrecio(lee.nextFloat());
                    System.out.println("");
                    break;
            }
            
        }while(op!=9999);
    }
    
}
