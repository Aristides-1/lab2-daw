import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculadora = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int a = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int b = scanner.nextInt();

        System.out.println("¿Qué operación deseas?");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Módulo");
        System.out.print("Elige una opción: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Resultado: " + calculadora.add(a, b));
                break;
            case 2:
                System.out.println("Resultado: " + calculadora.sub(a, b));
                break;
            case 3:
                System.out.println("Resultado: " + calculadora.mul(a, b));
                break;
            case 4:
                System.out.println("Resultado: " + calculadora.div(a, b));
                break;
            case 5:
                System.out.println("Resultado: " + calculadora.mod(a, b));
                break;
            default:
                System.out.println("Opción no válida");
        }

        scanner.close();
    }
}
