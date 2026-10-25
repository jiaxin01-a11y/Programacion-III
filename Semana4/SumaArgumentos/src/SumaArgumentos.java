public class SumaArgumentos {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Error: Se requieren exactamente 2 argumentos numéricos.");
            return;
        }

        try {
            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[1]);
            double suma = num1 + num2;
            
            System.out.printf("La suma de %.2f y %.2f es: %.2f", num1, num2, suma);
        } catch (NumberFormatException e) {
            System.err.println("Error: Los argumentos deben ser números válidos.");
        }
    }
}