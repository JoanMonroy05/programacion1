import java.util.Scanner;

public class ejercicio17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        // Variables iniciales de la serie de Fibonacci
        int a = 0;
        int b = 1;

        System.out.println("Ingrese la cantidad de números que quiere ver de la serie Fibonacci: ");
        int cantidadNum = scanner.nextInt();
        
        // Imprimir los primeros dos números de la serie si la cantidad lo permite
        if (cantidadNum >= 1) {
            System.out.print(a);
        }
        if (cantidadNum >= 2) {
            System.out.print(", " + b);
        }

        // Continuar la serie hasta la cantidad solicitada
        for (int i = 2; i < cantidadNum; i++) {
            int siguiente = a + b;
            System.out.print(", " + siguiente);
            a = b;
            b = siguiente;
        }
        System.out.println(); // Salto de línea 
        //Cerramos el scanner 
        scanner.close();
    }
}