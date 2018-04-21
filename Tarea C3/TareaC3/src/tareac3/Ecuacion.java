
package tareac3;

import java.util.Scanner;

/**
 *
 * @author Jairo
 */
public class Ecuacion {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int x;
        int y;
        
            
        System.out.println("Dada la variable X, se determinará el valor de Y en base a ciertas restricciones, ingrese un valor a la variable X");
        x = entrada.nextInt();
        
        if(x<0){
                y = 3*x +10;
                
                System.out.printf("El valor de Y en base a la ecuación: Y=3X+10 es: %d\n",y);
        }else{
            if(x>0){
                y = x*x+6;
                System.out.printf("El valor de Y en base a la ecuación: Y=X^2+6 es: %d\n",y);
            }else{
                if(x == 0){
                y = 1;
                    System.out.println("El valor de Y es igual a 1 ya que X es 0");
                }
            }
        }
        
    }
    
}
