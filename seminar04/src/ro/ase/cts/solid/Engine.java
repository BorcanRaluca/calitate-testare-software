package ro.ase.cts.solid;

// vrem sa adaugam 2 clase: PetrolEngine si DieselEngine
// trebuie sa redenumim tot in Car => se incalca principiul
// 5 Dependency Inversion Principle
// solutie: Engine devine interfata, in car Engine va fi interface to type
public interface Engine {
    public void start();
}

