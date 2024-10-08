public class ejercicio15 {
    
    public static void main(String[] args) {
        //Uso de un ciclo for para recorrer los numero del 0 al 100
        for(int i = 0; i <= 100; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("fizzbuzz");
            }else if(i % 3 == 0){
                System.out.println("fizz");
            }else if(i % 5 == 0){
                System.out.println("buzz");
            }else{
                System.out.println(i);
            }
        }
    }
    
}