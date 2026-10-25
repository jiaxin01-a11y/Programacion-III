import notas.Alumno;
import es.usal.progiii.tools.Esdia;

public class App {
    public static void main(String[] args) {
        int numAlumnos = Esdia.readInt("Introduzca el número de alumnos del curso: ");
        
        // Creación del array de objetos Alumno[cite: 35]
        Alumno[] alumnos = new Alumno[numAlumnos];

        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("\n--- Datos del alumno " + (i + 1) + " ---");
            String nombre = Esdia.readString("Nombre: ");
            
            // Usamos el método sobrecargado con límites mínimo (0.0) y máximo (10.0)
            double p1 = Esdia.readDouble("Nota Parcial 1: ", 0.0, 10.0);
            double p2 = Esdia.readDouble("Nota Parcial 2: ", 0.0, 10.0);
            double ef = Esdia.readDouble("Nota Examen Final: ", 0.0, 10.0);
            
            alumnos[i] = new Alumno(nombre, p1, p2, ef);
        }
        double sumaP1 = 0, sumaP2 = 0, sumaFinal = 0, sumaGlobal = 0;
        String separador = "+" + "-".repeat(88) + "+";

        System.out.println("\n" + separador);
        System.out.printf("| %-20s | %-12s | %-12s | %-12s | %-15s |%n", "Alumno", "Parcial 1", "Parcial 2", "Ex. Final", "Nota Definitiva");
        System.out.println(separador);

        // Recorrer el array para imprimir y sumar[cite: 35]
        for (Alumno al : alumnos) {
            System.out.printf("| %-20.20s | %-12.2f | %-12.2f | %-12.2f | %-15.2f |%n", 
                al.getNombre(), al.getParcial1(), al.getParcial2(), al.getExamenFinal(), al.getNotaFinalPonderada());
            
            sumaP1 += al.getParcial1();
            sumaP2 += al.getParcial2();
            sumaFinal += al.getExamenFinal();
            sumaGlobal += al.getNotaFinalPonderada();
        }

        System.out.println(separador);
        System.out.printf("| %-20s | %-12.2f | %-12.2f | %-12.2f | %-15.2f |%n", 
            "MEDIAS DE LA CLASE", sumaP1 / numAlumnos, sumaP2 / numAlumnos, sumaFinal / numAlumnos, sumaGlobal / numAlumnos);
        System.out.println(separador);
    }
}