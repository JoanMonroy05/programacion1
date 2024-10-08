import java.util.Scanner;

public class ejercicio04 {
    public static void main (String[] args){
        //Precios de las prendas
        double precioCamisa = 25.0;
        double precioPantalon = 30.0;
        //Descuentos 
        double descuento15 = 0.85;
        double descuento5 = 0.95;
        // Iniciqlizamos variable para acumular el precio a pagar 
        double totalPagar = 0.0;
        
        Scanner scanner = new Scanner(System.in);
        
        //Pedir la cantidad de prendas a usar 
        System.out.println("Ingrese la cantidad de camisetas (1 o 2): ");
        int cantidadCamisa = scanner.nextInt();
        System.out.println("Ingrese la cantidad de pantalones: ");
        int cantidadPantalon = scanner.nextInt();
        
        if(cantidadCamisa == 1){
            totalPagar += (precioCamisa * descuento15) + ((cantidadPantalon * precioPantalon) * descuento15);
            System.out.printf("Total: $ %.2f", totalPagar);
        }else if(cantidadCamisa == 2){
            totalPagar += (precioCamisa * descuento15) + ((precioCamisa * descuento15) * descuento5) + ((cantidadPantalon * precioPantalon) * descuento15);
            System.out.printf("Total: $ %.2f", totalPagar);
        }else{
            System.out.println("Ingreso una cantidad incorrecta de camisas " + cantidadCamisa);
        }
        
        scanner.close();
    }
}
