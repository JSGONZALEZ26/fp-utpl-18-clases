/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioWhile;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Jairo
 */
public class While3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cadenaFinal;
        int suma = 0;
        int contador = 1;
        int edad = 0;
        cadenaFinal = String.format("%s\t%s\n", "Edad", "Suma");
        while (contador <= 5) {
            System.out.println("Ingrese el valor de la edad: ");
            edad = entrada.nextInt();
            suma = suma + edad;
            cadenaFinal = String.format("%s%d\t%d\n", cadenaFinal, edad, suma);
            contador = contador + 1;
        }
        System.out.printf("%s", cadenaFinal);
    }
}
