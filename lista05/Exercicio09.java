import java.util.Scanner;

public class Exercicio09 {

    static Scanner sc = new Scanner(System.in);
    static long potencia(int base, int expoente) {
        if (expoente == 0) {
            return 1;
        }
        return base * potencia(base, expoente - 1);
    }
    static void exibirPotencias(int[] bases, int expoente) {
        for (int i = 0; i < bases.length; i++) {
            String base = "" + bases[i];
            if (bases[i] < 0) {
                base = "(" + bases[i] + ")";
            }
            System.out.println(base + "^" + expoente + " = " + potencia(bases[i], expoente));
        }
    }

    public static void main(String[] args) {
        int[] bases = new int[5]

        System.out.print("Digite o expoente: ");
        int expoente = sc.nextInt();
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a base " + (i + 1) + ": ");
            bases[i] = sc.nextInt();
        }
        exibirPotencias(bases, expoente);
    }
}
