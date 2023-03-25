package ro.ase.cts.solid;

public class Car {
    private Engine engine;

    public Car(Engine e) {
        engine = e;
    }

    public void start() {
        engine.start();
    }
}
