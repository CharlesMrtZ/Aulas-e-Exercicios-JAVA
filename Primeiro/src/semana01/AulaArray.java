package semana01;

public class AulaArray {
    public static void main(String[] args) {

        String[] nomes = new String[5];

        nomes[0] = "A";
        nomes[1] = "B";
        nomes[2] = "C";
        nomes[3] = "D";
        nomes[4] = "E";

//        System.out.println(nome[0]);

        for ( int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i] + " - com for normal");
        }

        for (String nome: nomes) {
            if ( nome.equalsIgnoreCase("C")) {
                System.out.println("C está na lista.");
            }
        }

        int n = 0;
        while (n < nomes.length){
            System.out.println(nomes[n] + " - com while");
            n++;
        }

        for (String nn : nomes){
            System.out.println(nn + " - com for melhorado");
        }

        int idades[] = {32, 22, 19, 44, 18};
    }
}
