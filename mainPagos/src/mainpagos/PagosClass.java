
package mainpagos;



import java.util.Scanner;

public class PagosClass {
    
    static Scanner leer = new Scanner(System.in);
    
    private double monto;
    private int[] contadorOpciones;
    private double[] recaudoTotal;
    private double[] recaudoIntereses;
    private double[] recaudoFormaDePago;

    //CONSTRUCTOR---------------------------------------
    
    public PagosClass(){
        this.monto = 0;
        this.contadorOpciones = new int[]{0,0,0};
        this.recaudoTotal = new double[]{0,0,0};
        this.recaudoIntereses=new double[]{0,0,0};
        this.recaudoFormaDePago=new double[]{0,0,0};
    }
    
    //OPCIONES MAIN---------------------------------------------
    
    public void pagaMontoTotal(){
        int opcionUsuario;
        
        this.contadorOpciones[0]++;
        
        System.out.println("PAGO TOTAL");
        System.out.println("Ingrese el valor de su predio");
        setMonto(leer.nextDouble());
        System.out.println("Ingrese una opción:");
        System.out.println("1. Pagar en efectivo");
        System.out.println("2. Pagar con Crédito");
        System.out.println("3. Pagar con Débito");
        opcionUsuario=leer.nextInt();
        
        this.recaudoTotal[0]+=this.monto;
        
        switch (opcionUsuario){
            case 1:
                this.recaudoFormaDePago[0]+=this.monto;
                break;
            case 2:
                this.recaudoFormaDePago[1]+=this.monto;
                break;
            case 3:
                this.recaudoFormaDePago[2]+=this.monto;
                break;
            default:
                System.out.println("Numero inválido, saliendo...");
                this.contadorOpciones[0]--;
                this.recaudoTotal[0]-=this.monto;
                break;
        }
        System.out.println("Su pago final es de: "+this.monto);
    }
    
    public void pagaCuotas(){
        this.contadorOpciones[1]++; 
        
        System.out.println("PAGAR A CUOTAS");
        System.out.println("Ingrese el valor de su predio");
        this.setMonto(leer.nextDouble());
        this.calculaPagoCuotas(monto);
        
    }
    
    public void pagaCuotaInicial(){
        this.contadorOpciones[2]++;
        
        System.out.println("PAGAR CON CUOTA INICIAL");
        System.out.println("Ingrese el valor de su predio");
        this.setMonto(leer.nextDouble());
        this.calculaPagoCuotaInicial(monto);
    }
    
    public void muestraDatos(){
        
        System.out.println("\n  1. OPCION DE LOS CIUDADANOS Y RECAUDO TOTAL.");
        System.out.println("Pagar total: "+this.contadorOpciones[0]
        +"  recaudo: "+this.recaudoTotal[0]);
        System.out.println("Pagar por cuotas: "+this.contadorOpciones[1]
        +"  recaudo: "+this.recaudoTotal[1]);
        System.out.println("Pagar con cuota inicial: "+this.contadorOpciones[2]
        +"  recaudo: "+this.recaudoTotal[2]);
        
        System.out.println("\n 2. SUMA POR INTERESES.");
        System.out.println("Recaudo por intereses -pago total- : "
        +this.recaudoIntereses[0]+" (pago total no tiene intereses)");
        System.out.println("Recaudo por intereses -pago a cuotas- : "
        +this.recaudoIntereses[1]);
        System.out.println("Recaudo por intereses -pago con cuota inicial- : "
        +this.recaudoIntereses[2]);
                
        System.out.println("\n 3. CIUDADANOS CON PAGO TOTAL.");
        System.out.println("Ciudadanos que pagaron el total: "+this.contadorOpciones[0]);
        System.out.println("Recaudo en efectivo: "+this.recaudoFormaDePago[0]);
        System.out.println("Recaudo por crédito: "+this.recaudoFormaDePago[1]);
        System.out.println("Recaudo por débito: "+this.recaudoFormaDePago[2]);
        
        System.out.println("");
    }
    //FUNCIONES DE LOS PAGOS--------------------------------------
    
    public void calculaPagoCuotas(double valorPredial){
        double valorFinal=0;
        
        System.out.println("El valor final a pagar es de: ");
    }
    
    public void calculaPagoCuotaInicial(double valorPredial){
        double valorFinal=0;
        System.out.println("El valor final a pagar es de: ");
    }
    
    
    //GETTERS Y SETTERS----------------------------------

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int[] getContadorOpciones() {
        return contadorOpciones;
    }

    public void setContadorOpciones(int[] contadorOpciones) {
        this.contadorOpciones = contadorOpciones;
    }

    public double[] getRecaudoTotal() {
        return recaudoTotal;
    }

    public void setRecaudoTotal(double[] recaudoTotal) {
        this.recaudoTotal = recaudoTotal;
    }

    public double[] getRecaudoIntereses() {
        return recaudoIntereses;
    }

    public void setRecaudoIntereses(double[] recaudoIntereses) {
        this.recaudoIntereses = recaudoIntereses;
    }

    public double[] getRecaudoFormaDePago() {
        return recaudoFormaDePago;
    }

    public void setRecaudoFormaDePago(double[] recaudoFormaDePago) {
        this.recaudoFormaDePago = recaudoFormaDePago;
    }


    
    
}
