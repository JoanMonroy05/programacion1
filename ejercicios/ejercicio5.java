public class ejercicio5 {
    public static void main(String[] args) {
        int saldoInicial = 1000; //saldo inicial en la cuenta
        final int RETIRO_SEMANAL = 200; //retiro fijo semanal
        
        byte cantidadSemanas = 4; //cantidad de semanas por mes 
        int saldoFinal = saldoInicial - (RETIRO_SEMANAL * cantidadSemanas);
            
        System.out.println("El saldo final despues de los retiros es $" + saldoFinal);
    }
}
