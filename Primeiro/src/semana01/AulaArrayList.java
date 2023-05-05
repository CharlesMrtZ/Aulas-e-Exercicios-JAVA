package semana01;

import java.util.ArrayList;
import java.util.Scanner;

public class AulaArrayList {

    public static void main(String[] args) {
            ArrayList<Integer> listaIdade = new ArrayList<>();
//        ArrayList<Integer> numeros = new ArrayList<>();
//        System.out.println(numeros.size());
//        numeros.add(5);
//        numeros.add(100);
//        numeros.add(15);
//        numeros.add(2);
//        numeros.add(25);
//        System.out.println(numeros.size());
//        numeros.remove(0);
//        System.out.println(numeros.size());
//
//        numeros.forEach(System.out::println);
//
//        if (numeros.contains(15)) {
//            System.out.println("contém o numero 15");
//        };
//
//        numeros.clear();


        boolean controle = true;


        while (controle) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite a idade para adicionar na lista de idades");
            listaIdade.add(sc.nextInt());
            System.out.println("Deseja continuar 1-SIM 2-NAO");
            if (sc.nextInt()==2){
                controle = false;
            }
        }

    }
}
