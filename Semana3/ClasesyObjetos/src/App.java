import java.util.Scanner;

import modelo.Lector;
import modelo.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Lector lc = new Lector();
        
        Persona[] personas = new Persona[3];

        for (int i = 0; i < 3 ; i++) {
            personas[i] = new Persona();
            System.out.printf("\n--- Datos de la persona %d ---\n", i + 1);
            
            System.out.printf("Nombre: ");
            personas[i].setName(sc.nextLine());

            float altura = lc.leerFloat("Altura en centímetros: ");
            personas[i].setHeight(altura);

            float peso = lc.leerFloat("Peso en kilogramos: ");
            personas[i].setWeight(peso);

            int numeroDni = lc.leerInt("Número de DNI (sin letra): ");
            personas[i].setDniPorNumero(numeroDni);
        }

        Persona masAlta = personas[0];
        Persona masPesada = personas[0];

        for (int i = 1; i < 3; i++) {
            if (personas[i].getHeightInCm() > masAlta.getHeightInCm()) {
                masAlta = personas[i];
            }
            if (personas[i].getWeightInKg() > masPesada.getWeightInKg()) {
                masPesada = personas[i];
            }
        }

        System.out.println("\n=== RESULTADOS ===");
        System.out.printf("La persona más alta es %s, con DNI: %s\n", masAlta.getName(), masAlta.getdni().getDniCompleto());
        System.out.printf("La persona más pesada es %s, con DNI: %s\n", masPesada.getName(), masPesada.getdni().getDniCompleto());

        sc.close();
    }
}
