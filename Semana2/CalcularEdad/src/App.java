import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Programa que calcula la edad.");
        System.out.println("-----------------------------");

        System.out.println("Introduce el año de nacimiento: ");
        int nacimiento = sc.nextInt();

        System.out.println("Introduce el año actual: ");
        int anioActual = sc.nextInt();
        
        System.out.printf("La edad que tendrá alguien que ha nacido en %d en el "+
        "año %d será de %d años", nacimiento, anioActual, anioActual-nacimiento);
        
        sc.close();
    }
}