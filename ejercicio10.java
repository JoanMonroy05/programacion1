public class ejercicio10 {
    public static void main(String[] args){
        int contador = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                contador += 1;
            }
        }
        System.out.println("Entre 1 y 100 hay " + contador + " numeros pares");
    }
}
