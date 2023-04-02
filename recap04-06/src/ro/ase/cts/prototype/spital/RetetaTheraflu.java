package ro.ase.cts.prototype.spital;

public class RetetaTheraflu implements Reteta {
    private String substantaActiva;
    private int dozaj;
    @Override
    public void setSubstantaActiva(String substantaActiva) {
        this.substantaActiva = substantaActiva;
    }

    @Override
    public void setDozaj(int dozaj) {
        this.dozaj = dozaj;
    }

    @Override
    public void showDetails() {
        System.out.println("Reteta Theraflu: " + this.substantaActiva
                + " " + this.dozaj + "mg");
    }

    @Override
    public Reteta clone() throws CloneNotSupportedException {
        return (RetetaTheraflu) super.clone();
    }
}
