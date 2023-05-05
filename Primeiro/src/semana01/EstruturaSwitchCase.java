package semana01;

import java.util.Scanner;

public class EstruturaSwitchCase {
    public static void main(String[] args) {

        System.out.println("Digite um numero inteiro");
        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();

        switch (n){
            case 1 :
                System.out.println("Valor é 1");
                break;
            case 2 :
                System.out.println("Valor é 2");
                break;
            case 3 :
                System.out.println("Valor é 3");
                break;
            default :
                System.out.println("não está na lista");

        }
    }
}
