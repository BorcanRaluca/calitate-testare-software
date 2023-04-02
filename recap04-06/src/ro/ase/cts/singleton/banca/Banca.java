package ro.ase.cts.singleton.banca;

import ro.ase.cts.factory.banca.Client;
import ro.ase.cts.prototype.banca.Credit;

import java.util.ArrayList;
import java.util.List;

public class Banca {
    private static Banca instance = null;
    private List<Client> clienti = null;
    private List<Credit> credte = null;

    private Banca() {
        this.clienti = new ArrayList<>();
        this.credte = new ArrayList<>();
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

    public void addCredit(Credit credit) {
        this.credte.add(credit);
    }

    public void showClienti() {
        for(Client c: clienti) {
            c.showDetails();
        }
    }

    public void showCredite() {
        for(Credit c: credte) {
            c.showDetails();
        }
    }
}
