package semana01;

import java.util.Scanner;

public class Exercicio01Aula03 {

    public static void main(String[] args) {

        double[] notas = new double[3];
        double media = 0.0;

        Scanner entrada = new Scanner(System.in);

        for ( int i =  0; i < notas.length; i++) {
            System.out.println("digite a primeira nota");
            notas[i] = entrada.nextDouble();
            media += notas[i];
        }

        double total = media/ notas.length;

        System.out.println(total);
    }
}
