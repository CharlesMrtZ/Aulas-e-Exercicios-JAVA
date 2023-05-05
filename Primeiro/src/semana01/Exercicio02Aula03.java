package semana01;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Exercicio02Aula03 {

    public static void main(String[] args) {

        ArrayList<String> listaModelos = new ArrayList<>();

        boolean controle = true;

        while (controle) {
            Scanner entrada = new Scanner(System.in);

            System.out.println("Digite um modelo de veículo:");
            listaModelos.add(entrada.nextLine());
            System.out.println("Digite [fim] para finalizar");
                if (Objects.equals(entrada.nextLine(), "fim")){
                    controle = false;
                }
        }
            System.out.println("Modelos de veiculos:");
            listaModelos.forEach(nomes -> System.out.println(nomes));
    }
}
