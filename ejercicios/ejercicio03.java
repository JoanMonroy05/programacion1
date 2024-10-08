import java.util.Scanner;

public class ejercicio03 {
    public static void main(String[] args) {
        Scanner leerPorConsola = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int numero1 = leerPorConsola.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int numero2 = leerPorConsola.nextInt();
        
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        float division = (float)numero1 / numero2; //Casting
        int modulo = numero1 % numero2;
        
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + division);
        System.out.println("Modulo: " + modulo);
        
        leerPorConsola.close();
    }
}
