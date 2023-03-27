package cts.ase.factory.simple;

public abstract class Pizza {
    private float price;
    private float size;

    public Pizza() {
        this.price = 30.0f;
        this.size = 18.0f;
    }

    public Pizza(float price, float size) {
        this.price = price;
        this.size = size;
    }

    public abstract void cookPizza();
}
