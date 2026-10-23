import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        int edad1 = sc.nextInt();

        sc.nextLine();

        System.out.print("Introduce tu nombre: ");
        String nombre1 = sc.nextLine();

        System.out.printf("Te llamas %s y tienes %d años.\n\n", nombre1, edad1);

        System.out.print("Introduce tu edad: ");
        int edad2 = Integer.parseInt(sc.nextLine()); 

        System.out.print("Introduce tu nombre: ");
        String nombre2 = sc.nextLine();

        System.out.printf("Te llamas %s y tienes %d años.\n\n", nombre2, edad2);
        
        sc.close();
    }
}
