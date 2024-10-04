public class ejercicio1 {
    public static void main(String[] args) {
        short edad = 17;
        float estatura = 1.72f;
        char inicialNombre = 'J';
        boolean menorEdad = false; 
        boolean mayorEdad = false; 

        if (edad < 18) {
            menorEdad = true;
        } else {
            mayorEdad = true;
        }

        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + estatura);
        System.out.println("Inicial del nombre: " + inicialNombre);
        System.out.println("Es mayor de edad: " + mayorEdad);
        System.out.println("Es menor de edad: " + menorEdad);
    }
}