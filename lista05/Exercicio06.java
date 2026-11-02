import java.util.Scanner;

public class Exercicio06 {
    static Scanner sc = new Scanner(System.in);
    static int contarVogais(String texto) {
        String t = texto.toLowerCase();
        int cont = 0;
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                cont++;
            }
        }
        return cont;
    }
    static void exibirContagem(String[] frases) {
        int maior = 0;
        String fraseMaior = "";

        for (int i = 0; i < frases.length; i++) {
            int qtd = contarVogais(frases[i]);
            System.out.println(frases[i] + " - " + qtd + " vogais");
            if (qtd > maior) {
                maior = qtd;
                fraseMaior = frases[i];
            }
        }
        System.out.println("Frase com mais vogais: " + fraseMaior);
    }
    public static void main(String[] args) {
        String[] frases = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite a frase " + (i + 1) + ": ");
            frases[i] = sc.nextLine();
        }
        exibirContagem(frases);
    }
}
