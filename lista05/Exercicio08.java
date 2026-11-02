import java.util.Scanner;

public class Exercicio08 {
    static Scanner sc = new Scanner(System.in);
    static String maiorPalavra(String[] palavras) {
        String maior = palavras[0];
        for (int i = 1; i < palavras.length; i++) {
            if (palavras[i].length() > maior.length()) {
                maior = palavras[i];
            }
        }
        return maior;
    }
    static void exibirPalavras(String[] palavras) {
        for (int i = 0; i < palavras.length; i++) {
            System.out.println((i + 1) + ". " + palavras[i]);
        }
        System.out.println("Total de palavras: " + palavras.length);
        System.out.println("Maior palavra: " + maiorPalavra(palavras));
    }
    public static void main(String[] args) {
        System.out.print("Digite a frase: ");
        String frase = sc.nextLine();
        String[] palavras = frase.trim().split(" ");
        exibirPalavras(palavras);
    }
}
