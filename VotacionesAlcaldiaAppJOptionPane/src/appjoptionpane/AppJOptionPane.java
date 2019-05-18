package appjoptionpane;

import javax.swing.JOptionPane;

public class AppJOptionPane {

    static String optionNumber;
    static String optionString;
    static String optionMenu;
    static int numeroEncuestados = 10;
    
    public static void main(String[] args) {
        
        
        String identificacionVotantes[]= new String[numeroEncuestados];
        int cuentaVoto[] = new int[4];
        
        int votaron =10;
        int votanteContador=0;
        
        int opcionMenu;
        int opcionCandidatos;
        
        do{
        
        optionMenu = JOptionPane.showInputDialog("Menú votaciones a la alcaldía - escoja las opciones con numeros enteros \n"
                + "1. Votar \n"
                + "2. Ver votantes en esta mesa \n"
                + "3. Conteo votos en la mesa \n"
                + "999. Salir");
        
        opcionMenu = Integer.parseInt(optionMenu); 
        
        switch(opcionMenu){
            //-----------------------------
            case 1:
                
                identificacionVotantes[votanteContador] = JOptionPane.showInputDialog("Ingrese su identificación");
                votanteContador++;
                
                optionNumber = JOptionPane.showInputDialog("VOTE POR SU CANDIDATO A LA ALCALDIA DE BOGOTÁ: \n"
                + "1. Claudia López - Alianza Verde \n"
                + "2. Ángela Garzón - Centro Democrático \n"
                + "3. Miguel Uribe - Partido Liberal \n"
                + "4. Celio Nieves - Polo Democrático");
        opcionCandidatos = Integer.parseInt(optionNumber);
        
        switch(opcionCandidatos){
            case 1:
                JOptionPane.showMessageDialog(null, "Voto exitoso candidato No."+opcionCandidatos);
                cuentaVoto[0]+=1;
                votaron--;
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Voto exitoso candidato No."+opcionCandidatos);
                cuentaVoto[1]+=1;
                votaron--;
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Voto exitoso candidato No."+opcionCandidatos);
                cuentaVoto[2]+=1;
                votaron--;
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Voto exitoso candidato No."+opcionCandidatos);
                cuentaVoto[3]+=1;
                votaron--;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Voto Inválidado, no existe tal candidato", "Error", JOptionPane.ERROR_MESSAGE);
                break;
        }
                break;
                
             //----------------------------------
                
            case 2:
                
                JOptionPane.showMessageDialog(null, "No. votantes restantes en esta mesa: "+votaron +"\n"
                        + "Identificacion votantes que votaron: \n "
                        + "1. " + identificacionVotantes[0] + "\n"
                        + "2. " + identificacionVotantes[1] + "\n"
                        + "3. " + identificacionVotantes[2] + "\n"
                        + "4. " + identificacionVotantes[3] + "\n"
                        + "5. " + identificacionVotantes[4] + "\n"
                        + "6. " + identificacionVotantes[5] + "\n"
                        + "7. " + identificacionVotantes[6] + "\n"
                        + "8. " + identificacionVotantes[7] + "\n"
                        + "9. " + identificacionVotantes[8] + "\n"
                        + "10. " + identificacionVotantes[9] + "\n");     
                
                break;
            case 3:
                
                JOptionPane.showMessageDialog(null, "Conteo de votos por cantidato: \n"
                        + "Claudia López: "+ cuentaVoto[0]+"\n"
                        + "Ángela Garzón: "+ cuentaVoto[1]+"\n"
                        + "Miguel Uribe: "+ cuentaVoto[2]+"\n"
                        + "Celio Nieves: "+ cuentaVoto[3]+"\n");
                
                break;
            case 999:
                //NO HACER NADA
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion Invalida del menú", "Error", JOptionPane.ERROR_MESSAGE);
                break;
        }
        
        }while(!"999".equals(optionMenu));
        
        
        
        
    }
    
}
