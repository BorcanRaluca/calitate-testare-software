package ro.ase.cts.builder.spital;

public class PacientStandard implements Pacient {
    private boolean patRabatabil;
    private boolean micDejun;
    private boolean papuci;
    private boolean halat;

    @Override
    public void setPatRabatabil(boolean eRabatabil) {
        this.patRabatabil = eRabatabil;
    }

    @Override
    public void setMicDejun(boolean eInclus) {
        this.micDejun = eInclus;
    }

    @Override
    public void setPapuci(boolean arePapuci) {
        this.papuci = arePapuci;
    }

    @Override
    public void setHalatInterior(boolean areHalat) {
        this.halat = areHalat;
    }

    @Override
    public void showDetails() {
        System.out.println("Pacientul are urmatoarele facilitati:");
        if (this.halat) {
            System.out.println(" - halat");
        }
        if (this.papuci) {
            System.out.println(" - papuci");
        }
        if (this.micDejun) {
            System.out.println(" - mic dejun");
        }
        if (this.patRabatabil) {
            System.out.println(" - pat rabatabil");
        }
    }
}
