package semana01;

import java.util.Scanner;

public class ExercicioAula01 {

//    Solicite 3 notas de 0.0 a 10.0 , após a terceira nota apresente
//    o resultado de aprovação , para aprovação o aluno deve possuir
//    média superior ou igual a 7.0 ;
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nomeAluno;
        int qtdNotas = 3;
        double mediaAprovacao = 7.0;
        int numeroFaltas = 4;
        double nota1;
        double nota2;
        double nota3;
        double media;

        System.out.println("Qual o nome do aluno?");
        nomeAluno = entrada.nextLine();

        System.out.println("Qual foi a primeira nota do aluno " + nomeAluno + "?");
        nota1 = entrada.nextDouble();

        System.out.println("Qual foi a segunda nota do aluno " + nomeAluno + "?");
        nota2 = entrada.nextDouble();

        System.out.println("Qual foi a terceira nota do aluno " + nomeAluno + "?");
        nota3 = entrada.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

            System.out.println((media >= 7.0)
                ? "A média do aluno " + nomeAluno + " foi " + media + " e ele está aprovado"
                :"A média do aluno " + nomeAluno + " foi " + media + " e ele está reprovado");

    }
}
