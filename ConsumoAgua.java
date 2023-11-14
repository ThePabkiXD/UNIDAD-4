package javaapplication6;

public class JavaApplication6 {

    public static int[] litros(int[][] Consum) {
        int[] LitrosCasa = new int[Consum.length];
        for (int i = 0; i < Consum.length; i++) {
            int SumaLitros = 0;
            for (int j = 0; j < Consum[i].length; j++) {
                SumaLitros += Consum[i][j];
            }
            LitrosCasa[i] = SumaLitros;
        }
        return LitrosCasa;
    }

    public static int[] LitrosDiario(int[][] Consum) {
        int[] LitrosDiario = new int[Consum[0].length];
        for (int j = 0; j < Consum[0].length; j++) {
            int LitroDia = 0;
            for (int i = 0; i < Consum.length; i++) {
                LitroDia += Consum[i][j];
            }
            LitrosDiario[j] = LitroDia;
        }
        return LitrosDiario;
    }

    public static void main(String[] args) {
        int[][] Consum = {
            {100, 50, 36, 120, 60},
            {32, 122, 46, 80, 90},
            {45, 100, 56, 26, 36},
            {60, 110, 72, 33, 40},};
        
        int[] LitrosDiario1 = LitrosDiario(Consum);

        System.out.println("Litros Diarios:");
        for (int i = 0; i < LitrosDiario1.length; i++) {
            System.out.println("Dia 1 " + i + ": " + LitrosDiario1[i]);
        }
        
        int[] LitrosCasa = litros (Consum);
        System.out.println("Litros por Casa:");
        for (int i = 0; i < LitrosCasa.length; i++) {
            System.out.println("Casa 1 " + i + ": " + LitrosCasa[i]);
        }
      
    }

}
