import java.util.Scanner;

public class ejercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese las ventas de tres semanas
        System.out.print("Ingrese las ventas de la primera semana (en pesos colombianos): ");
        int ventasSemana1 = scanner.nextInt();
        
        System.out.print("Ingrese las ventas de la segunda semana (en pesos colombianos): ");
        int ventasSemana2 = scanner.nextInt();
        
        System.out.print("Ingrese las ventas de la tercera semana (en pesos colombianos): ");
        int ventasSemana3 = scanner.nextInt();

        // Calcular el promedio de ventas
        double promedioVentas = (double)(ventasSemana1 + ventasSemana2 + ventasSemana3) / 3;
            
        System.out.printf("El promedio de ventas semanales de las tres semanas es: $%.2f", promedioVentas);
    
        scanner.close();
    }
}
