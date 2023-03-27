package cts.ase.factory.simple;

public class PizzaFactory {
    public static Pizza createPizza(PizzaType type) {
        switch (type) {
            case CHEESE:
                return new CheesePizza();
            case PEPPERONI:
                return new PepperoniPizza();
            case TUNA:
                return new TunaPizza();
        }
        return null;
    }
}
