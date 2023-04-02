package ro.ase.cts.factory.banca;

public class PersoanaFizicaFactory implements ClientFactory {
    @Override
    public Client createClient() {
        return new PersoanaFizica();
    }
}
