import java.util.Scanner;

public class Exercicio10 {

    static Scanner sc = new Scanner(System.in);

    static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    static int somar(int[] v) {
        int soma = 0;
        for (int i = 0; i < v.length; i++) {
            soma = soma + v[i];
        }
        return soma;
    }
    static void exibir(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.print("Digite N (1 a 30): ");
        int n = sc.nextInt();

        if (n < 1 || n > 30) {
            System.out.println("Quantidade invalida");
            return;
        }
        int[] v = new int[n];

        for (int i = 0; i < n; i++) {
            v[i] = fibonacci(i);
        }
        exibir(v);
        System.out.println("Soma: " + somar(v));
    }
}
