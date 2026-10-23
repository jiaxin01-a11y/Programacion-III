import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Programa que escoge el mayor de entre 3 números");
        System.out.println("-----------------------------------------------\n");
        System.out.println("Introduce el primer número: ");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo número: ");
        int num2 = sc.nextInt();
        System.out.println("Introduce el tercer número: ");
        int num3 = sc.nextInt();

        if(num1 > num2 && num1 > num3) {
            System.out.printf("El mayor de los tres es el %d", num1);
        }
        else if(num2 > num1 && num2 >num3) {
            System.out.printf("El mayor de los tres es el %d", num2);
        }
        else if (num3 > num1 && num3 > num2) {
            System.out.printf("El mayor de los tres es el %d", num3);
        }
        else if (num1 == num2 && num1 == num3) {
            System.out.printf("Los tres números son iguales: %d", num1);
        }
        else {
            int mayor = (num1 == num2 || num1 == num3) ? num1 : num2;
            System.out.printf("Existen dos números mayores que son iguales: %d", mayor);
        }

        sc.close();
    }
}
