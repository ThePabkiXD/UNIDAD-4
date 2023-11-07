package practica2;

public class Practica2 {

    public static void main(String[] args) {
        char[][] Tabla = new char[3][5];

        char letra = 'a';

        for (int fil = 0; fil < 3; fil++) {
            for (int colum = 0; colum < 5; colum++) {
                Tabla[fil][colum] = letra;
                letra++;
            }
        }

        for (int fil1 = 0; fil1 < 3; fil1++) {
            for (int colum1 = 0; colum1 < 5; colum1++) {
                System.out.print(Tabla[fil1][colum1] + " ");
            }
            System.out.println();
        }
    }

}
