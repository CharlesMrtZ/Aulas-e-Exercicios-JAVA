package AtividadeSemana01;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {

        ArrayList<String> nomesAlunos = new ArrayList<>();
        ArrayList<Double[]> notasAlunos = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
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
                    System.out.println(notasAlunos.size());
                }
        }

        System.out.println("LISTA DE ALUNOS:");
        for (String nome: nomesAlunos) {
            System.out.println("-----------------------------");
            System.out.println(nome);
        }
    }
}
