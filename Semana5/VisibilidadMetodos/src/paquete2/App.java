package paquete2;

import paquete1.Clase1;
import paquete1.Clase2;

public class App {
    public static void main(String[] args) {
        Clase1 obj = new Clase1();

        System.out.println(obj.atributoPublic); // Funciona
        obj.metPublic();                   // Funciona

        // System.out.println(obj.atributoDefault); // ¡ERROR!
        // obj.metDefault();                   // ¡ERROR!

        // System.out.println(obj.atributoProtected); // ¡ERROR!
        // obj.metProtected();                   // ¡ERROR!

        // System.out.println(obj.atributoPrivate); // ¡ERROR!
        // obj.metPrivate();                   // ¡ERROR!
    }
}
