package cts.ase.factory.simple;

public class CheesePizza extends Pizza {
    public CheesePizza() {
        super();
    }
    @Override
    public void cookPizza() {
        System.out.println("Cooking new Cheese Pizza...");
    }
}
