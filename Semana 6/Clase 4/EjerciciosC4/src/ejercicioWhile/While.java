package ejercicioWhile;

public class While {

    public static void main(String[] args) {
        int contador = 1;
        int suma = 0;
        System.out.printf("%s\t%s\n", "Contador", "Suma");

        while (contador <= 4) {
            suma = suma + contador;
            System.out.printf("%d\t\t%d\n", contador, suma);
            contador = contador + 1;

        }
        
    }

}
