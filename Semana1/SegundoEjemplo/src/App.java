import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Programa que pida un entero al usuario y repita el mensaje "Hello World!"
        //el número de veces que ha indicado el usuario. Empleando Scanner.
        java.util.Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("Hello, World!");
        }   
    }
}
