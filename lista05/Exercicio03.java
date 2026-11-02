import java.util.Scanner;

public class Exercicio03 {

    static Scanner sc = new Scanner(System.in);

    static boolean ehPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    static int contarPrimos(int[] v) {
        int cont = 0;
        for (int i = 0; i < v.length; i++) {
            if (ehPrimo(v[i])) {
                cont++;
            }
        }
        return cont;
    }
    static void exibirPrimos(int[] v) {
        System.out.print("Primos: ");
        for (int i = 0; i < v.length; i++) {
            if (ehPrimo(v[i])) {
                System.out.print(v[i] + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] v = new int[8];

        for (int i = 0; i < 8; i++) {
            System.out.print("Digite o numero " + (i + 1) + ": ");
            v[i] = sc.nextInt();
        }
        exibirPrimos(v);
        System.out.println("Quantidade de primos: " + contarPrimos(v));
    }
}
