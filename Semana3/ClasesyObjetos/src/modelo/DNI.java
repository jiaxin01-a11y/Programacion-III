package modelo;

public class DNI {
    //Atributos
    private int numero;
    private char letra;

    //Constructor
    public DNI(int numero) {
        this.numero = numero;
        this.letra = calcularLetra(numero);
    }

    //Métodos
    private char calcularLetra(int numero) {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = numero % 23;
        return letras.charAt(resto);
    }

    public int getNumero() {
        return this.numero;
    }

    public char getLetra() {
        return this.letra;
    }

    public String getDniCompleto() {
        return this.numero + "" + this.letra;
    }
}


