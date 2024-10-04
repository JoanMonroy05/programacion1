import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el sugundo numero: ");
        int numero2 = scanner.nextInt();

        System.out.print("Ingrese el tercer numero: ");
        int numero3 = scanner.nextInt();

        if (numero1 == numero2 || numero1 == numero3 || numero2 == numero3) {
            System.out.println("Debe ingresar numeros diferentes 5");
        }else if (numero1 > numero2 && numero1 > numero3) {
            System.out.println(" El numero mayor es: " + numero1);
        }else if (numero2 > numero1 && numero2 > numero3){
            System.out.println("El numero mayor es: " + numero2);
        }else{
            System.out.println("El numero mayor es: " + numero3);
        }
        
        scanner.close();
    }
}
