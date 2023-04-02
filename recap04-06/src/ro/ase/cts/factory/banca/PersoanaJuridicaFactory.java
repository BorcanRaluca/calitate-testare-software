package ro.ase.cts.factory.banca;

public class PersoanaJuridicaFactory implements ClientFactory {
    @Override
    public Client createClient() {
        return new PersoanaJuridica();
    }
}
