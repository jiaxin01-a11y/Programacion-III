package modelo;

public class Persona {
    // Atributos aquí arriba
    private String name;
    private float weightInKg;
    private float heightInCm;
    private DNI dni;

    // Constructor o constructores
    public Persona() {
        this.name = "";
        this.weightInKg = 0.0f;
        this.heightInCm = 0.0f;
        this.dni = new DNI(0);
    }

    public Persona(String name, float weightInKg, float heightInCm, int numeroDNI) {
        this.name = name;
        this.weightInKg = weightInKg;
        this.heightInCm = heightInCm;
        this.dni = new DNI(numeroDNI);
    }
    
    // Métodos
    public float CalcularIMC() {
        if (this.heightInCm <= 0 || this.weightInKg <= 0) {
            System.err.printf("Error: Valores inválidos para %s. No se puede calcular el IMC.\n", this.name);
            return -1.0f;
        }
        return this.weightInKg / ((heightInCm * heightInCm) / 10000.0f);
    }

    // Getters y setters
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public float getWeightInKg() {
        return this.weightInKg;
    }
    public void setWeight(float weightInKg) {
        this.weightInKg = weightInKg;
    }

    public float getHeightInCm() {
        return this.heightInCm;
    }
    public void setHeight(float heightInCm) {
        this.heightInCm = heightInCm;
    }

    public DNI getdni() {
        return this.dni;
    }
    public void setDniPorNumero(int numeroDNI) {
        this.dni = new DNI(numeroDNI);
    }
}

