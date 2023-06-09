package AtividadeSemana01;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> nomesAlunos = new ArrayList<>();
        ArrayList<Double[]> notasAlunos = new ArrayList<>();

        String aluno = "";
        Double[] notas;

        while(!aluno.equalsIgnoreCase("fim")){
            notas = new Double[3];

            System.out.println("Digite o nome do Aluno ou digite [fim] para finalizar");
            aluno =  sc.nextLine();

                if (!aluno.equalsIgnoreCase("fim")){
                    nomesAlunos.add(aluno);

                    for (int i = 0; i < 3; i++){
                        System.out.println("Digite a " + (i+1) + "ª nota do aluno " + aluno);
                        notas[i] = sc.nextDouble();
                        aluno = sc.nextLine();
                    }

                notasAlunos.add(notas);
                }
        }

        System.out.println("LISTA DE ALUNOS:");
        for (int i = 0; i < nomesAlunos.size(); i++) {
            Double[] notaAlunoMap = notasAlunos.get(i);
            Double media = 0.0;

            System.out.println("-----------------------------");
            System.out.println(nomesAlunos.get(i));
                for (Double nota: notaAlunoMap) {
                    System.out.println(nota);
                    media += nota;
                }
            media /= notaAlunoMap.length;
            System.out.println("média: " +  media);

            if (media >= 7.0) {
                System.out.println("O aluno " + nomesAlunos.get(i) + " está aprovado!");
            } else {
                System.out.println("O aluno " + nomesAlunos.get(i) + " está reprovado!");
            }
        }
    }
}
