package ro.ase.cts.factory.banca;

import ro.ase.cts.builder.banca.Cont;
import ro.ase.cts.builder.banca.ContBuilder;
import ro.ase.cts.builder.banca.ContSimpluBuilder;

public interface Client {
    public abstract void setNume(String nume);
    public abstract void showDetails();
}
