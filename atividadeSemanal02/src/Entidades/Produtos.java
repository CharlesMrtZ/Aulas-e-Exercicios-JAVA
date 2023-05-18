package Entidades;

public class Produtos {
    private String name;
    private double price;
    private int amount;

    public Produtos(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getAmount() {
        return amount;
    }


    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void addAmount(int add) {
        this.amount = this.amount + add;
    }
    public void removeAmount(int remove) {
        this.amount = this.amount - remove;
    }

    public double stock(){
        return this.amount * this.price;
    }

    @Override
    public String toString() {
        return name + ", R$" + price +
                ", " + amount +
                " unidades, Total: R$" + stock();
    }
}
