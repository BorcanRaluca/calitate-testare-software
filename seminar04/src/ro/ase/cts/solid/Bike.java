package ro.ase.cts.solid;

// este incalcat principiul 4: Interface Segregation Principle
// solutie: implementarea mai multor interfete
public class Bike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("driving...");
    }

    @Override
    public void stop() {
        System.out.println("stopping...");
    }

    @Override
    public void refuel() {
        // in cazul bicicletelor clasice nu poate fi implementata
    }

    @Override
    public void openDoors() {
        // bicicleta nu are usi
    }
}
