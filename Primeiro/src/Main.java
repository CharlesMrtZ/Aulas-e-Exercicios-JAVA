import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;

        System.out.println("Hello Universe!");

        System.out.println("Digite seu nome para o universo:");
        nome = scanner.nextLine();

        System.out.println(nome.equals("Charles Martinazzo")
                ? nome + ", você é o senhor do Universo."
                : nome + ", o Universo disse olá para você também.");
    }
}