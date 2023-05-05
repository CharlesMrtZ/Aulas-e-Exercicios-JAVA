package AtividadeSemana01;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String controle = "";

        while(!controle.equalsIgnoreCase("fim")){
            System.out.println("Digite o nome do Aluno ou digite [fim] para finalizar");
            controle =  sc.nextLine();
            System.out.println(controle);
        }
    }
}
