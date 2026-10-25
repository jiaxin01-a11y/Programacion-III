public class Usuario {
    private String nombre;
    private double peso;
    private double altura;

    private Usuario(String nombre, double peso, double altura) {
        this.nombre = nombre;
        this.peso = peso;
        this.altura = altura;
    }

    public static Usuario crearDesdeArgumentos(String[] args) {
        if (args.length < 3) {
            throw new IllegalArgumentException("Faltan argumentos. Se requiere: nombre, peso y altura.");
        }
        String nombre = args[0];
        double peso = Double.parseDouble(args[1]);
        double altura = Double.parseDouble(args[2]);
        
        return new Usuario(nombre, peso, altura);
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public void mostrarTabla() {
        System.out.printf("%-15s | %-10s | %-10s | %-10s%n", "Nombre", "Peso (kg)", "Altura (m)", "IMC");
        System.out.println("-".repeat(55));
        System.out.printf("%-15s | %-10.2f | %-10.2f | %-10.2f%n", nombre, peso, altura, calcularIMC());
    }

    public static void main(String[] args) {
        try {
            Usuario usuario = Usuario.crearDesdeArgumentos(args);
            usuario.mostrarTabla();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}