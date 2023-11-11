package practica2_u4u5;

public class Practica2_U4U5 {
    public static int sumar (int a, int b){
        return a+b;
    }
    public static int restar (int a, int b){
        return a-b;
}
    public static int multiplicacion (int a, int b){
       return a*b;
    }
    public static int division (int a, int b){
        return a / b;
    }
    public static void main(String[] args) {
        int a = 15;
        int b = 20;
        
        System.out.println("Suma: " + sumar(a, b));
        System.out.println("Resta: " + restar(a, b));
        System.out.println("Multiplicacion: " + multiplicacion(a, b));
        System.out.println("Division: " + division(a, b));
    }
}
