package notas;

public class Alumno {
    private String nombre;
    private double parcial1;
    private double parcial2;
    private double examenFinal;

    public Alumno(String nombre, double parcial1, double parcial2, double examenFinal) {
        this.nombre = nombre;
        this.parcial1 = parcial1;
        this.parcial2 = parcial2;
        this.examenFinal = examenFinal;
    }

    public String getNombre() { return nombre; }
    public double getParcial1() { return parcial1; }
    public double getParcial2() { return parcial2; }
    public double getExamenFinal() { return examenFinal; }

    public double getNotaFinalPonderada() {
        return (parcial1 * 0.10) + (parcial2 * 0.10) + (examenFinal * 0.80);
    }
}