import java.util.Scanner;

public class ejercicio18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int LIMITE_PRIMOS = 100; // Límite para la impresión de números primos
        final int TOTAL_DIVISORES_PRIMO = 2; // Total de divisores para que un número sea primo

        // Verificación de si un número ingresado es primo
        System.out.print("Ingrese un número: ");
        int numeroIngresado = scanner.nextInt();

        int contadorDivisores = 0; // Contador de divisores
        for (int i = 1; i <= numeroIngresado; i++) {
            if (numeroIngresado % i == 0) {
                contadorDivisores++;
            }
        }

        // Verificación si es primo
        if (contadorDivisores == TOTAL_DIVISORES_PRIMO) {
            System.out.println(numeroIngresado + " es un número primo.");
        } else {
            System.out.println(numeroIngresado + " no es un número primo.");
        }

        // Impresión de números primos del 1 al LIMITE_PRIMOS
        System.out.println();
        System.out.println("-----Numeros primos del 1 al 100-----");
        System.out.println();
        
        System.out.print("Números primos del 1 al " + LIMITE_PRIMOS + ": ");
        for (int numeroActual = 1; numeroActual <= LIMITE_PRIMOS; numeroActual++) {
            contadorDivisores = 0; // Reiniciamos el contador para cada número
            for (int j = 1; j <= numeroActual; j++) {
                if (numeroActual % j == 0) {
                    contadorDivisores++;
                }
            }
            // Verificación si el número es primo
            if (contadorDivisores == TOTAL_DIVISORES_PRIMO) {
                System.out.print(numeroActual + ", ");
            }
        }
        //Cerramos el scanner
        scanner.close();
    }
}