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
public class Grados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double grados;
        int tipo;
        double newgrados;
        
        System.out.println("Ingrese los grados a convertir");
        grados = entrada.nextDouble();
        
        System.out.println("Ingrese el tipo de conversión a realizar según el número de procedimiento:\n1: Celcius a Fahrenheit\n2: Fahrenheit a Celcius");
        tipo = entrada.nextInt();
        
        if(tipo == 1){
            newgrados = grados*9/5+32;
            System.out.printf("%.2f grados Celcius es igual a %.2f grados Fahrenheit\n",grados, newgrados);
        }else{
            newgrados = (grados-32)*5/9;
            System.out.printf("%.2f grados Fahrenheit es igual a %.2f grados Celcius\n",grados, newgrados);
        }
                
    }
    
}
