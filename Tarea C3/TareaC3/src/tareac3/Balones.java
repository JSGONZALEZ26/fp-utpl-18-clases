/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareac3;

import java.util.Scanner;

/**
 *
 * @author Jairo
 */
public class Balones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numerodebalones;
        double descuento;
        double valorporbalon;
        double subtotal;
        double valortotal;
        
        descuento = 0;
        
        System.out.println("Ingrese el valor del balón en USD");
        valorporbalon = entrada.nextDouble();
        
        System.out.println("Ingrese la cantidad de balones a comprar");
        numerodebalones = entrada.nextInt();
        
        if(numerodebalones == 1){
            descuento = 0.5;
        }else{
            if(numerodebalones == 2){
                descuento = 0.7;
            }else{
                if(numerodebalones >= 3){
                    descuento = 0.8;
                }
            }
        }
        
        subtotal = numerodebalones*valorporbalon;
        valortotal = subtotal - (subtotal*descuento);
        
        System.out.printf("El valor de cada balón es: %.2f\n", valorporbalon);
        System.out.printf("El valor neto a pagar es: %.2f\n", subtotal);
        System.out.printf("El valor total a pagar por %d balon(es) es: %.2f\n", numerodebalones, valortotal);
        
    }
    
}
