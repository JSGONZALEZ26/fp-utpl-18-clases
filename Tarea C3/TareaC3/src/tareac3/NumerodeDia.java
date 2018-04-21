
package tareac3;

import java.util.Scanner;

/**
 *
 * @author Jairo
 */
public class NumerodeDia {
    
    public static void main(String[] args) {
        
        /*declaración de variables e importación de Scanner*/
        
        Scanner entrada = new Scanner(System.in);
        
        int dia;
        
        /*Inicio*/
        
            System.out.println("Ingrese un numero de día, (del 1 al 7):");
            
            dia = entrada.nextInt();
       
       /*procesos*/
            
             switch(dia){
                 case 1:
                     System.out.println("Lunes");
                     break;
                 case 2:
                     System.out.println("Martes");
                     break;
                 case 3:
                     System.out.println("Miercoles");
                     break;
                 case 4:
                     System.out.println("Jueves");
                     break;
                 case 5:
                     System.out.println("Viernes");
                     break;
                 case 6: 
                     System.out.println("Sábado");
                     break;
                 case 7:
                     System.out.println("Domingo");
                     break;
                 default:
                     System.out.println("Ninguno de los anteriores");
                         
             }
        
    }
    
}
