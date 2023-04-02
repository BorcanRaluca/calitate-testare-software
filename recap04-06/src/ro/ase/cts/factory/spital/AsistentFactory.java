package ro.ase.cts.factory.spital;

public class AsistentFactory implements PersonalFactory {
    @Override
    public Personal createPersonal() {
        return new Asistent();
    }
}
