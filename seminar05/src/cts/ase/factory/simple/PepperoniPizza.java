package cts.ase.factory.simple;

public class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        super();
    }
    @Override
    public void cookPizza() {
        System.out.println("Cooking new Pepperoni Pizza...");
    }
}
