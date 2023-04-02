package ro.ase.cts.factory.spital;

public class BrancardierFactory implements PersonalFactory {

    @Override
    public Personal createPersonal() {
        return new Brancardier();
    }
}
