import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1. Sumar. ");
        System.out.println("2. Restar. ");
        System.out.println("3. Multiplicar. ");
        System.out.println("4. Dividir. ");
        System.out.println("5. Modulo. ");

        System.out.print("Ingrese una opcion del menu (ej: 1,2,3,4,5): ");
        int opcion = scanner.nextInt();

        System.out.print("Ingrese un primer numero: ");
        int numero1 = scanner.nextInt();
        System.out.print("Ingrese un segundo numero: ");
        int numero2 = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("El resultado de la suma es: " + (numero1 + numero2));
                break;
            case 2: 
                System.out.println("El resultado de la resta es: " + (numero1 - numero2));
            break;
            case 3: 
                System.out.println("El resultado de la multiplicacion es: " + (numero1 * numero2));
            break;
            case 4: case 5: 
                if (numero2 == 0){
                    System.out.println("La division por cero no esta definida");
                }else if (opcion == 4){
                    System.out.printf("El resultado de la division es: %.2f", ((double)numero1 / numero2));
                }else{
                    System.out.println("El residuo de la division es: " + (numero1 % numero2));
                }
            break;
            default:
                System.out.println("La opcion " + opcion + " no hace parte del menu.");
                break;
        }
        
        scanner.close();
    }
}
