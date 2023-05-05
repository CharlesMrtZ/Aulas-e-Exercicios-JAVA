package semana01;

import java.util.Scanner;

public class EstruturaCondicional {

    public static void main(String[] args) {
        int n;
        int m;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Difina o valor de n sendo um inteiro");
        n = entrada.nextInt();

        System.out.println("Difina o valor de m sendo um inteiro");
        m = entrada.nextInt();


        if (( n + m == 3) || (n > 0 && m < 10)) {
            System.out.println("é igual a 3");
        } else {
            System.out.println("não é igual a 3");
        }



    }
}
