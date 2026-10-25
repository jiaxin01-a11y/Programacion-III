import java.util.Scanner;
import java.util.Arrays;

public class OrdenarCadenas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] palabras = new String[5];

        System.out.println("Introduzca 5 palabras (una a una):");
        
        // Recogida de datos
        for (int i = 0; i < palabras.length; i++) {
            System.out.print("Palabra " + (i + 1) + ": ");
            palabras[i] = scanner.nextLine();
        }

        // Ordenación alfabética mediante el método estático de utilidad
        Arrays.sort(palabras);

        // Mostrar resultado
        System.out.println("\nPalabras ordenadas alfabéticamente:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
        
        scanner.close();
    }
}