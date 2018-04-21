
package tareac3;

import java.util.Scanner;

/**
 *
 * @author Jairo
 */
public class VentadeCelulares {
    
    public static void main(String[] args) {
        
        /*declaración de variables e importación de Scanner*/
        
        Scanner entrada = new Scanner(System.in);
        
            int tipo;
            
            String nombre;
            String apellido;
            
            int cantidaddecelulares;
            int precioindividual;
            int subtotal;
            double descuento;            
            double valortotal;
            descuento = 0;
            precioindividual = 300;
            
            System.out.println("Ingrese el nombre del cliente");
            nombre = entrada.nextLine();
            
            System.out.println("Ingrese el apellido del cliente");
            apellido = entrada.nextLine();
            
            System.out.println("Ingrese el número de celulares a comprar");
            cantidaddecelulares = entrada.nextInt();
            
            System.out.println("Ingrese el tipo de cliente");
            tipo = entrada.nextInt();
            
            subtotal = cantidaddecelulares*precioindividual;
            
            switch(tipo){
                case 1:
                    descuento = subtotal*0.1;            
                    valortotal = subtotal-descuento;
                    break;
                case 2:
                    descuento = subtotal*0.2;                    
                    valortotal = subtotal-descuento;
                    break;
                case 3:
                    descuento = subtotal*0.3;                   
                    valortotal = subtotal-descuento;
                    break;
                default:
                    valortotal = subtotal;
                    break;
            
            }
            
             System.out.printf("Nombre: %s %s\n Tipo de Cliente: %d\n Cantidad de celulares: %d\n Precio por cada celular: %d\n "
                     + "Subtotal a pagar: %d\n Descuento: %.2f\n "
                     + "Valor final a pagar: %.2f\n", nombre, apellido, tipo, cantidaddecelulares, precioindividual, subtotal, descuento, valortotal);
             
                         
       
        
    }
    
}
