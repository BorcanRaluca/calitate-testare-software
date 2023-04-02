package ro.ase.cts.prototype.spital;

public interface Reteta extends Cloneable {
    public void setSubstantaActiva(String substantaActiva);

    public void setDozaj(int dozaj);

    public void showDetails();

    public Reteta clone() throws CloneNotSupportedException;
}
