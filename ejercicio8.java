import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un primer numero: ");
        int numero1 = scanner.nextInt();
        
        System.out.println("Ingrese un segundo numero: ");
        int numero2 = scanner.nextInt();
        
        System.out.println("Ingrese un tercer numero: ");
        int numero3 = scanner.nextInt();
        
        boolean resultado = (numero1 > numero2) && (numero1 < numero3);
        
        System.out.println("¿" + numero1 + " > " + numero2 + "? Y ¿" + numero1 + " < " + numero3 + "? => " + resultado);
    
        scanner.close();
    }
}
