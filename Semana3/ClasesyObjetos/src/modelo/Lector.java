package modelo;

import java.util.Scanner;

public class Lector {
    private Scanner sc;

    public Lector() {
        this.sc = new Scanner(System.in);
    }

    public float leerFloat(String mensaje) {
        float numero = 0.0f;
        boolean datoValido = false;

        while (!datoValido) {
            System.out.println(mensaje);
            String entrada = sc.nextLine();

            try {
                numero = Float.parseFloat(entrada);
                datoValido = true;
            } catch (NumberFormatException e) {
                System.err.println("Error: Formato incorrecto, Debes introducir un número válido.");
            }
        }
        return numero;
    }

    public int leerInt(String mensaje) {
        int numero = 0;
        boolean datoValido = false;

        while (!datoValido) {
            System.out.println(mensaje);
            String entrada = sc.nextLine();

            try {
                numero = Integer.parseInt(entrada);
                datoValido = true;
            } catch (NumberFormatException e) {
                System.err.println("Error: Formato incorrecto, Debes introducir un número válido.");
            }
        }
        return numero;
    }
}

