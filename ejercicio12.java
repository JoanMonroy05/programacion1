import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el numero del cual desea conocer su factorial: ");
        int numero = scanner.nextInt();

        int factorial = 1;
        int iterador = 1;
        
        while (iterador <= numero){
            factorial *= iterador;
            iterador += 1;
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);
        
        scanner.close();
    }
}
