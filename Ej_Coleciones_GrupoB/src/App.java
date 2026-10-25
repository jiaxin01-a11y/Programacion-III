import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

import modelo.ComparadorPorApodo;
import modelo.ComparadorPorFechaDeNacimiento;
import modelo.Contacto;

public class App {
    public static void main(String[] args) throws Exception {
        // Crear la agenda (ArrayList)
        ArrayList<Contacto> agenda = new ArrayList<>();
        // Añadir contactos a agenda

        agenda.add(new Contacto("Juan José", "Juanjo", "655894890", 2006, 10, 11));
        agenda.add(new Contacto("Pedro", "Pedrito", "655895890", 2004, 10, 11));
        agenda.add(new Contacto("Juan José", "Pepe", "655894890", 2006, 10, 11));
        agenda.add(new Contacto("zara González", "zaza", "600111222", 1995, 5, 15));
        agenda.add(new Contacto("Lucas Martín", "Luki", "611223344", 1992, 1, 10));
        agenda.add(new Contacto("alberto Núñez", "alnu", "633445566", 1990, 3, 8));
        agenda.add(new Contacto("Beatriz Sánchez", "bea", "655667788", 1996, 9, 2));
        agenda.add(new Contacto("marcos Ruiz", "mark", "688999000", 1994, 12, 23));
        agenda.add(new Contacto("Clara Pérez", "clar", "622334455", 1994, 6, 30));
        agenda.add(new Contacto("Álvaro López", "alva", "677889900", 1991, 11, 25));
        agenda.add(new Contacto("Ximena Torres", "xime", "699112233", 1993, 7, 4));
        agenda.add(new Contacto("Ximena Torres", "xime", "699112233", 1993, 7, 4)); // duplicado

        // Mostrar agenda original
        System.out.println("📋 Contactos originales:");
        imprimirAgenda(agenda);

        // Orden natural (por nombre)
        Collections.sort(agenda);
        System.out.println("\n🔤 Ordenados por nombre (orden natural):");
        imprimirAgenda(agenda);

        // Orden por fecha de nacimiento
        Collections.sort(agenda, new ComparadorPorFechaDeNacimiento());

        System.out.println("\n📅 Ordenados por fecha de nacimiento:");
        imprimirAgenda(agenda);

        // Orden por apodo
        Collections.sort(agenda, new ComparadorPorApodo());

        System.out.println("\n🏷️ Ordenados por apodo:");
        imprimirAgenda(agenda);

        // HashMap: crear hashmap
        HashMap<String, Contacto> mapa = new HashMap<>();
        for (Contacto c : agenda) {
            mapa.put(c.getApodo(), c);
        }
        // HashMap: acceso por apodo
        Contacto tempContacto = mapa.get("Juanjo");
        if (tempContacto != null) {
            System.out.printf("%s\n", tempContacto.getNombreCompleto());
        } else {
            System.err.println("No se ha encontrado");
        }

        // HashMap: eliminar por apodo
        mapa.remove("Pepe");
        // HashMap: imprimir hashmap
        mapa.put("Juanjo", new Contacto("Juanito", "Juanjo", "655894890", 2006, 10, 11));

        System.out.println("Imprimimos el mapa");
        for (String clave : mapa.keySet()) {
            System.out.printf("%s %s\n", clave, mapa.get(clave).getNombreCompleto());
        }

        // System.out.println("\n🔍 Buscar por apodo \"xime\":");
        // System.out.println(agendaMap.get("xime"));

        // HashSet: eliminar duplicados
        HashSet <Contacto> agendaSinDuplicados = new HashSet<>(agenda);
        agendaSinDuplicados.add(new Contacto("Ximena Torres", "ximea", "699112233", 1993, 7, 4));
        System.out.println("\n🚫 Agenda sin duplicados:");
        imprimirAgenda(agendaSinDuplicados);
    }

    // 🖨️ Imprime una lista de contactos
    private static void imprimirAgenda(Collection<Contacto> agenda) {
        System.out.printf("| %-15s | %-8s | %-15s | %-10s |%n",
            "Nombre completo", "Apodo", "Teléfono", "Nacimiento");
        System.out.println("+-----------------+----------+-----------------+------------+");

        for (Contacto contact : agenda){
            //System.out.println(contact.getNombreCompleto() + " " + contact.getApodo() + " " + contact.getTelefono() + " " + contact.getAnoNacimiento() + "/" + contact.getMesNacimiento() + "/" + contact.getDiaNacimiento());
            System.out.printf("| %-15s | %-8s | %-15s | %04d/%02d/%02d |%n",
                contact.getNombreCompleto(),
                contact.getApodo(),
                contact.getTelefono(),
                contact.getAñoNacimiento(),
                contact.getMesNacimiento(),
                contact.getDiaNacimiento());
        }
    }
}
