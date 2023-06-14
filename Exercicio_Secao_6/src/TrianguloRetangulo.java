import java.util.Scanner;

public class TrianguloRetangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Desenhar um retângulo");
        System.out.println("2 - Desenhar um triângulo");
        int opcao = sc.nextInt();

        if (opcao == 1) {
            System.out.println("Digite a largura do retângulo:");
            int largura = sc.nextInt();

            System.out.println("Digite a altura do retângulo:");
            int altura = sc.nextInt();

            criarRetangulo(largura, altura);
        } else if (opcao == 2) {
            System.out.println("Digite o tamanho do triângulo:");
            int tamanho = sc.nextInt();

            criarTriangulo(tamanho);
        } else {
            System.out.println("Opção inválida.");
        }

        sc.close();
    }

    public static void criarRetangulo(int largura, int altura) {
        if (largura < 1 || altura < 1) {
            System.out.println("As dimensões devem ser maiores ou iguais a 1.");
            return;
        }

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void criarTriangulo(int tamanho) {
        if (tamanho < 1) {
            System.out.println("O tamanho deve ser maior ou igual a 1.");
            return;
        }

        for (int i = 1; i <= tamanho; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
