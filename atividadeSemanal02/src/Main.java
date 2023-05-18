import Entidades.Produtos;

public class Main {
    public static void main(String[] args) {

        Produtos tv = new Produtos("TV 55'", 1899.90, 6);
        Produtos microwave = new Produtos("Microwave 20L", 399.90, 15);
        Produtos refrigerator = new Produtos("Refrigerator FrostFree", 3499.90, 3);

        tv.addAmount(3);
        microwave.removeAmount(5);

        System.out.println("The " + refrigerator.getName() + " item has " + refrigerator.getAmount() + " units");

        System.out.println(tv);
        System.out.println(microwave);

    }
}