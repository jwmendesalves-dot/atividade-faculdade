import java.util.Scanner;

public class Exercicio05 {
    static Scanner sc = new Scanner(System.in);
    static String paraBinario(int n) {
        if (n == 0) {
            return "0";
        }
        String binario = "";
        while (n > 0) {
            int resto = n % 2;
            binario = resto + binario;
            n = n / 2;
        }
        return binario;
    }
    static void exibirTabela(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i] + " = " + paraBinario(v[i]));
        }
    }
    public static void main(String[] args) {
        int[] v = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o numero " + (i + 1) + ": ");
            v[i] = sc.nextInt();
        }
        exibirTabela(v);
    }
}
