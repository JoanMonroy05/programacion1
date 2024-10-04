import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        //Creamos el objeto para recibir datos por teclado
        Scanner scanner = new Scanner(System.in);
        //creamos el array y lo inicializamos en 5 posiciomes
        int[] numerosAPromediar = new int[5];
        //inicializamos una variable para acumular la suma de los numeros 
        int sumaNumeros = 0;
        
        //pedimos los numeros al usuario y los pasamos al array
        for (int i=0; i<numerosAPromediar.length; i++){
            System.out.print("Ingrese el numero " + (i+1) + " : ");
            numerosAPromediar[i] = scanner.nextInt();
        }
        //iteramos el array y vamos acumulando cada valor a la variable sumaNumeros
        for (int numero : numerosAPromediar){
            sumaNumeros += numero;  
        }
        //Calculamos el promedio de los numeros ingresaos para luego mostrarlo en pantalla
        double promedioNumeros = (double)sumaNumeros / numerosAPromediar.length; 

        System.out.println("El promedio de los numeros ingrsados es: " + promedioNumeros);
        
        scanner.close();
    }
}
