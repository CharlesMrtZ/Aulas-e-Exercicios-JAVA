package AtividadeSemana01;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {

        ArrayList<String> nomesAlunos = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        boolean controle = true;

        while(controle){
            String aluno = "";
            System.out.println("Digite o nome do Aluno ou digite [fim] para finalizar");
            aluno =  sc.nextLine();
                if (aluno.equalsIgnoreCase("fim")){
                    controle = false;
                } else {
                    nomesAlunos.add(aluno);
                }
        }

        System.out.println("LISTA DE ALUNOS:");
        for (String nome: nomesAlunos) {
            System.out.println("-----------------------------");
            System.out.println(nome);
        }
    }
}
