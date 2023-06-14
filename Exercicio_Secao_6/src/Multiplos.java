import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        System.out.println("Múltiplos de " + numero + " de 1 a 12:");

        for (int i = 1; i <= 12; i++) {
            int resultado = numero * i;
            System.out.println(numero + "x" + i + " = " + resultado);
        }

        scanner.close();
    }
}
