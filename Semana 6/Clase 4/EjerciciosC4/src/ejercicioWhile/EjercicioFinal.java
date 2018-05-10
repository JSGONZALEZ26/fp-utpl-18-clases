/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioWhile;

import java.util.Scanner;

/**
 *
 * @author Jairo
 */
public class EjercicioFinal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String cadenaFinal;
        double estatura;
        boolean ingreso = true;
        int contador = 1;
        double suma = 0;
        cadenaFinal = String.format("%s\n", "Estatura Estudiante");
        while (ingreso) {
            System.out.printf("Ingrese la estatura del estudiante %d\n", contador);
            estatura = entrada.nextDouble();
            suma = suma + estatura;
            cadenaFinal = String.format("%s%.2f\n", cadenaFinal, estatura);
            contador = contador + 1;
            entrada.nextLine();
            System.out.println("¿Desea ingresar una nueva estatura? (no para salir)");
            String confirmacion = entrada.nextLine();

            if ("no".equals(confirmacion)) {
                ingreso = false;
            }
        }
        Double promedio = suma /(contador-1);
        System.out.println("Reporte de Estaturas");
        System.out.printf("%s", cadenaFinal);
        System.out.printf("Promedio de Estaturas: %.2f\n", promedio);
        System.out.println("Reporte generado por Dep. Deportes");
    }
}
