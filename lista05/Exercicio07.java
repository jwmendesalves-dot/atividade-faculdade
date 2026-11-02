import java.util.Scanner;

public class Exercicio07 {
    static Scanner sc = new Scanner(System.in);
    static String gerarIniciais(String nomeCompleto) {
        String[] partes = nomeCompleto.trim().split(" ");
        String iniciais = "";
        for (int i = 0; i < partes.length; i++) {
            if (partes[i].length() > 0) {
                iniciais = iniciais + partes[i].toUpperCase().charAt(0) + ".";
            }
        }
        return iniciais;
    }
    static void exibirChamada(String[] nomes) {
        for (int i = 0; i < nomes.length; i++) {
            System.out.println((i + 1) + ". " + nomes[i].toLowerCase() + " (" + gerarIniciais(nomes[i]) + ")");
        }
    }
    public static void main(String[] args) {
        String[] nomes = new String[4];

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite o nome completo do aluno " + (i + 1) + ": ");
            nomes[i] = sc.nextLine();
        }
        exibirChamada(nomes);
    }
}
