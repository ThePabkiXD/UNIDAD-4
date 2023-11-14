package tarea;

import java.util.Scanner;

public class Tarea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        int filas;

        do {
            // Mostrar menú
            System.out.println("Menu:");
            System.out.println("1. Piramide de asteriscos");
            System.out.println("2. Piramide de letras");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el numero de filas: ");
                    filas = scanner.nextInt();
                    PiramideAsteriscos(filas);
                    break;
                case 2:
                    System.out.print("Ingrese el numero de filas: ");
                    filas = scanner.nextInt();
                    PiramideLetras(filas);
                    break;
                case 0:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        } while (opcion != 0);

        scanner.close();
    }

    private static void PiramideAsteriscos(int filas) {
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void PiramideLetras(int filas) {
        int valor = 1;
        char letra = 'A';

        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print(letra);
                    letra++;
                } else {
                    System.out.print(valor);
                    valor++;
                }
            }
            System.out.println();
        }
    }
}
