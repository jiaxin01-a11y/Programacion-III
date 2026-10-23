import java.io.Console;

public class App {
    public static void main(String[] args) throws Exception {
        
        Console console = System.console();

        if (console == null) {
            System.err.println("No hay una consola disponible. Ejecuta el programa desde una terminal.");
            return;
        }
        
        console.printf("Programa que calcula la edad.\n");
        console.printf("-----------------------------\n");

        String inputNacimiento = console.readLine("Introduce el año de nacimiento: \n");
        int nacimiento = Integer.parseInt(inputNacimiento);

        String inputAnioActual = console.readLine("Introduce el año actual: ");
        int anioActual = Integer.parseInt(inputAnioActual);
        
        console.printf("La edad que tendrá alguien que ha nacido en %d en el "+
        "año %d será de %d años", nacimiento, anioActual, anioActual-nacimiento);
    }
}