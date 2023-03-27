package cts.ase.factory.method;

public class FishFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Fish();
    }
}
