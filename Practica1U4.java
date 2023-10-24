package practica1u4;
import java.util.Scanner;
public class Practica1U4 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double[] elem = {20.5, 40.6,78.4, 94.7, 55.3, 22.6,84.3};

        while (true) {            
            
        System.out.println("******MENU*******");
        System.out.println("1.- SUMAR ");
        System.out.println("2.- MULTIPLICAR");
        System.out.println("3.- SALIR");
        System.out.println("*****************");
        
        int elea = scanner.nextInt();
       
        switch (elea){
        case 1:
            double suma = 0;
                for (double num : elem) { suma += num;}
                System.out.println("La suma de los elementos del arreglo es: " + suma);
                break;
        case 2:
        double producto = 1;
                for (double num : elem) {producto *= num;}
                System.out.println("El producto de los elementos del arreglo es: " + producto);
                break;
        case 3:
                System.out.println("XD");
               return;
        default:
                System.out.println("Opcion invalida ingrese una opcion del 1 al 3");
                
        scanner.close();       
               }
            }
        } 
    }
    

