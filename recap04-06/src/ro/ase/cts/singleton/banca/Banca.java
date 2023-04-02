package ro.ase.cts.singleton.banca;

import ro.ase.cts.factory.banca.Client;

import java.util.ArrayList;
import java.util.List;

public class Banca {
    private static Banca instance = null;
    private List<Client> clienti = null;

    private Banca() {
        this.clienti = new ArrayList<>();
    }

    public static Banca getInstance() {
        if(Banca.instance == null) {
            Banca.instance = new Banca();
        }

        return Banca.instance;
    }

    public void addClient(Client client) {
        this.clienti.add(client);
    }

    public void showClienti() {
        for(Client c: clienti) {
            c.showDetails();
        }
    }
}
