package semana01;

import java.util.Scanner;

// leia nome até que fim seja digitado
// e notas ( 3 notas )
// ao final calcule a média e apresente nome e média

public class ExercicioAula03 {

    public static void main(String[] args) {
        String nome = "";
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do aluno ou FIM para finalizar");
        nome = entrada.next();

        while(!nome.equalsIgnoreCase("FIM")) {
            double nota1, nota2, nota3;

            System.out.println("Digite a nota 1");
            nota1 = entrada.nextDouble();

            System.out.println("Digite a nota 2");
            nota2 = entrada.nextDouble();

            System.out.println("Digite a nota 3");
            nota3 = entrada.nextDouble();

            double media = (nota1 + nota2 + nota3 / 3);
            System.out.println("A media do aluno " + nome +  "foi " + media);

            System.out.println("Digite o nome do aluno ou FIM para finalizar");
            nome = entrada.next();
        }

        entrada.close();
    }
}
