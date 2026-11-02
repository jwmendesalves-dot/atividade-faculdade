import java.util.Scanner;

public class Exercicio04 {

    static Scanner sc = new Scanner(System.in);

    static void ordenar(int[] v) {
        int aux;
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = 0; j < v.length - 1 - i; j++) {
                if (v[j] > v[j + 1]) {
                    aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
            }
        }
    
    static boolean estaOrdenado(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            if (v[i] > v[i + 1]) {
                return false;
            }
        }
        return true;
    }
    static void exibir(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] v = new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.print("Digite o numero " + (i + 1) + ": ");
            v[i] = sc.nextInt();
        }
        System.out.print("Antes: ");
        exibir(v);
        System.out.println("Esta ordenado? " + estaOrdenado(v));
        ordenar(v);
        System.out.print("Depois: ");
        exibir(v);
        System.out.println("Esta ordenado? " + estaOrdenado(v));
    }
}