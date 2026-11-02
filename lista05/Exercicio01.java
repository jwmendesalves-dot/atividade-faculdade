import java.util.Scanner;

public class Exercicio01 {

    static Scanner sc = new Scanner(System.in);

    static String gerarLinha(char simbolo, int tamanho) {
        String linha = "";
        for (int i = 0; i < tamanho; i++) {
            linha = linha + simbolo;
        }
        return linha;
    }

    static void desenharTriangulo(int altura) {
        for (int i = 1; i <= altura; i++) {
            System.out.println(gerarLinha('*', i));
        }
    }

    public static void main(String[] args) {
        int[] alturas = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite a altura do triangulo " + (i + 1) + ": ");
            alturas[i] = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            desenharTriangulo(alturas[i]);
            System.out.println();
        }
    }
}
