
package dispensadora;

import java.util.Scanner;

public class DispensaClass {
    
    static Scanner lee = new Scanner(System.in);
    
    private int saldo=0;
    private final int[] cantidadProductos;
    private final int[] valorProducto;
    private final String[] productos;
    private final String[] codigoOpcion;

    //-----------------------Constructor-----------------------
    
    public DispensaClass() {
        this.cantidadProductos = new int[]{5,5,5,5,5,5,5,5,5,5,5,5};
        this.valorProducto = new int[]{600,800,1300,1000,900,700,1600,1600,1300,1500,2000,1700};
        this.productos = new String[]{"Galletas","  Ponqué ","   Papas   ","Platanitos",
                                      " Cereal ","Chocolate","    Agua   ","Cola negra",
                                      "  Malta "," Refresco","Energizante","  Té frio "};
        this.codigoOpcion = new String[]{"A102", "A104", "A106", "A108", 
                                        "B102","B104", "B106", "B108", 
                                        "C102", "C104", "C106", "C108"};
    }
    
    //-----------------Opcion Comprar - Main Dispensadora--------------
    
    public void opcionComprar(){
        String optionProduct,nameProduct="";
        int positionProduct=9999,valueProduct=0;
        
        this.imprimeProductos();
        System.out.println("Su saldo: "+this.saldo+"\n");
        System.out.println("Ingrese el código del producto:");
        optionProduct = lee.next().toUpperCase();
        
        for(int i=0;i<12;i++){
            if(optionProduct.equals(this.codigoOpcion[i])){
                positionProduct=i; 
                nameProduct=this.productos[i];
                valueProduct=this.valorProducto[i];
            }
        }
        
        if(positionProduct != 9999){
            if(this.validarCompra(positionProduct)==true){
                this.sacarProducto(positionProduct);
                System.out.println("\nUsted ha comprado : "+nameProduct);
                this.vueltasSaldo(valueProduct);
            }
        }
        else{
            System.out.println("\n *Usted Ingresó un código inexistente* \n");
        }
            
    }
    
    public void imprimeProductos(){
        System.out.println();
        
            
                
            for(short productln1=0;productln1<4;productln1++){
                System.out.print("||    "+this.productos[productln1]+"    ||");
            }
            System.out.println();
            for(short codevalue1=0;codevalue1<4;codevalue1++){
                System.out.print("::  "+this.codigoOpcion[codevalue1]+"  :  $"+this.valorProducto[codevalue1]+"  ::");
            }
            System.out.println("");System.out.println("");
            for(short productln2=4;productln2<8;productln2++){
                System.out.print("||    "+this.productos[productln2]+"    ||");
            }
            System.out.println();
            for(short codevalue2=4;codevalue2<8;codevalue2++){
                System.out.print("::  "+this.codigoOpcion[codevalue2]+"  :  $"+this.valorProducto[codevalue2]+"  ::");
            }
            System.out.println("");System.out.println("");
            for(short productln3=8;productln3<12;productln3++){
                System.out.print("||    "+this.productos[productln3]+"    ||");
            }
            System.out.println();
            for(short codevalue3=8;codevalue3<12;codevalue3++){
                System.out.print("::  "+this.codigoOpcion[codevalue3]+" :  $"+this.valorProducto[codevalue3]+"  :: ");
            }
        
        System.out.println("\n");
    }
    
    public boolean validarCompra(int productGlobalPosition){
        if(this.saldo>=this.valorProducto[productGlobalPosition]){
            if((this.cantidadProductos[productGlobalPosition])>0){
                return true;
            }
            else{
            System.out.println("\nLo sentidos, no nos queda más "+this.getProductos(productGlobalPosition));
            System.out.println("Su cambio es de: $"+this.saldo+"\n");
            this.saldo=0;
            return false;
            }
        }
        else {
            System.out.println("\nSu saldo es insuficiente.");
            System.out.println("Su cambio es de: $"+this.saldo+"\n");
            this.saldo=0;
            return false;
        }
    }
    
    public void sacarProducto(int position){
        this.cantidadProductos[position] -= 1;
    }
     
    public void vueltasSaldo(int productValue){
        this.saldo -= productValue;
        System.out.println("Su cambio es de: $"+saldo+"\n");
        this.saldo=0;
    }
    
    //-------------Opcion Ingresar Saldo - Main Dispensadora------------ 
    
     public void opcionIngresarSaldo(){
        int nuevoSaldo;
        System.out.println("Su saldo actual es de: "+this.saldo);
        System.out.println("Ingrese el nuevo saldo: ");
        nuevoSaldo=lee.nextInt();
        this.ingresaSaldo(nuevoSaldo);
    }
    
     public void ingresaSaldo(int quantity){
        this.saldo += quantity;
    }
     
    //-------------Opcion Reabastecer Inventario - Main Dispensadora------------ 
    
    public void opcionAbastecerInventario(){
        this.imprimirCantidades();
        int opReabastece;
        
        do{
            System.out.println("\n        Sistema de reabastecimiento ¿Qué prefiere hacer?");
        System.out.println("1. Reabastecer todo");
        System.out.println("2. Reabastecer producto específico");
        System.out.println("3. Salir");
        opReabastece = lee.nextInt();
        
        switch(opReabastece){
            case 1:
                this.reabastecerTodo();
                break;
            case 2:
                this.reabasteceProducto();
                break;
            case 3:
                System.out.println("Saliendo...\n");
                break;
            default:
                System.out.println("Por favor ingrese una opción de la lista");
                break;
        }
        
        }while(opReabastece!=3);
        
        
    }
    
    public void imprimirCantidades(){
        System.out.println();
            for(short productln1=0;productln1<4;productln1++){
                System.out.print("||    "+this.productos[productln1]+"    ||");
            }
            System.out.println();
            for(short quantify1=0;quantify1<4;quantify1++){
                System.out.print(":: Num.Unidades: "+this.cantidadProductos[quantify1]+" ::");
            }
            System.out.println("");System.out.println("");
            for(short productln2=4;productln2<8;productln2++){
                System.out.print("||    "+this.productos[productln2]+"    ||");
            }
            System.out.println();
            for(short quantify2=4;quantify2<8;quantify2++){
                System.out.print(":: Num.Unidades: "+this.cantidadProductos[quantify2]+"  ::");
            }
            System.out.println("");System.out.println("");
            for(short productln3=8;productln3<12;productln3++){
                System.out.print("||    "+this.productos[productln3]+"    ||");
            }
            System.out.println();
            for(short quantify3=8;quantify3<12;quantify3++){
                System.out.print(":: Num.Unidades: "+this.cantidadProductos[quantify3]+"  ::");
            }
        System.out.println("\n");
    }
    
    public void reabastecerTodo(){
        int sumarUnidades,cantidadActual;
        for(int i=0;i<12;i++){
            System.out.println("Numero de unidades adicionales para : "+this.getProductos(i));
            cantidadActual=this.getCantidadProductos(i);
            sumarUnidades=lee.nextInt();
            cantidadActual+=sumarUnidades;
            this.setCantidadProductos(cantidadActual, i);
        }
    }
    
    public void reabasteceProducto(){
        int optionProducto,unidadesActuales, unidadesNuevas;
        for(int i=0;i<12;i++){
            System.out.println((i+1)+". "+this.getProductos(i));
        }
        System.out.println("¿Qué producto desea reabastecer? (Ingrese número de la lista)");
        optionProducto = lee.nextInt();
        if(optionProducto>=1 && optionProducto<=12){
            unidadesActuales=this.getCantidadProductos(optionProducto-1);
            System.out.println("Ingrese unidades a reabastecidas para: "+this.getProductos(optionProducto-1));
            unidadesNuevas=lee.nextInt();
            unidadesActuales+=unidadesNuevas;
            this.setCantidadProductos(unidadesActuales, (optionProducto-1));
        }
        else
            System.out.println("Número fuera de rango, saliendo...");
    }
    
    //------------------Getters and Setters----------------------------------
    public void setSaldo(int value){
        this.saldo = value;
    }
    public int getSaldo(){
        return this.saldo;
    }
    
    public void setCantidadProductos(int quantity,int position){
        this.cantidadProductos[position] = quantity;
    }
    public int getCantidadProductos(int position){
    return this.cantidadProductos[position];
    }
    
    public String getProductos(int position){
        return this.productos[position];
    }
    
    public String getCodigoOpcion(int position){
        return this.productos[position];
    }
}