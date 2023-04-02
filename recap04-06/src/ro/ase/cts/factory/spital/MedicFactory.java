package ro.ase.cts.factory.spital;

public class MedicFactory implements PersonalFactory {
    @Override
    public Personal createPersonal() {
        return new Medic();
    }
}
