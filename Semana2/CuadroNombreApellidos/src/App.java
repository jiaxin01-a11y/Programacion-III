import java.io.Console;

public class App {
    public static void main(String[] args) throws Exception {

        Console console = System.console();
        
        if (console == null) {
            System.err.println("No hay una consola disponible. Ejecuta el programa desde una terminal.");
            return;
        }  

        String nombre = console.readLine("Introduce tu nombre: \n");
        String apellidos = console.readLine("Introduce tus apellidos: \n");
        
        int anchoCol1 = Math.max(6, nombre.length());
        int anchoCol2 = Math.max(9, apellidos.length());
        int totalAsteriscos = anchoCol1 + anchoCol2 + 7;

        String formatoFila = "* %-" + anchoCol1 + "s * %-" + anchoCol2 + "s *%n"; 

        for (int i = 0; i < totalAsteriscos; i++) { 
            console.printf("*"); 
        }
        console.printf("\n");
        
        // Fila 1
        console.printf(formatoFila, "Nombre", "Apellidos");
        
        for (int i = 0; i < totalAsteriscos; i++) { 
            console.printf("*"); 
        }
        console.printf("\n");
        
        // Fila 2
        console.printf(formatoFila, nombre, apellidos);
        
        for (int i = 0; i < totalAsteriscos; i++) { 
            console.printf("*"); 
        }
        console.printf("\n");
    }
}
