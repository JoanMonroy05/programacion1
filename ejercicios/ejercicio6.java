import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingres su nombre: "); 
        String nombre = scanner.nextLine();
        
        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();
        
        System.out.println("Ingrese su estatura en metros ej: 1.72: ");
        double estatura = scanner.nextDouble();
        
        System.out.println("Bienvenido " + nombre + " su edad es " + edad + " y su estatura es " + estatura);
        
        scanner.close();
    } 
}
