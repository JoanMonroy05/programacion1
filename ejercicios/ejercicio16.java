import java.util.Scanner;

public class ejercicio16 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese una palabra: ");
        String palabra1 = scanner.nextLine().toUpperCase();
        System.out.println("Ingresa una segunda palabra");
        String palabra2 = scanner.nextLine().toUpperCase();
        //Inicializamos una variable contadora
        int contador = 0;
        
        int long_palabra1 = palabra1.length();//Longitud de la primera palabra
        int long_palabra2 = palabra2.length();//Longitud de la segunda palabra 
        
        //Validamos el caso en el que las palabras sean iguales o sus longitudes sean diferentes 
        if(palabra1.equals(palabra2) || long_palabra1 != long_palabra2){
            System.out.println("No son anagramas");
        }else{//Si la condicion inicial no se cumple debemos verificar si son o no anagramas
            char[] caracter_palabra1 = palabra1.toCharArray();//Convertimos la palabra 1 a un array
            char[] caracter_palabra2 = palabra2.toCharArray();//Convertimos la palabra 2 a un array
            
            //Recorremos los array y vamos comprando letra por letra
            for(int i = 0; i < long_palabra1; i++){
                for(int j = 0; j < long_palabra2; j++){
                    if(caracter_palabra1[i] == caracter_palabra2[j]){
                        contador ++;//Aumentamos el contador
                        caracter_palabra2[j] = ' ';//Cuando la palabra es encontrada la reemplazamos por ' '
                        break;
                    }
                }
            }
            if(contador == long_palabra1){//Si el contador y la longitud de palabra son iguales
                System.out.println("Son anagramas");
            }else{
                System.out.println("No son anagramas");
            }
        }
        //Cerramos el scanner 
        scanner.close();
    }
    
}