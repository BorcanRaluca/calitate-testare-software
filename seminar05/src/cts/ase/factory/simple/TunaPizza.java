package cts.ase.factory.simple;

public class TunaPizza extends Pizza {
    public TunaPizza() {
        super();
    }
    @Override
    public void cookPizza() {
        System.out.println("Cooking new Tuna Pizza...");
    }
}
