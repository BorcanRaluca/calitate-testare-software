package ro.ase.cts.prototype.banca;

public interface Credit extends Cloneable {
    public void setSumaImprumut(float suma);
    public void showDetails();

    public Credit clone() throws CloneNotSupportedException;
}
