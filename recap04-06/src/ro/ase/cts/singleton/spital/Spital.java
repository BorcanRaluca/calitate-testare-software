package ro.ase.cts.singleton.spital;

import ro.ase.cts.factory.spital.Personal;

import java.util.ArrayList;
import java.util.List;

public class Spital {
    private static Spital instance = null;

    List<Personal> listaPersonal = null;

    private Spital() {
        listaPersonal = new ArrayList<>();
    }

    public static Spital getInstance() {
        if(Spital.instance == null) {
            Spital.instance = new Spital();
        }
        return instance;
    }

    public void addPersonal(Personal personal) {
        this.listaPersonal.add(personal);
    }

    public void showPersonal() {
        for(Personal personal: listaPersonal) {
            personal.showDetails();
        }
    }
}
