import es.usal.progiii.tools.Esdia;

public class App {
    public static void main(String[] args) throws Exception {
        
    int numero;
        do {
            numero = Esdia.readInt("Introduzca un número entero mayor que 0: ");
            if (numero <= 0) {
                System.err.println("Error: El número introducido debe ser mayor que 0. Inténtelo de nuevo.");
            }
        } while (numero <= 0);

    double suma = 0;
        for (int i = 1; i <= numero; i++) {
            double introducido = Esdia.readDouble("Introduce un número de coma flotante: ");
            suma += introducido;
        }

    double mediaAritmetica = suma / numero;
    System.out.printf("La media aritmética de los números introducidos es de %.2f", mediaAritmetica);

    }
}
