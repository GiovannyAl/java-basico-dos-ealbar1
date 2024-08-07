import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el método para realizar la sumatoria de 1 a 10:");
        System.out.println("1. Utilizando for");
        System.out.println("2. Utilizando while");
        int opcion = scanner.nextInt();

        int suma = 0;

        switch (opcion) {
            case 1:
                for (int i = 1; i <= 10; i++) {
                    suma += i;
                }
                System.out.println("Sumatoria utilizando for: " + suma);
                break;

            case 2:
                int i = 1;
                while (i <= 10) {
                    suma += i;
                    i++;
                }
                System.out.println("Sumatoria utilizando while: " + suma);
                break;

            default:
                System.out.println("Opción no válida");
                break;
        }
        scanner.close();
    }
}