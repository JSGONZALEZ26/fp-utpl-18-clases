package ejercicioWhile;

import java.util.Scanner;

public class While2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int edad[] = new int[10];
        int suma;
        int suma2[] =new int[10];
        int contador;
        int limit;
        contador = 1;
        suma= 0;
        suma2[1]=0;
        System.out.println("Ingrese el número de edades a sumar: ");
        limit = entrada.nextInt();
        while (contador <= limit) {
            System.out.printf("Ingrese la edad del sujeto %d\n", contador);
            edad[contador] = entrada.nextInt();
            suma= suma + edad[contador];
            suma2[contador] = suma;
            contador = contador + 1;
        }

        contador = 1;
        System.out.printf("%s\t%s\n", "Edad", "Suma");
        while (contador <= limit) {
            System.out.printf("%s\t%s\n", edad[contador], suma2[contador]);
            contador = contador + 1;
        }
    }

}
