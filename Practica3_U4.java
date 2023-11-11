package practica3_u4;

public class Practica3_U4 {

    public static double[] CalEstudiantes(double[][] calificaciones) {
        double[] PromEstud = new double[calificaciones.length];
        for (int i = 0; i < calificaciones.length; i++) {
            double sumaCalificaciones = 0;
            for (int j = 0; j < calificaciones[i].length; j++) {
                sumaCalificaciones += calificaciones[i][j];
            }
            PromEstud[i] = sumaCalificaciones / calificaciones[i].length;
        }
        return PromEstud;
    }

    public static double[] calmaterias(double[][] calificaciones) {
        double[] PromMateria = new double[calificaciones[0].length];
        for (int j = 0; j < calificaciones[0].length; j++) {
            double sumaCalificaciones = 0;
            for (int i = 0; i < calificaciones.length; i++) {
                sumaCalificaciones += calificaciones[i][j];
            }
            PromMateria[j] = sumaCalificaciones / calificaciones.length;
        }
        return PromMateria;
    }

    public static void main(String[] args) {
        
        double[][] calificaciones = {
            {90.5, 85.0, 78.5, 92.0},
            {88.0, 76.5, 89.0, 94.5},
            {70.0, 82.5, 91.0, 87.5}
        };

        double[] promediosEstudiantes = CalEstudiantes(calificaciones);

        System.out.println("Promedios de estudiantes:");
        for (int i = 0; i < promediosEstudiantes.length; i++) {
            System.out.println("Estudiante " + i + ": " + promediosEstudiantes[i]);
        }

        double[] promediosMaterias = calmaterias(calificaciones);

        System.out.println("Promedios por materia:");
        for (int i = 0; i < promediosMaterias.length; i++) {
            System.out.println("Materia " + i + ": " + promediosMaterias[i]);
        }
    }
}

